package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ExigerEntityPK implements Serializable {
    private int idOffre;
    private int idEx;

    @Column(name = "id_offre")
    @Id
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    @Column(name = "id_ex")
    @Id
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

        ExigerEntityPK that = (ExigerEntityPK) o;

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
