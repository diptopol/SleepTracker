package net.therap.sleeptracker.Dao;

import net.therap.sleeptracker.domain.Record;
import net.therap.sleeptracker.domain.User;


import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/1/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public interface RecordDao {

    public List<Record> getRecordsBy(long userId);
    public void saveRecord(long userId,Record record);

}
