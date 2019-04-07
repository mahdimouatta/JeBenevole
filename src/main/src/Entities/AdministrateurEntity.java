package Entities;

import javax.persistence.*;

@Entity
@Table(name = "administrateur", schema = "jees4", catalog = "")
public class AdministrateurEntity {
    private String nomAdmin;
    private int idUser;

    @Basic
    @Column(name = "nom_admin")
    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
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

        AdministrateurEntity that = (AdministrateurEntity) o;

        if (idUser != that.idUser) return false;
        if (nomAdmin != null ? !nomAdmin.equals(that.nomAdmin) : that.nomAdmin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomAdmin != null ? nomAdmin.hashCode() : 0;
        result = 31 * result + idUser;
        return result;
    }
}
