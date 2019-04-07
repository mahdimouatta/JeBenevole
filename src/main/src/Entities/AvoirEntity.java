package Entities;

import javax.persistence.*;

@Entity
@Table(name = "avoir", schema = "jees4", catalog = "")
@IdClass(AvoirEntityPK.class)
public class AvoirEntity {
    private int idComp;
    private int idUser;

    @Id
    @Column(name = "id_comp")
    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
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

        AvoirEntity that = (AvoirEntity) o;

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
