package Controllers;

import DbConnect.HibernateUtil;
import Entities.BenevoleEntity;
import Entities.UserEntity;
import org.hibernate.Session;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@ManagedBean
@SessionScoped

public class Benevole {


    private UserEntity userEntity ;
    private BenevoleEntity benevoleEntity ;
    @PostConstruct
    public void init() {
        userEntity = new UserEntity();
        benevoleEntity = new BenevoleEntity();
    }
//    public Benevole() {
//    }
//
//    public Benevole(UserEntity userEntity, BenevoleEntity benevoleEntity) {
//        this.userEntity = userEntity;
//        this.benevoleEntity = benevoleEntity;
//    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public BenevoleEntity getBenevoleEntity() {
        return benevoleEntity;
    }

    public void setBenevoleEntity(BenevoleEntity benevoleEntity) {
        this.benevoleEntity = benevoleEntity;
    }


    public boolean Confirmer(){ // returns true or false depending on the existance of the user
        boolean conf = false;
        Session session = HibernateUtil.getSession();
        List<UserEntity> users = (List<UserEntity>) session.createQuery("from UserEntity where usernameUser = '"+userEntity.getUsernameUser()+"' and passwordUser = '"+userEntity.getPasswordUser()+"'").getResultList();
//        UserEntity userEntity = new UserEntity();
//        userEntity.setUsernameUser(usernameUser);
//        userEntity.setPasswordUser(passwordUser);
//        Transaction tx = session.getTransaction();
//        tx.begin();
//        session.saveOrUpdate(userEntity);
//        tx.commit();

        if (users.size()!=0){
            benevoleEntity = BenevoleEntity.getBenevole(users.get(0).getIdUser());
            conf =true;
        }



        return conf;


    }

    public String getImage() {

        return benevoleEntity.getImage(benevoleEntity);
//        try{
//            FileOutputStream fos = new FileOutputStream("../webapp/images/test/test.png");
//            fos.write(book.getImageOffre());
//            fos.close();
//        }catch(Exception e){
//            System.out.println("laaaaaaaa");
//            e.printStackTrace();
//        }

    }

    public String logout(){
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ec = context.getExternalContext();

        final HttpServletRequest request = (HttpServletRequest)ec.getRequest();
        request.getSession( false ).invalidate();


        return "logout";
    }


}
