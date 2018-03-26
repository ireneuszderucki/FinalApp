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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ireneuszderucki.beans.ContractTypeService;
import pl.ireneuszderucki.beans.LocationService;
import pl.ireneuszderucki.beans.NoValidationJobOfferGroup;
import pl.ireneuszderucki.beans.RetrieveUsername;
import pl.ireneuszderucki.entity.Company;
import pl.ireneuszderucki.entity.JobOffer;
import pl.ireneuszderucki.entity.User;
import pl.ireneuszderucki.repository.CompanyRepository;
import pl.ireneuszderucki.repository.JobOfferRepository;
import pl.ireneuszderucki.repository.UserRepository;

@Controller
@RequestMapping("/offers")
public class JobOfferController {
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private ContractTypeService contractTypeService;
	
	@Autowired
	private RetrieveUsername usernameService;
	
	
	@ModelAttribute("companies")
	private List<Company> allCompanies() {
		List<Company> companies = new ArrayList<>();
		companies = companyRepository.findAll();
		return companies;
	}
	
	@ModelAttribute("contractTypes")
	private List<String> contractTypes() {
		List<String> contractTypes = contractTypeService.getContractTypes();
		return contractTypes;
	}
	
	@ModelAttribute("locations")
	private List<String> locations() {
		List<String> locations = locationService.getLocations();
		return locations;
	}
	
	
	@GetMapping("/add")
	private String addOffer(Model model) {
		JobOffer jobOffer = new JobOffer();
		model.addAttribute("jobOffer", jobOffer);
		Company company = new Company();
		model.addAttribute("company", company);
		return "offer/addOrSelect";
	}
	
	@PostMapping("/addNow")
	private String addNowOffer(Model model, @Validated({NoValidationJobOfferGroup.class}) JobOffer jobOffer) {
		model.addAttribute("jobOffer", jobOffer);
		return "offer/add";
	}
	
	@PostMapping("/addNowAndCompany")
	private String addNowOfferAndCompany(Model model, @Valid Company company, BindingResult bresult) {
		if(bresult.hasErrors()) {
			return null;
		}
		companyRepository.saveAndFlush(company);
		String companyName = company.getName();
		Company companyTemp = companyRepository.findByName(companyName);
		JobOffer jobOffer = new JobOffer();
		jobOffer.setCompany(companyTemp);
		model.addAttribute("jobOffer", jobOffer);
		return "offer/add";
	}
	
	
	@GetMapping("/addNow")
	private String addNowOfferGet(Model model) {
		JobOffer jobOffer = new JobOffer();
		model.addAttribute("jobOffer", jobOffer);
		return "offer/add";
	}
	
	@GetMapping("/yourOffers")
	private String showOffers(Model model) {
		List<JobOffer> offers = jobOfferRepository.findByUserUsername(usernameService.getUserUsername());
		model.addAttribute("offers", offers);
		return "offer/list";
		
	}
	
	@PostMapping("/add")
	private String processForm(@Valid JobOffer jobOffer, BindingResult bresult) {
		if(bresult.hasErrors()) {
			return null;
		}
		User user = userRepository.findByUsername(usernameService.getUserUsername());
		jobOffer.setUser(user);
		jobOfferRepository.save(jobOffer);
		return "redirect:/offers/yourOffers";
		
	}
	
	@GetMapping("/details/{id}")
	private String goToOfferDetails(Model model, @PathVariable long id) {
		JobOffer offer = jobOfferRepository.findOne(id);
		model.addAttribute("offer", offer);
		return "offer/details";
	}
	
	@GetMapping("/delete/{id}")
	private String delteOfferConfirmation(Model model, @PathVariable long id) {
		JobOffer jobOffer = jobOfferRepository.findOne(id);
		model.addAttribute("jobOffer", jobOffer);
		return "offer/delete";
	}
	
	@GetMapping("/delete/yes/{id}")
	private String deleteOffer(@PathVariable long id) {
		jobOfferRepository.delete(id);
		return "redirect:/offers/yourOffers";
	}
	
	@GetMapping("/edit/{id}")
	private String editOffer(Model model, @PathVariable long id) {
		JobOffer jobOffer = jobOfferRepository.findOne(id);
		model.addAttribute("jobOffer", jobOffer);
		return "offer/edit";
	}
	

}
