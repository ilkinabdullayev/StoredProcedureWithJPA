package storedprocedurewithjpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 *
 * @author Ilkin Abdullayev
 */
@Entity
@Table(name = "REGIONS")
@NamedStoredProcedureQuery(name = "Region.insert",procedureName = "INSERTREGION",parameters = {
    @StoredProcedureParameter(name = "reg_id",mode = ParameterMode.IN,type = Integer.class),
    @StoredProcedureParameter(name = "reg_name",mode = ParameterMode.IN,type = String.class)
})
public class Regions implements Serializable {
    
    @Id
    @Column(name = "REGION_ID")
    private int id;
    
    @Column(name = "REGION_NAME",length = 25)
    private String name;

    public Regions() {
    }

    public Regions(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Regions other = (Regions) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Regions{" + "id=" + id + ", name=" + name + '}';
    }

}
