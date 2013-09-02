package net.therap.sleeptracker.Dao;

import net.therap.sleeptracker.domain.Record;
import net.therap.sleeptracker.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/1/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class RecordDaoImpl implements RecordDao{

    @PersistenceContext
    EntityManager entityManager;
    Logger logger = LoggerFactory.getLogger(RecordDaoImpl.class);
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveRecord(long userId, Record record) {


        User user = entityManager.find(User.class,userId);
        record.setUser(user);
        List<Record> recordList;
        if(user.getRecordList().size()==0) {
            recordList = new ArrayList<Record>();
        }
        else {
            recordList = user.getRecordList();
        }

        recordList.add(record);
        user.setRecordList(recordList);
        logger.info("insertRecord: " + record);
        logger.info("insertRecord: " + user);
        entityManager.persist(record);

        /*entityManager.merge(user);*/
    }

    @Override

    public List<Record> getRecordsBy(long userId) {

        User user = entityManager.find(User.class,userId);

        List<Record> records =(List<Record>) entityManager.createQuery("SELECT record FROM Record record WHERE record.user =:user ORDER BY record.startTime DESC")
                .setParameter("user",user)
                .getResultList();

        return records;
    }


}
