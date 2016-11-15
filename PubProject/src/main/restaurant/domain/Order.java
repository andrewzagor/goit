package restaurant.domain;

import javax.persistence.*;

/**
 * Created by zagor on 14.11.2016.
 */
@Entity
@Table(name = "orderpub")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column (name = "name_beer")
    private String name_beer;

    @Column (name = "count")
    private Integer count;

    @Column (name = "price")
    private Integer price;

    public Order(int id, String beer_name, int count, int price) {
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_beer() {
        return name_beer;
    }

    public void setName_beer(String name_beer) {
        this.name_beer = name_beer;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
