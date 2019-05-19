package Controllers;

import Beans.Offre;
import DbConnect.HibernateUtil;
import Entities.AssociationEntity;
import Entities.ExigenceEntity;
import Entities.ExigerEntity;
import Entities.OffreEntity;
import org.hibernate.Session;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped

public class Offers {
    List<Offre> offres = new ArrayList<>();

    @PostConstruct
    public void init() {
        offres = Offers();
    }


    public List<Offre> getOffres() {
        return offres;
    }

    public void setOffres(List<Offre> offres) {
        this.offres = offres;
    }

    // return a list of all the existent offers


    public List<Offre> Offers() {
        Session session = HibernateUtil.getSession();
        List<OffreEntity> offers = session.createQuery("from OffreEntity ").getResultList();    // tous les offres
        List<AssociationEntity> associations = new ArrayList<>();   //tous les ass
        List<List<ExigerEntity>> exiger = new ArrayList<>();

        for (OffreEntity o : offers) {
            int id_ass = o.getIdUser();
            int id_off = o.getIdOffre();
            associations.add((AssociationEntity) session.createQuery("from AssociationEntity where idUser =" + id_ass + " ").getResultList().get(0));
            exiger.add(session.createQuery("from ExigerEntity where idOffre =" + id_off + " ").getResultList());

        }


        List<List<ExigenceEntity>> exigences = new ArrayList<>();   //tous ls exigences
        List<ExigenceEntity> exigencesoff = new ArrayList<>();

        for (List<ExigerEntity> e : exiger) {
            exigencesoff.clear();
            for (ExigerEntity ex : e) {
                int id_ex = ex.getIdEx();
                exigencesoff.add((ExigenceEntity) session.createQuery("from ExigenceEntity where idEx =" + id_ex + " ").getResultList().get(0));
            }
            exigences.add(exigencesoff);
        }
        int a = 0;
        List<Offre> list =new ArrayList<>();

        for (OffreEntity o : offers) {
            list.add(new Offre(o, associations.get(a), exigences.get(a)));
            a++;
        }
        return list;
    }


    public List<String> getImages() {
        List<String> images = new ArrayList<>();
        for (Offre o : offres) {
            images.add(o.getOffreEntity().getImage(o.getOffreEntity()));
        }
        return images;
    }

    }

