package net.therap.sleeptracker.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/1/13
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */

@Table(name = "sleeping_records")
@Entity
public class Record implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long recordId;

    @ManyToOne(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable=false, updatable=false, referencedColumnName = "userId")
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_time")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date startTime;



    @Temporal(TemporalType.TIME)
    @Column(name = "duration")
    @DateTimeFormat(pattern = "HH:mm")
    private Date duration;


    @Column(name = "nightmare")
    private String nightmare;
    @Column(name = "sleeping_break")
    private String sleepingBreak;



    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getNightmare() {
        return nightmare;
    }

    public void setNightmare(String nightmare) {
        this.nightmare = nightmare;
    }

    public String getSleepingBreak() {
        return sleepingBreak;
    }

    public void setSleepingBreak(String sleepingBreak) {
        this.sleepingBreak = sleepingBreak;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", user=" + user +
                ", startTime=" + startTime +
                ", duration=" + duration +
                ", nightmare='" + nightmare + '\'' +
                ", sleepingBreak='" + sleepingBreak + '\'' +
                '}';
    }
}
