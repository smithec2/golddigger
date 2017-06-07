package GoldDigger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * access different pages of website via RequestMapping
 * @author Donovan Poland on 5/26/2017.
 */

@Controller
public class ControllerClass {

    @RequestMapping("/")
    public String root(Model model) {
        return "MainMenu";
    }//go to root or start page: MainMenu.html
}//end ControllerClass
