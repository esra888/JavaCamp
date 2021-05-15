package Entities;

import Abstract.EntityInterface;

public class Sale implements EntityInterface {
    int id;
    private double price;

    public Sale() {
    }

    public Sale(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
