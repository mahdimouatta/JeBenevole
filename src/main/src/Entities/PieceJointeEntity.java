package Entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "piece_jointe", schema = "jees4", catalog = "")
public class PieceJointeEntity {
    private int idPj;
    private byte[] contenuePj;
    private Integer idUser;

    @Id
    @Column(name = "id_pj")
    public int getIdPj() {
        return idPj;
    }

    public void setIdPj(int idPj) {
        this.idPj = idPj;
    }

    @Basic
    @Column(name = "contenue_pj")
    public byte[] getContenuePj() {
        return contenuePj;
    }

    public void setContenuePj(byte[] contenuePj) {
        this.contenuePj = contenuePj;
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

        PieceJointeEntity that = (PieceJointeEntity) o;

        if (idPj != that.idPj) return false;
        if (!Arrays.equals(contenuePj, that.contenuePj)) return false;
        if (idUser != null ? !idUser.equals(that.idUser) : that.idUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPj;
        result = 31 * result + Arrays.hashCode(contenuePj);
        result = 31 * result + (idUser != null ? idUser.hashCode() : 0);
        return result;
    }
}
