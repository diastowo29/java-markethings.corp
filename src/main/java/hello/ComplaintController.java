package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComplaintController {
	
	@RequestMapping("/complaint")
	public String Complaint () {
		return "complaint";
	}
}
