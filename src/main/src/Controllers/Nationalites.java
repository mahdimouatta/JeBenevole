package Controllers;

import DbConnect.HibernateUtil;
import Entities.NationnaliteEntity;
import org.hibernate.Session;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@ApplicationScoped

public class Nationalites {
    public List<NationnaliteEntity> getNationnaliteEntities() {
        return nationnaliteEntities;
    }

    public void setNationnaliteEntities(List<NationnaliteEntity> nationnaliteEntities) {
        this.nationnaliteEntities = nationnaliteEntities;
    }

    List<NationnaliteEntity> nationnaliteEntities ;

    @PostConstruct
    public void init() {
        Session session = HibernateUtil.getSession();
        nationnaliteEntities = session.createQuery("from NationnaliteEntity ").getResultList();
    }



}

