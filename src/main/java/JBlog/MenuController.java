package JBlog;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 22.10.12
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/uiBuilder/menu")
public class MenuController {
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    @RequestMapping("/topMenu")
    public String home(Model model) {
        logger.info("Building menu");
        MenuContainer menuContainer = new MenuContainer();
        menuContainer.addMenuItem("Join!","join_us/");
        menuContainer.addMenuItem("Help","help/");
        menuContainer.addMenuItem("Search","search/");
        model.addAttribute("menuItems",menuContainer.getMenuItems());
        return "top_menu";
    }
}
