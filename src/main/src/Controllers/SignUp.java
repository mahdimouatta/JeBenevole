package Controllers;

import DbConnect.HibernateUtil;
import Entities.BenevoleEntity;
import Entities.NationnaliteEntity;
import Entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.faces.bean.ManagedBean;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

@ManagedBean

public class SignUp {

    private int idUser;
    private String usernameUser;
    private String passwordUser1;
    private String passwordUser2;
    private String nomB;
    private String prenomB;
    private String nTeleB;
    private String emailB;



    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    public String getPasswordUser1() {
        return passwordUser1;
    }

    public void setPasswordUser1(String passwordUser1) {
        this.passwordUser1 = passwordUser1;
    }

    public String getPasswordUser2() {
        return passwordUser2;
    }

    public void setPasswordUser2(String passwordUser2) {
        this.passwordUser2 = passwordUser2;
    }

    public String getNomB() {
        return nomB;
    }

    public void setNomB(String nomB) {
        this.nomB = nomB;
    }

    public String getPrenomB() {
        return prenomB;
    }

    public void setPrenomB(String prenomB) {
        this.prenomB = prenomB;
    }

    public String getnTeleB() {
        return nTeleB;
    }

    public void setnTeleB(String nTeleB) {
        this.nTeleB = nTeleB;
    }

    public String getEmailB() {
        return emailB;
    }

    public void setEmailB(String emailB) {
        this.emailB = emailB;
    }


    public boolean mmPass(){
        return (passwordUser1.equals(passwordUser2));
    }

    public boolean existUser(){
        boolean exist = false;
        Session session = HibernateUtil.getSession();
        List<UserEntity> users = (List<UserEntity>) session.createQuery("from UserEntity where usernameUser = '"+usernameUser+"'").getResultList();
        if (users.size()!=0){
            exist =true;
        }



        return exist;
    }


    public String createBenevole() {
        if (mmPass() && !existUser()) {


            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            UserEntity user = new UserEntity();
            BenevoleEntity benevole = new BenevoleEntity();
            NationnaliteEntity nationnalite = new NationnaliteEntity();
//            nationnalite.setIdNat(5);
            user.setIdUser(10);
            user.setPasswordUser(passwordUser1);
            user.setUsernameUser(usernameUser);
            benevole.setIdUser(10);
            benevole.setIdNat(5);
            benevole.setEmailB(emailB);
            benevole.setnTeleB(nTeleB);
            benevole.setNomB(nomB);
            benevole.setPrenomB(prenomB);

//            session.save(nationnalite);
            session.save(user);
            session.save(benevole);
            session.getTransaction().commit();
            return "done";
        }
        return "failed";
    }
}
