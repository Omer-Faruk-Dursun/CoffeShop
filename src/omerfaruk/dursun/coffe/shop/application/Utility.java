package omerfaruk.dursun.coffe.shop.application;

import java.util.ArrayList;

public class Utility {

    public String parseCoffeeNameAndPrice(String key){
        String kept = key.substring( 0, key.indexOf("("));
        kept = kept.substring(0, kept.length() - 1);
        return kept;
    }

    public ArrayList<String> parseRecipe(String recipeString){
        ArrayList<String> tokenizedRecipe = new ArrayList<>();
        String[] tokens = recipeString.split(", ");
        for(String t : tokens){
            tokenizedRecipe.add(t);
        }
        return tokenizedRecipe;
    }

    public ArrayList<String> parseMaterialAndQuantitiy(String recipeString){
        ArrayList<String> xDD = new ArrayList<>();
        String[] tokens = recipeString.split("x ");
        for(String t : tokens){
            xDD.add(t);
        }
        return xDD;
    }

}
