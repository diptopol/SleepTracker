package net.therap.sleeptracker.Dao;

import net.therap.sleeptracker.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/29/13
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User findUserBy(String username, String password) {

       try {
           User user =  (User)entityManager.createQuery("SELECT user FROM User user where user.username=:name and user.password=:password")
                   .setParameter("name",username)
                   .setParameter("password", password)
                   .getSingleResult();
           return user;
       }
       catch (NoResultException noResult)  {
           return null;
       }

    }

    @Override
    public User findUserBy(long userId) {

        User user;
        try {
            user =  (User) entityManager.createQuery("SELECT user FROM User user where user.userId=:id")
                    .setParameter("id",userId)
                    .getSingleResult();

        }
        catch (NoResultException noResult) {
            return null;
        }
        return user;

    }
}
