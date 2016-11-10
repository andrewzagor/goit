package restaurant.domain;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by zagor on 25.09.2016.
 */
@Entity
@Table(name = "PubMenu")
public class PubMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "kind_of_beer")
    private String kindOfBeer;

    @Column (name = "volume")
    private String volume;

    @Column (name = "price")
    private Integer price;

    @Column (name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfBeer() {
        return kindOfBeer;
    }

    public void setKindOfBeer(String kindOfBeer) {
        this.kindOfBeer = kindOfBeer;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
