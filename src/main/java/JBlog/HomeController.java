package JBlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    /**
     * Selects the home page and populates the model with a message
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info("Welcome home!");
        model.addAttribute("controllerMessage",
                "This is the message from the controller!");
        return "main";
    }

    @RequestMapping(value = "/main/{user_id}", method = RequestMethod.GET)
    public String main(@PathVariable String user_id, @RequestParam(value = "nick", required = false) String nick, Model model) {
        logger.info("Welcome to main!" + user_id);

        model.addAttribute("controllerMessage", "This is spring/main shit! | " + user_id + nick);
        return "home";
    }

    @RequestMapping(value = "/zhopa", method = RequestMethod.GET)
    public String zhopa(Model model) {
        logger.info("Welcome home!");
        model.addAttribute("controllerMessage",
                "ТОБі тупо срака");
        return "main";
    }


}
