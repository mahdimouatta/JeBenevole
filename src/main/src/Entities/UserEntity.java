package Entities;

import Controllers.Benevole;
import Controllers.Login;
import DbConnect.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "user", schema = "jees4", catalog = "")
public class UserEntity {
    private int idUser;
    private String usernameUser;
    private String passwordUser;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "username_user")
    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    @Basic
    @Column(name = "password_user")
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (usernameUser != null ? !usernameUser.equals(that.usernameUser) : that.usernameUser != null) return false;
        if (passwordUser != null ? !passwordUser.equals(that.passwordUser) : that.passwordUser != null) return false;

        return true;
    }

//    public boolean Confirmer(){ // returns true or false depending on the existance of the user
//        boolean conf = false;
//        Session session = HibernateUtil.getSession();
//        List<UserEntity> users = (List<UserEntity>) session.createQuery("from UserEntity where usernameUser = '"+usernameUser+"' and passwordUser = '"+passwordUser+"'").getResultList();
////        UserEntity userEntity = new UserEntity();
////        userEntity.setUsernameUser(usernameUser);
////        userEntity.setPasswordUser(passwordUser);
////        Transaction tx = session.getTransaction();
////        tx.begin();
////        session.saveOrUpdate(userEntity);
////        tx.commit();
//        BenevoleEntity benevoleEntity = BenevoleEntity.getBenevole(users.get(0).getIdUser());
//        if (users.size()!=0){
//            Benevole benevole = new Benevole(users.get(1),benevoleEntity);
//            conf =true;
//        }
//
//
//
//        return conf;
//
//
//    }


    public boolean VerifierExistance(){
        boolean exist = false;
        Session session = HibernateUtil.getSession();
        List<UserEntity> users = (List<UserEntity>) session.createQuery("from UserEntity where usernameUser = '"+usernameUser+"'").getResultList();
        if (users.size()!=0){
            exist =true;
        }



        return exist;
    }


    public String userType(){

        return Login.type(usernameUser,passwordUser);// returns admin / benevole / association


    }




    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (usernameUser != null ? usernameUser.hashCode() : 0);
        result = 31 * result + (passwordUser != null ? passwordUser.hashCode() : 0);
        return result;
    }
}
