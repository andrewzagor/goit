package restaurant.domain;

import javax.persistence.*;

/**
 * Created by zagor on 06.11.2016.
 */

@Entity
@Table(name = "storage")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column (name = "name_product")
    private String name_product;

    @Column (name = "count")
    private Integer count;

    public Storage(Integer id, String name_product, int count) {
    }

    public Storage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
