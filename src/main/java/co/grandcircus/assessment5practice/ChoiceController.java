package co.grandcircus.assessment5practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ChoiceController {
		// path of request
	
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:choice";
	}
	
	
		@RequestMapping("/choice")
		public String formPage() {
			return "enterchoice";
		}
		
		// /result?first=David&last=Wolv
		
		@PostMapping("/choice")
		public String choicePage(
				//whatever we declare in the parenthesis is the value we are trying to pass to the RequestParam
				//was trying to pass value and it would return null because value needed to be passed to the string. 
				//second @RequestParam demonstrates the wrong way to do it. Same thing with the submit button make sure it doesnt have a value
				// each submit format has a unique interelational structure dependent upon the values you are seeking. 
				@RequestParam(name = "door",required=false, defaultValue = "test") String Door,
				//@RequestParam(value="Door#2",required=false, defaultValue = "test") String Door2, 
				Model model) {
			System.out.println(Door);
			String result = null;
			if (Door.equals("Door#1")) {
			 result = "door1";}
			else if (Door.equals("Door#2")) {
				result = "door2";
			}else {result = "/";}
			return result;
		}
		
		

	}
