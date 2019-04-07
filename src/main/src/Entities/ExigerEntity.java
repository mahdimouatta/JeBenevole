package Entities;

import javax.persistence.*;

@Entity
@Table(name = "exiger", schema = "jees4", catalog = "")
@IdClass(ExigerEntityPK.class)
public class ExigerEntity {
    private int idOffre;
    private int idEx;

    @Id
    @Column(name = "id_offre")
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    @Id
    @Column(name = "id_ex")
    public int getIdEx() {
        return idEx;
    }

    public void setIdEx(int idEx) {
        this.idEx = idEx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExigerEntity that = (ExigerEntity) o;

        if (idOffre != that.idOffre) return false;
        if (idEx != that.idEx) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOffre;
        result = 31 * result + idEx;
        return result;
    }
}
