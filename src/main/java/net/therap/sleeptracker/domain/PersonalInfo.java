package net.therap.sleeptracker.domain;

import javax.persistence.Embeddable;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/2/13
 * Time: 6:13 AM
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
public class PersonalInfo {

    private String name;
    private String email;
    private String mobileNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
