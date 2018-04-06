package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewProjectController {
	
	@RequestMapping("/new-project")
	public String newProject () {
		return "new-project.html";
	}
}