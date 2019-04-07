package Entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "association", schema = "jees4", catalog = "")
public class AssociationEntity {
    private String nomAss;
    private Date dateCrAss;
    private String adresseAss;
    private String nTele1Ass;
    private String nTele2Ass;
    private String email1Ass;
    private String email2Ass;
    private String descriptionAss;
    private byte[] imageAss;
    private int idUser;

    @Basic
    @Column(name = "nom_ass")
    public String getNomAss() {
        return nomAss;
    }

    public void setNomAss(String nomAss) {
        this.nomAss = nomAss;
    }

    @Basic
    @Column(name = "date_cr_ass")
    public Date getDateCrAss() {
        return dateCrAss;
    }

    public void setDateCrAss(Date dateCrAss) {
        this.dateCrAss = dateCrAss;
    }

    @Basic
    @Column(name = "adresse_ass")
    public String getAdresseAss() {
        return adresseAss;
    }

    public void setAdresseAss(String adresseAss) {
        this.adresseAss = adresseAss;
    }

    @Basic
    @Column(name = "n_tele1_ass")
    public String getnTele1Ass() {
        return nTele1Ass;
    }

    public void setnTele1Ass(String nTele1Ass) {
        this.nTele1Ass = nTele1Ass;
    }

    @Basic
    @Column(name = "n_tele2_ass")
    public String getnTele2Ass() {
        return nTele2Ass;
    }

    public void setnTele2Ass(String nTele2Ass) {
        this.nTele2Ass = nTele2Ass;
    }

    @Basic
    @Column(name = "email1_ass")
    public String getEmail1Ass() {
        return email1Ass;
    }

    public void setEmail1Ass(String email1Ass) {
        this.email1Ass = email1Ass;
    }

    @Basic
    @Column(name = "email2_ass")
    public String getEmail2Ass() {
        return email2Ass;
    }

    public void setEmail2Ass(String email2Ass) {
        this.email2Ass = email2Ass;
    }

    @Basic
    @Column(name = "Description_ass")
    public String getDescriptionAss() {
        return descriptionAss;
    }

    public void setDescriptionAss(String descriptionAss) {
        this.descriptionAss = descriptionAss;
    }

    @Basic
    @Column(name = "image_ass")
    public byte[] getImageAss() {
        return imageAss;
    }

    public void setImageAss(byte[] imageAss) {
        this.imageAss = imageAss;
    }

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssociationEntity that = (AssociationEntity) o;

        if (idUser != that.idUser) return false;
        if (nomAss != null ? !nomAss.equals(that.nomAss) : that.nomAss != null) return false;
        if (dateCrAss != null ? !dateCrAss.equals(that.dateCrAss) : that.dateCrAss != null) return false;
        if (adresseAss != null ? !adresseAss.equals(that.adresseAss) : that.adresseAss != null) return false;
        if (nTele1Ass != null ? !nTele1Ass.equals(that.nTele1Ass) : that.nTele1Ass != null) return false;
        if (nTele2Ass != null ? !nTele2Ass.equals(that.nTele2Ass) : that.nTele2Ass != null) return false;
        if (email1Ass != null ? !email1Ass.equals(that.email1Ass) : that.email1Ass != null) return false;
        if (email2Ass != null ? !email2Ass.equals(that.email2Ass) : that.email2Ass != null) return false;
        if (descriptionAss != null ? !descriptionAss.equals(that.descriptionAss) : that.descriptionAss != null)
            return false;
        if (!Arrays.equals(imageAss, that.imageAss)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomAss != null ? nomAss.hashCode() : 0;
        result = 31 * result + (dateCrAss != null ? dateCrAss.hashCode() : 0);
        result = 31 * result + (adresseAss != null ? adresseAss.hashCode() : 0);
        result = 31 * result + (nTele1Ass != null ? nTele1Ass.hashCode() : 0);
        result = 31 * result + (nTele2Ass != null ? nTele2Ass.hashCode() : 0);
        result = 31 * result + (email1Ass != null ? email1Ass.hashCode() : 0);
        result = 31 * result + (email2Ass != null ? email2Ass.hashCode() : 0);
        result = 31 * result + (descriptionAss != null ? descriptionAss.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imageAss);
        result = 31 * result + idUser;
        return result;
    }
}
