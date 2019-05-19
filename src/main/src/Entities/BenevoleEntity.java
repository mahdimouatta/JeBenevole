package Entities;

import Controllers.Benevole;
import DbConnect.HibernateUtil;
import org.hibernate.Session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;


@Entity
@Table(name = "benevole", schema = "jees4", catalog = "")
public class BenevoleEntity {
        private String nomB;
        private String prenomB;
        private Date dateNessB;
        private String adresseB;
        private String nTeleB;
        private String emailB;
        private String descriptionB;
        private byte[] imageB;
        private int idUser;
        private int idNat;

    @Basic
    @Column(name = "nom_B")
    public String getNomB() {
        return nomB;
    }

    public void setNomB(String nomB) {
        this.nomB = nomB;
    }

    @Basic
    @Column(name = "prenom_B")
    public String getPrenomB() {
        return prenomB;
    }

    public void setPrenomB(String prenomB) {
        this.prenomB = prenomB;
    }

    @Basic
    @Column(name = "date_ness_B")
    public Date getDateNessB() {
        return dateNessB;
    }

    public void setDateNessB(Date dateNessB) {
        this.dateNessB = dateNessB;
    }

    @Basic
    @Column(name = "adresse_B")
    public String getAdresseB() {
        return adresseB;
    }

    public void setAdresseB(String adresseB) {
        this.adresseB = adresseB;
    }

    @Basic
    @Column(name = "n_tele_B")
    public String getnTeleB() {
        return nTeleB;
    }

    public void setnTeleB(String nTeleB) {
        this.nTeleB = nTeleB;
    }

    @Basic
    @Column(name = "email_B")
    public String getEmailB() {
        return emailB;
    }

    public void setEmailB(String emailB) {
        this.emailB = emailB;
    }

    @Basic
    @Column(name = "Description_B")
    public String getDescriptionB() {
        return descriptionB;
    }

    public void setDescriptionB(String descriptionB) {
        this.descriptionB = descriptionB;
    }

    @Basic
    @Column(name = "image_B")
    public byte[] getImageB() {
        return imageB;
    }

    public void setImageB(byte[] imageB) {
        this.imageB = imageB;
    }

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "id_nat")
    public int getIdNat() {
        return idNat;
    }

    public void setIdNat(int idNat) {
        this.idNat = idNat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BenevoleEntity that = (BenevoleEntity) o;

        if (idUser != that.idUser) return false;
        if (idNat != that.idNat) return false;
        if (nomB != null ? !nomB.equals(that.nomB) : that.nomB != null) return false;
        if (prenomB != null ? !prenomB.equals(that.prenomB) : that.prenomB != null) return false;
        if (dateNessB != null ? !dateNessB.equals(that.dateNessB) : that.dateNessB != null) return false;
        if (adresseB != null ? !adresseB.equals(that.adresseB) : that.adresseB != null) return false;
        if (nTeleB != null ? !nTeleB.equals(that.nTeleB) : that.nTeleB != null) return false;
        if (emailB != null ? !emailB.equals(that.emailB) : that.emailB != null) return false;
        if (descriptionB != null ? !descriptionB.equals(that.descriptionB) : that.descriptionB != null) return false;
        if (!Arrays.equals(imageB, that.imageB)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomB != null ? nomB.hashCode() : 0;
        result = 31 * result + (prenomB != null ? prenomB.hashCode() : 0);
        result = 31 * result + (dateNessB != null ? dateNessB.hashCode() : 0);
        result = 31 * result + (adresseB != null ? adresseB.hashCode() : 0);
        result = 31 * result + (nTeleB != null ? nTeleB.hashCode() : 0);
        result = 31 * result + (emailB != null ? emailB.hashCode() : 0);
        result = 31 * result + (descriptionB != null ? descriptionB.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imageB);
        result = 31 * result + idUser;
        result = 31 * result + idNat;
        return result;
    }

//
//    public boolean creerUser(){
//        boolean result = true;
//        Session session = HibernateUtil.getSession();
//        if(!UserEntity.VerifierExistance()){
//
//        }
//
//
//
//        return result;
//    }

    public static BenevoleEntity getBenevole(int id){ // get the benevole with the id given
        Session session = HibernateUtil.getSession();
        BenevoleEntity benevole = (BenevoleEntity) session.createQuery("from BenevoleEntity where idUser ="+ id +"").getResultList().get(0);
        return benevole;
    }



    public String getImage(BenevoleEntity benevole) {

//        BenevoleEntity benevole = getBenevole(id);
        try {
            String imageString= Base64.getEncoder().encodeToString(benevole.getImageB());
            return imageString;

        }catch (Exception e){
            e.printStackTrace();
            String s = "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";
            return s;

        }
//

//        try{
//            FileOutputStream fos = new FileOutputStream("../webapp/images/test/test.png");
//            fos.write(book.getImageOffre());
//            fos.close();
//        }catch(Exception e){
//            System.out.println("laaaaaaaa");
//            e.printStackTrace();
//        }

    }


}
