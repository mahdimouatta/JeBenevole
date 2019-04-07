package Entities;

import javax.persistence.*;

@Entity
@Table(name = "postuler", schema = "jees4", catalog = "")
@IdClass(PostulerEntityPK.class)
public class PostulerEntity {
    private int idUser;
    private int idOffre;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Id
    @Column(name = "id_offre")
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

        PostulerEntity that = (PostulerEntity) o;

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
