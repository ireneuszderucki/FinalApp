package pl.ireneuszderucki.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ireneuszderucki.entity.Company;
import pl.ireneuszderucki.entity.User;
import pl.ireneuszderucki.repository.CompanyRepository;
import pl.ireneuszderucki.repository.UserRepository;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@ModelAttribute("users")
	public List<User> allUsers() {
		List<User> users = new ArrayList<>();
		users = userRepository.findAll();
		return users;
	}

	@GetMapping("/add")
	private String addCompany(Model model) {
		Company company = new Company();
		model.addAttribute("company", company);
		return "company/add";
	}
	
	@PostMapping("/add")
	private String proccessForm(@Valid Company company, BindingResult bresult) {
		if(bresult.hasErrors()) {
			return "company/add";
		}
		companyRepository.save(company);
		return "redirect:/offers/addNow";
	}
	
	@GetMapping("/list")
	private String listCompany(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();
            List<Company> companies = companyRepository.searchUsername(currentUserName);
    		model.addAttribute("companies", companies);
    		return "company/list";
        }
        return null;
	}
}
