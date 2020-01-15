package be.lens.spring.baeldung_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/addition")
public class AdditionController {
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView addNumbers(@RequestParam("first_number") int num1,@RequestParam("second_number") int num2){
        return new ModelAndView("additionPage","additionresult",num1 + num2);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayForm(){
        return "additionPage";
    }

    /*@RequestMapping(method = RequestMethod.GET)
    public ModelAndView addAndOrDisplayForm(@RequestParam(value="first_number",required = false) String num1,@RequestParam(value="second_number",required = false) String num2){
        if((null == num1 || null == num2) || (("").equals(num1) || (("").equals(num2)))){
            return new ModelAndView("additionPage");
        }else{
            int rez = Integer.parseInt(num1) + Integer.parseInt(num2);
            return new ModelAndView("additionPage","additionresult",rez);
        }

    }*/
}
