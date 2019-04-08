package Controllers;

import DbConnect.HibernateUtil;
import Entities.AdministrateurEntity;
import Entities.AssociationEntity;
import Entities.BenevoleEntity;
import Entities.UserEntity;
import org.hibernate.Session;

import java.util.List;

public class Login {


    public static int getUserId(String username,String... pass){ // returns the user id by givving the username and the pass or just the username
        Session session = HibernateUtil.getSession();
        UserEntity user;
        int id = 0;
        System.out.println("pass : " + pass.length);
        if (pass.length != 0) {
            System.out.println();
            user = (UserEntity) session.createQuery("from UserEntity where usernameUser = '" + username + "' and passwordUser ='" + pass[0] + "'").getResultList().get(0);
            id = user.getIdUser();
        }else {
            user = (UserEntity) session.createQuery("from UserEntity where usernameUser = '" + username + "'").getResultList().get(0);
            id=user.getIdUser();
        }

        return id;

    }

    


    public static boolean Confirmer(String username,String pass){ // returns true or false depending on the existance of the user
        boolean conf = false;
        Session session = HibernateUtil.getSession();
        UserEntity user = (UserEntity) session.createQuery("from UserEntity where usernameUser = '"+username+"' and passwordUser ='"+pass+"'").getResultList().get(0);


        if (user != null) conf =true;


        return conf;


    }


    public static String type(String username,String pass){ // returns the user type (benevole / association / admin)

        Session session = HibernateUtil.getSession();

        AdministrateurEntity administrateurEntity = session.get(AdministrateurEntity.class,getUserId(username,pass));

        if (administrateurEntity != null) return "admin";
        else {
            BenevoleEntity benevoleEntity = session.get(BenevoleEntity.class,getUserId(username,pass));
            if (benevoleEntity != null) return "benevole";
            else return "association";
        }

    }

}
