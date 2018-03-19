package pl.ireneuszderucki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ireneuszderucki.entity.Event;
import pl.ireneuszderucki.repository.EventRepository;

@Controller
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/add")
	private String addEvent(Model model) {
		Event event = new Event();
		model.addAttribute("event", event);
		return "event/add";
	}
	
	
}
