package guru.springframework.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokesController {

	private final JokeService jokeSevice;

	public JokesController(JokeService jokeSevice) {
		super();
		this.jokeSevice = jokeSevice;
	}
	@RequestMapping({"","/"})
	public String showJoke(Model model)
	{
		model.addAttribute("joke",jokeSevice.getJoke());
		return "index";
	}
	
}
