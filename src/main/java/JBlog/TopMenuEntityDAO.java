package JBlog;

import org.hibernate.SessionFactory;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 23.10.12
 * Time: 1:01
 * To change this template use File | Settings | File Templates.
 */
public class TopMenuEntityDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveMenuItem(TopMenuEntity menuEntity) {
        sessionFactory.getCurrentSession().persist(menuEntity);
    }
}
