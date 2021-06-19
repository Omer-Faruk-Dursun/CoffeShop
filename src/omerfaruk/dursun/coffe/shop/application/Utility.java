package omerfaruk.dursun.coffe.shop.application;

public class Utility {

    public String parseCoffeeNameAndPrice(String key){
        String kept = key.substring( 0, key.indexOf("("));
        kept = kept.substring(0, kept.length() - 1);
        return kept;

    }
}
