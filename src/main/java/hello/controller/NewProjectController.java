package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new-project")
public class NewProjectController {

	@RequestMapping("")
	public String newProject() {
		return "new-project.html";
	}

	@RequestMapping("/insert")
	public String newInsert() {
		return "";
	}
}