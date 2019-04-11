package Beans;

import Controllers.Login;
import DbConnect.HibernateUtil;
import Entities.AdministrateurEntity;
import Entities.BenevoleEntity;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.io.Serializable;


@Named
@Scope("session")
public class User implements Serializable {


    private String usernameUser;
    private String passwordUser;


    public String type(){ // returns the user type (benevole / association / admin)

        Session session = HibernateUtil.getSession();
        System.out.println(usernameUser);
        System.out.println(passwordUser);

        AdministrateurEntity administrateurEntity = session.get(AdministrateurEntity.class, Login.getUserId(usernameUser,passwordUser));

        if (administrateurEntity != null) return "admin";
        else {
            BenevoleEntity benevoleEntity = session.get(BenevoleEntity.class,Login.getUserId(usernameUser,passwordUser));
            if (benevoleEntity != null) return "benevole";
            else return "association";
        }

    }




    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
}
