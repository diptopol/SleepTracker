package net.therap.sleeptracker.Dao;

import net.therap.sleeptracker.domain.User;


/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/29/13
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao{


    public User findUserBy(String username, String password);
    public User findUserBy(long  userId);


}
