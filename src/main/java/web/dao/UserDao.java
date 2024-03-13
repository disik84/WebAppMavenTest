package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.transaction.Transactional;

@Repository
public class UserDao {

    SessionFactory sessionFactory;

    public UserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void addUser(User user) {
        System.out.println("addUser");
        sessionFactory.getSessionFactory().getCurrentSession().save(user);
    }
}
