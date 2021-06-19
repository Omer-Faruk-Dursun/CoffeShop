package omerfaruk.dursun.coffe.shop.application;

import java.util.ArrayList;

/**
 * Utility class includes String parse methods to help main operation
 * @author Omer Faruk Dursun
 */
public class Utility {
    /**
     * Parses the given coffee name and price string into separate coffee name and price
     * @param coffeeNameAndPrice String that contains coffee name and price
     * @return Coffee Name String
     */
    public String parseCoffeeNameAndPrice(String coffeeNameAndPrice){
        String coffeeName = coffeeNameAndPrice.substring( 0, coffeeNameAndPrice.indexOf("("));
        coffeeName = coffeeName.substring(0, coffeeName.length() - 1);
        return coffeeName;
    }

    /**
     * Parses the given recipe string into tokens
     * @param recipeString String that contains recipe
     * @return ArrayList that contains tokenized Strings
     */
    public ArrayList<String> parseRecipe(String recipeString){
        ArrayList<String> tokenizedRecipe = new ArrayList<>();
        String[] tokens = recipeString.split(", ");
        for(String t : tokens){
            tokenizedRecipe.add(t);
        }
        return tokenizedRecipe;
    }

    /**
     * Parses the given recipe token string into material name and quantity
     * @param recipeTokenString String that contains material quantity and name pair
     * @return ArrayList that contains materialAndQuantity Strings
     */
    public ArrayList<String> parseMaterialAndQuantity(String recipeTokenString){
        ArrayList<String> materialAndQuantity = new ArrayList<>();
        String[] tokens = recipeTokenString.split("x ");
        for(String t : tokens){
            materialAndQuantity.add(t);
        }
        return materialAndQuantity;
    }

}
