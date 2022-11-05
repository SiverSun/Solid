package org.example;

import java.util.Map;

public class Basket {

    protected Purchase purchases;

    public Basket(Purchase purchases) {
        this.purchases = purchases;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.purchases.length; i++) {
            if (purchases.purchases[i] == null) {
                purchases.purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases.purchases[i].title.equals(title)) {
                purchases.purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.purchases.length; i++) {
            Purchase purchase = purchases.purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
