package DbConnect;

import Beans.Offre;
import Controllers.Login;
//import Controllers.OffresExtract;
import Controllers.Offers;
import Entities.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class App {

    public static void main (String...args){

//        String a;
//        a = Login.type("mahdi","root");
//        System.out.println(a);
//

//        System.out.println(Login.getUserId("mahdi","root"));

//        Offre offre = new Offre(2);
//        System.out.println(Login.Confirmer());
//        System.out.println(OffresExtract.getAdresse(1));
//        Session session = HibernateUtil.getSession();
//        Transaction tx = session.beginTransaction();
//        UserEntity user = new UserEntity();
//        BenevoleEntity benevole = new BenevoleEntity();
//        NationnaliteEntity nationnalite = new NationnaliteEntity();
//        nationnalite.setIdNat(5);
//        user.setIdUser(5);
//        user.setPasswordUser("azertyuiop0-");
//        user.setUsernameUser("root");
//        benevole.setIdUser(5);
//        benevole.setIdNat(5);
//
//        session.save(nationnalite);
//        session.save(user);
//        session.save(benevole);
//        session.getTransaction().commit();


//        String hql = "SELECT E.usernameUser FROM UserEntity E";
//        Query query = session.createQuery(hql);
//        List results = query.list();
//
//        System.out.println(results.get(0));

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





        Offers offers = new Offers();

        String a = offers.getImages().get(0);
        System.out.println(a);
    }
}
