package com.ua.homework_7_2.domain;

/**
 * Created by ZahornyiAI on 09.11.2016.
 */
public class IngredientsStorage {
    @Entity
    @Table(name = "STORAGE")
    public class IngredientsStorage {
        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        @Column(name = "ID")
        private int id;

        @OneToOne
        @JoinColumn(name = "INGREDIENT_ID")
        private Ingredient ingredient;

        @Column(name = "QUANTITY")
        private float quantity;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Ingredient getIngredient() {
            return ingredient;
        }

        public void setIngredient(Ingredient ingredient) {
            this.ingredient = ingredient;
        }

        public float getQuantity() {
            return quantity;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }

    }}
