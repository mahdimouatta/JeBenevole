package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AppartenirEntityPK implements Serializable {
    private int idUser;
    private int idDom;

    @Column(name = "id_user")
    @Id
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "id_dom")
    @Id
    public int getIdDom() {
        return idDom;
    }

    public void setIdDom(int idDom) {
        this.idDom = idDom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppartenirEntityPK that = (AppartenirEntityPK) o;

        if (idUser != that.idUser) return false;
        if (idDom != that.idDom) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + idDom;
        return result;
    }
}
