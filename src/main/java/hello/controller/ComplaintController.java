package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.repo.ComplaintRepository;

@Controller
public class ComplaintController {

	@Autowired
	ComplaintRepository complaintRepo;

	@RequestMapping("/complaint")
	public String Complaint(Model model) {

		for (hello.model.Complaint complaint : complaintRepo.findAll()) {
			System.out.println(complaint.getTitle());
		}

		return "complaint";
	}
}
