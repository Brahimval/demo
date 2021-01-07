package model;


import javax.persistence.*;
import java.util.Date;
@Entity
@MappedSuperclass
public class warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public long id;
    @Column(nullable = false)
    private long warehouseCod;
    @Column(nullable = false)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date creatDate ;
    public Date updateDate = new Date(System.currentTimeMillis());

    public warehouse() {
    }
    public warehouse(long warehouseCod, String name) { this.warehouseCod = warehouseCod;this.name = name; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getWarehouseCod() { return warehouseCod; }

    public void setWarehouseCod(long warehouseCod) { this.warehouseCod = warehouseCod; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Date getCreatDate() { return creatDate; }

    public void setCreatDate(Date creatDate) { this.creatDate = creatDate; }

    public Date getUpdateDate() { return updateDate; }

    public void setUpdateDate(Date updateDate) { this.updateDate = updateDate; }
}
