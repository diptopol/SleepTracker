package net.therap.sleeptracker.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/29/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */

@Table(name = "users")
@Entity
public class User implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "username")
    private String username;

    @Column( name = "password")
    private String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
