package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.IAuthorRepository;

@Controller
public class AuthorController {

	IAuthorRepository authorRepository;

	public AuthorController(IAuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAllAuthor(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "Authors";
	}
}
