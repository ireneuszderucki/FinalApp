package pl.ireneuszderucki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.ireneuszderucki.beans.RetrieveUsername;
import pl.ireneuszderucki.entity.User;
import pl.ireneuszderucki.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RetrieveUsername usernameService;
	
	@GetMapping("/user")
	private String goToUserProfile(Model model) {
		User user = userRepository.findByUsername(usernameService.getUserUsername());
		model.addAttribute("user", user);
		return "user/profile";
	}
}
