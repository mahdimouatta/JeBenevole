package Entities;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "jees4", catalog = "")
public class UserEntity {
    private int idUser;
    private String usernameUser;
    private String passwordUser;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "username_user")
    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    @Basic
    @Column(name = "password_user")
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (usernameUser != null ? !usernameUser.equals(that.usernameUser) : that.usernameUser != null) return false;
        if (passwordUser != null ? !passwordUser.equals(that.passwordUser) : that.passwordUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (usernameUser != null ? usernameUser.hashCode() : 0);
        result = 31 * result + (passwordUser != null ? passwordUser.hashCode() : 0);
        return result;
    }
}
