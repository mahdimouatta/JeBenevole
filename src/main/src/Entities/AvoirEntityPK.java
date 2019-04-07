package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AvoirEntityPK implements Serializable {
    private int idComp;
    private int idUser;

    @Column(name = "id_comp")
    @Id
    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    @Column(name = "id_user")
    @Id
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

        AvoirEntityPK that = (AvoirEntityPK) o;

        if (idComp != that.idComp) return false;
        if (idUser != that.idUser) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComp;
        result = 31 * result + idUser;
        return result;
    }
}
