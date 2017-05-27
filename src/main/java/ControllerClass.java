/**
 * @author Donovan Poland on 5/26/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class ControllerClass {

    @RequestMapping("/")
    public String root(Model model) {
        return "MainMenu";
    }
}
