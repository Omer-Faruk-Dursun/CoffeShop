package omerfaruk.dursun.coffe.shop.application;

import java.util.ArrayList;

public class Product {
    private String productName;
    private Double price;
    private ArrayList<MaterialQuantity> recipe;

    public Product(String productName, Double price, ArrayList<MaterialQuantity> recipe) {
        this.productName = productName;
        this.price = price;
        this.recipe = recipe;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArrayList<MaterialQuantity> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<MaterialQuantity> recipe) {
        this.recipe = recipe;
    }

}
