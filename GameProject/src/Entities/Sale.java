package Entities;

import Abstract.EntityInterface;

public class Sale implements EntityInterface {
    int id;

    public Sale() {
    }

    public Sale(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
