package Entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "offre", schema = "jees4", catalog = "")
public class OffreEntity {
    private int idOffre;
    private String titreOffre;
    private String adresseOffre;
    private Date dateDOffre;
    private Date dateFOffre;
    private Byte remunere;
    private Double remunerationOffre;
    private byte[] imageOffre;
    private Integer idUser;

    @Id
    @Column(name = "id_offre")
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    @Basic
    @Column(name = "titre_offre")
    public String getTitreOffre() {
        return titreOffre;
    }

    public void setTitreOffre(String titreOffre) {
        this.titreOffre = titreOffre;
    }

    @Basic
    @Column(name = "adresse_offre")
    public String getAdresseOffre() {
        return adresseOffre;
    }

    public void setAdresseOffre(String adresseOffre) {
        this.adresseOffre = adresseOffre;
    }

    @Basic
    @Column(name = "date_d_offre")
    public Date getDateDOffre() {
        return dateDOffre;
    }

    public void setDateDOffre(Date dateDOffre) {
        this.dateDOffre = dateDOffre;
    }

    @Basic
    @Column(name = "date_f_offre")
    public Date getDateFOffre() {
        return dateFOffre;
    }

    public void setDateFOffre(Date dateFOffre) {
        this.dateFOffre = dateFOffre;
    }

    @Basic
    @Column(name = "remunere")
    public Byte getRemunere() {
        return remunere;
    }

    public void setRemunere(Byte remunere) {
        this.remunere = remunere;
    }

    @Basic
    @Column(name = "remuneration_offre")
    public Double getRemunerationOffre() {
        return remunerationOffre;
    }

    public void setRemunerationOffre(Double remunerationOffre) {
        this.remunerationOffre = remunerationOffre;
    }

    @Basic
    @Column(name = "Image_offre",columnDefinition = "mediumblob")
    public byte[] getImageOffre() {
        return imageOffre;
    }

    public void setImageOffre(byte[] imageOffre) {
        this.imageOffre = imageOffre;
    }

    @Basic
    @Column(name = "id_user")
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OffreEntity that = (OffreEntity) o;

        if (idOffre != that.idOffre) return false;
        if (titreOffre != null ? !titreOffre.equals(that.titreOffre) : that.titreOffre != null) return false;
        if (adresseOffre != null ? !adresseOffre.equals(that.adresseOffre) : that.adresseOffre != null) return false;
        if (dateDOffre != null ? !dateDOffre.equals(that.dateDOffre) : that.dateDOffre != null) return false;
        if (dateFOffre != null ? !dateFOffre.equals(that.dateFOffre) : that.dateFOffre != null) return false;
        if (remunere != null ? !remunere.equals(that.remunere) : that.remunere != null) return false;
        if (remunerationOffre != null ? !remunerationOffre.equals(that.remunerationOffre) : that.remunerationOffre != null)
            return false;
        if (!Arrays.equals(imageOffre, that.imageOffre)) return false;
        if (idUser != null ? !idUser.equals(that.idUser) : that.idUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOffre;
        result = 31 * result + (titreOffre != null ? titreOffre.hashCode() : 0);
        result = 31 * result + (adresseOffre != null ? adresseOffre.hashCode() : 0);
        result = 31 * result + (dateDOffre != null ? dateDOffre.hashCode() : 0);
        result = 31 * result + (dateFOffre != null ? dateFOffre.hashCode() : 0);
        result = 31 * result + (remunere != null ? remunere.hashCode() : 0);
        result = 31 * result + (remunerationOffre != null ? remunerationOffre.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imageOffre);
        result = 31 * result + (idUser != null ? idUser.hashCode() : 0);
        return result;
    }
}
