package JBlog;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 23.10.12
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "top_menu", schema = "", catalog = "jblog")
@Entity
public class TopMenuEntity implements MenuItem {
    private int topMenuId;

    @javax.persistence.Column(name = "top_menu_id")
    @Id
    public int getTopMenuId() {
        return topMenuId;
    }

    public void setTopMenuId(int topMenuId) {
        this.topMenuId = topMenuId;
    }

    private String caption;

    @javax.persistence.Column(name = "caption")
    @Basic
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private String href;

    @javax.persistence.Column(name = "href")
    @Basic
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopMenuEntity that = (TopMenuEntity) o;

        if (topMenuId != that.topMenuId) return false;
        if (caption != null ? !caption.equals(that.caption) : that.caption != null) return false;
        if (href != null ? !href.equals(that.href) : that.href != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topMenuId;
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (href != null ? href.hashCode() : 0);
        return result;
    }
}
