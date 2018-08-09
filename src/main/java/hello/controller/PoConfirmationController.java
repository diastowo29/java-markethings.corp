package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.model.ProjectOrder;
import hello.repo.ProjectOrderRepository;

@Controller
public class PoConfirmationController {

	@Autowired
	ProjectOrderRepository poRepo;

	@RequestMapping("/po-confirm")
	public String PoConfirm() {
		for (ProjectOrder po : poRepo.findAll()) {
			System.out.println(po.getProjectId());
		}
		return "po-confirm";
	}
}
