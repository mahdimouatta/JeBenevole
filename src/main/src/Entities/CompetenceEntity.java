package Entities;

import javax.persistence.*;

@Entity
@Table(name = "competence", schema = "jees4", catalog = "")
public class CompetenceEntity {
    private int idComp;
    private String labelComp;
    private String descComp;

    @Id
    @Column(name = "id_comp")
    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    @Basic
    @Column(name = "label_comp")
    public String getLabelComp() {
        return labelComp;
    }

    public void setLabelComp(String labelComp) {
        this.labelComp = labelComp;
    }

    @Basic
    @Column(name = "desc_comp")
    public String getDescComp() {
        return descComp;
    }

    public void setDescComp(String descComp) {
        this.descComp = descComp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompetenceEntity that = (CompetenceEntity) o;

        if (idComp != that.idComp) return false;
        if (labelComp != null ? !labelComp.equals(that.labelComp) : that.labelComp != null) return false;
        if (descComp != null ? !descComp.equals(that.descComp) : that.descComp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComp;
        result = 31 * result + (labelComp != null ? labelComp.hashCode() : 0);
        result = 31 * result + (descComp != null ? descComp.hashCode() : 0);
        return result;
    }
}
