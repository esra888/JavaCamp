package Entities;

import Abstract.EntityInterface;

public class Sale implements EntityInterface {
    int id;
    int numberOfSales;

    public Sale() {
    }

    public Sale(int id, int numberOfSales) {
        this.id = id;
        this.numberOfSales = numberOfSales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
}
