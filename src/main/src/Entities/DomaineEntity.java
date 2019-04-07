package Entities;

import javax.persistence.*;

@Entity
@Table(name = "domaine", schema = "jees4", catalog = "")
public class DomaineEntity {
    private int idDom;
    private String labelDom;
    private String descDom;

    @Id
    @Column(name = "id_dom")
    public int getIdDom() {
        return idDom;
    }

    public void setIdDom(int idDom) {
        this.idDom = idDom;
    }

    @Basic
    @Column(name = "label_dom")
    public String getLabelDom() {
        return labelDom;
    }

    public void setLabelDom(String labelDom) {
        this.labelDom = labelDom;
    }

    @Basic
    @Column(name = "desc_dom")
    public String getDescDom() {
        return descDom;
    }

    public void setDescDom(String descDom) {
        this.descDom = descDom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomaineEntity that = (DomaineEntity) o;

        if (idDom != that.idDom) return false;
        if (labelDom != null ? !labelDom.equals(that.labelDom) : that.labelDom != null) return false;
        if (descDom != null ? !descDom.equals(that.descDom) : that.descDom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDom;
        result = 31 * result + (labelDom != null ? labelDom.hashCode() : 0);
        result = 31 * result + (descDom != null ? descDom.hashCode() : 0);
        return result;
    }
}
