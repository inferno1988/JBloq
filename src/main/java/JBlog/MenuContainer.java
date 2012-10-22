package JBlog;

import org.hibernate.SessionFactory;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 22.10.12
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class MenuContainer {
    private ArrayList<MenuItem> menuItems;

    MenuContainer() {
        menuItems = new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void addMenuItem(String caption, String link) {
        MenuItem menuItem = new TopMenuEntity();
        menuItem.setCaption(caption);
        menuItem.setHref(link);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
