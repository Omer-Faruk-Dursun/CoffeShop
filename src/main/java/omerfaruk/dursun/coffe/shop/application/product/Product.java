package omerfaruk.dursun.coffe.shop.application.product;

import omerfaruk.dursun.coffe.shop.application.material.MaterialQuantity;

import java.util.ArrayList;

/**
 * Product class represents the items on the menu
 *
 * @author Omer Faruk Dursun
 */
public class Product {
    private final String productName;
    private Double price;
    private ArrayList<MaterialQuantity> recipe;

    /**
     * Product Constructor with all fields as parameters
     *
     * @param productName Name of the Product
     * @param price       Price value of the Product
     * @param recipe      Recipe is an ArrayList that holds MaterialQuantity objects
     */
    public Product(String productName, Double price, ArrayList<MaterialQuantity> recipe) {
        this.productName = productName;
        this.price = price;
        this.recipe = recipe;
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

    /**
     * Returns a formatted string that displays Product name, materials and the quantity of those materials
     *
     * @return the formatted String
     */
    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder(productName + " seçtiniz." + " Bu içeceğimiz ");

        for (MaterialQuantity material : recipe) {
            returnString.append(material.getQuantity()).append(" adet ").append(material.getMaterial().getName()).append(" ");
        }

        returnString.append("içermektedir.");
        returnString.append(" Ürünümüzün fiyatı ").append(price).append(" ₺'dır.");

        return returnString.toString();
    }

}
