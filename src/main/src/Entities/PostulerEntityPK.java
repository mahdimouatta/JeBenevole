package Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PostulerEntityPK implements Serializable {
    private int idUser;
    private int idOffre;

    @Column(name = "id_user")
    @Id
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "id_offre")
    @Id
    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostulerEntityPK that = (PostulerEntityPK) o;

        if (idUser != that.idUser) return false;
        if (idOffre != that.idOffre) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + idOffre;
        return result;
    }
}
