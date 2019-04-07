package DbConnect;

import Entities.AvoirEntity;
import Entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class App {

    public static void main (String...args){

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        String hql = "SELECT E.usernameUser FROM UserEntity E";
        Query query = session.createQuery(hql);
        List results = query.list();

        System.out.println(results.get(0));

//
//        UserEntity book = new UserEntity();
//        book.setIdUser(1);
//        book.setUsernameUser("root");
//        book.setPasswordUser("root");
//
//        session.update(book);
//        tx.commit();
//
//        session.close();
//        HibernateUtil.shutdown();
    }
}
