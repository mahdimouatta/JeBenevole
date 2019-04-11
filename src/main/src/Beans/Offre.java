package Beans;

import Controllers.OffresExtract;
import Entities.OffreEntity;

import java.sql.Date;

public class Offre {

    private int idOffre;
    private String titreOffre;
    private String adresseOffre;
    private Date dateDOffre;
    private Date dateFOffre;
    private Byte remunere;
    private Double remunerationOffre;
    private byte[] imageOffre;
    private Integer idUser;

    

    public Offre(int id){
        OffreEntity offreEntity = OffresExtract.getOffre(id);

        this.idOffre = offreEntity.getIdOffre();
        this.titreOffre = offreEntity.getTitreOffre();
        this.adresseOffre = offreEntity.getAdresseOffre();
        this.dateDOffre = offreEntity.getDateDOffre();
        this.dateFOffre = offreEntity.getDateFOffre();
        this.remunere = offreEntity.getRemunere();
        this.remunerationOffre = offreEntity.getRemunerationOffre();
        this.imageOffre = offreEntity.getImageOffre();
        this.idUser = offreEntity.getIdUser();

    }

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public String getTitreOffre() {
        return titreOffre;
    }

    public void setTitreOffre(String titreOffre) {
        this.titreOffre = titreOffre;
    }

    public String getAdresseOffre() {
        return adresseOffre;
    }

    public void setAdresseOffre(String adresseOffre) {
        this.adresseOffre = adresseOffre;
    }

    public Date getDateDOffre() {
        return dateDOffre;
    }

    public void setDateDOffre(Date dateDOffre) {
        this.dateDOffre = dateDOffre;
    }

    public Date getDateFOffre() {
        return dateFOffre;
    }

    public void setDateFOffre(Date dateFOffre) {
        this.dateFOffre = dateFOffre;
    }

    public Byte getRemunere() {
        return remunere;
    }

    public void setRemunere(Byte remunere) {
        this.remunere = remunere;
    }

    public Double getRemunerationOffre() {
        return remunerationOffre;
    }

    public void setRemunerationOffre(Double remunerationOffre) {
        this.remunerationOffre = remunerationOffre;
    }

    public byte[] getImageOffre() {
        return imageOffre;
    }

    public void setImageOffre(byte[] imageOffre) {
        this.imageOffre = imageOffre;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


}

