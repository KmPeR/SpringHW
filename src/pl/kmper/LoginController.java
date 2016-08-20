package pl.kmper;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController
{

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView viewLogin()
	{
		ModelAndView model = new ModelAndView("Login");
		User user = new User();
		model.addObject("userForm",  user);
		
		return model;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("userForm") User user, BindingResult result)
	{
		ModelAndView model = new ModelAndView("Login");
		model.addObject("username",  user.getUsername());
		
		return model;
	}
	
}
