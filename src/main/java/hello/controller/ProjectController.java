package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.repo.ProjectRepository;

@Controller
public class ProjectController {

	@Autowired
	ProjectRepository projectRepo;

	@RequestMapping("/project")
	public String Project() {
		for (hello.model.Project project : projectRepo.findAll()) {
			System.out.println(project.getTitle());
		}
		return "project";
	}
}
