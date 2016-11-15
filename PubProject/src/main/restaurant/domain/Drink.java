package restaurant.domain;

import javax.persistence.*;

/**
 * Created by zagor on 06.11.2016.
 */
    @Entity
    @Table(name = "drink")
    public class Drink {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Integer id;

    @Column (name = "drink_name")
    private String drink_name;

    public Drink() {
    }

    public Drink(int id, String drink_name) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }
}
