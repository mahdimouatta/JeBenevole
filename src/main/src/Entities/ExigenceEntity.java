package Entities;

import javax.persistence.*;

@Entity
@Table(name = "exigence", schema = "jees4", catalog = "")
public class ExigenceEntity {
    private int idEx;
    private String labelEx;
    private String descEx;

    @Id
    @Column(name = "id_ex")
    public int getIdEx() {
        return idEx;
    }

    public void setIdEx(int idEx) {
        this.idEx = idEx;
    }

    @Basic
    @Column(name = "label_ex")
    public String getLabelEx() {
        return labelEx;
    }

    public void setLabelEx(String labelEx) {
        this.labelEx = labelEx;
    }

    @Basic
    @Column(name = "desc_ex")
    public String getDescEx() {
        return descEx;
    }

    public void setDescEx(String descEx) {
        this.descEx = descEx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExigenceEntity that = (ExigenceEntity) o;

        if (idEx != that.idEx) return false;
        if (labelEx != null ? !labelEx.equals(that.labelEx) : that.labelEx != null) return false;
        if (descEx != null ? !descEx.equals(that.descEx) : that.descEx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEx;
        result = 31 * result + (labelEx != null ? labelEx.hashCode() : 0);
        result = 31 * result + (descEx != null ? descEx.hashCode() : 0);
        return result;
    }
}
