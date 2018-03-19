package pl.ireneuszderucki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ireneuszderucki.beans.RetrieveUsername;
import pl.ireneuszderucki.entity.Company;
import pl.ireneuszderucki.entity.JobOffer;
import pl.ireneuszderucki.entity.User;
import pl.ireneuszderucki.repository.CompanyRepository;
import pl.ireneuszderucki.repository.JobOfferRepository;
import pl.ireneuszderucki.repository.UserRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	
	@Autowired
	private RetrieveUsername usernameService;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@ModelAttribute("user")
	private User user() {
		User user = userRepository.findByUsername(usernameService.getUserUsername());
		return user;
	}
	
	@ModelAttribute("offers")
	private List<JobOffer> offers(){
		List<JobOffer> offers = jobOfferRepository.findByUserUsername(usernameService.getUserUsername());
		return offers;
	}
	
	@ModelAttribute("companies")
	private List<Company> companies(){
		List<Company> companies = companyRepository.searchUsername(usernameService.getUserUsername());
		return companies;
	}

	@GetMapping("/hello")
	private String goHello(Model model) {
		return "home/main";
	}
}
