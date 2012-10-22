package JBlog;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 22.10.12
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */

public interface MenuItem {

    public String getCaption();
    public void setCaption(String caption);

    public String getHref();
    public void setHref(String href);
}
