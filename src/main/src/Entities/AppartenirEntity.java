package Entities;

import javax.persistence.*;

@Entity
@Table(name = "appartenir", schema = "jees4", catalog = "")
@IdClass(AppartenirEntityPK.class)
public class AppartenirEntity {
    private int idUser;
    private int idDom;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Id
    @Column(name = "id_dom")
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

        AppartenirEntity that = (AppartenirEntity) o;

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
