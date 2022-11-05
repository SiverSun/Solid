package org.example;

public class Purchase {
    protected String title;
    protected int count;
    protected final int PRODUCT_SIZE = 4;
    protected Purchase[] purchases = new Purchase[PRODUCT_SIZE];

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }


}
