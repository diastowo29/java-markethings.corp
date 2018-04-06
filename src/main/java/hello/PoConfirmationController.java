package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PoConfirmationController {
	
	@RequestMapping("/po-confirm")
	public String PoConfirm () {
		return "po-confirm";
	}
}
