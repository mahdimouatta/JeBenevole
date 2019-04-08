package Controllers;

import DbConnect.HibernateUtil;
import Entities.OffreEntity;
import org.hibernate.Session;

import java.util.List;

public class OffresExtract { // return a list of all the existent offers


    public static List<OffreEntity> getOffres(){
        Session session = HibernateUtil.getSession();
        List<OffreEntity> offres = session.createQuery("from OffreEntity ").getResultList();
        return offres;
    }



    public static List<OffreEntity> getAdresseOffres(String adr){
        Session session = HibernateUtil.getSession();
        List<OffreEntity> offres = session.createQuery("from OffreEntity where adresseOffre ='"+adr+"'").getResultList();
        return offres;
    }



    public static List<OffreEntity> getAssOffres(int id){ // returns the offers of the association with the id given
        Session session = HibernateUtil.getSession();
        List<OffreEntity> offres = session.createQuery("from OffreEntity where idUser ="+id+"").getResultList();
        return offres;
    }


    public static OffreEntity getOffre(int id){ // get the offer with the id given
        Session session = HibernateUtil.getSession();
        OffreEntity offres = (OffreEntity) session.createQuery("from OffreEntity where id ="+ id +"").getResultList().get(0);
        return offres;
    }

}
