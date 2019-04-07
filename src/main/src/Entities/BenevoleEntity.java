package Entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

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
}
