package Beans;

//import Controllers.OffresExtract;
import Entities.AssociationEntity;
import Entities.ExigenceEntity;
import Entities.ExigerEntity;
import Entities.OffreEntity;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Offre {
    OffreEntity offreEntity;
    AssociationEntity associationEntity;
    List<ExigenceEntity> exigences;


    public OffreEntity getOffreEntity() {
        return offreEntity;
    }

    public void setOffreEntity(OffreEntity offreEntity) {
        this.offreEntity = offreEntity;
    }

    public AssociationEntity getAssociationEntity() {
        return associationEntity;
    }

    public void setAssociationEntity(AssociationEntity associationEntity) {
        this.associationEntity = associationEntity;
    }

    public List<ExigenceEntity> getExigences() {
        return exigences;
    }

    public void setExigences(List<ExigenceEntity> exigences) {
        this.exigences = exigences;
    }

    public Offre(OffreEntity offreEntity, AssociationEntity associationEntity, List<ExigenceEntity> exigences) {
        this.offreEntity = offreEntity;
        this.associationEntity = associationEntity;
        this.exigences = exigences;
    }


    public String getImages() {
            return offreEntity.getImage(offreEntity);
    }

    public String getExig(int k){
        String a="";
        for(ExigenceEntity s :exigences){
            a += s.getLabelEx() +", ";
        }
    return a;
    }



}

