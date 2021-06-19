package omerfaruk.dursun.coffe.shop.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* This ArrayList represents the list of coffee names and prices given in the document.
            Normally these values would be read from a file or fetched from a database.
         */
        ArrayList<String> listOfProductNameAndPrice = new ArrayList<>();
        // Add values according to the document
        listOfProductNameAndPrice.add("Espresso (7 ₺)");
        listOfProductNameAndPrice.add("Double Espresso (12 ₺)");
        listOfProductNameAndPrice.add("Cappuccino (12 ₺)");
        listOfProductNameAndPrice.add("Cafe Latte (12 ₺)");
        listOfProductNameAndPrice.add("Mocha (13 ₺)");
        listOfProductNameAndPrice.add("Americano (10 ₺)");
        listOfProductNameAndPrice.add("Hot Water (3 ₺)");

        /* This HashMap represents the coffee names and recipes given in the document.
            Normally these values would be read from a file or fetched from a database.
         */
        HashMap<String, String> ProductNameAndRecipe = new HashMap<>();
        // Add keys and values according to the document (Product Name, Ingredients)
        ProductNameAndRecipe.put("Espresso", "1x Espresso");
        ProductNameAndRecipe.put("Double Espresso", "2x Espresso");
        ProductNameAndRecipe.put("Americano",   "1x Espresso, 4x Hot Water");
        ProductNameAndRecipe.put("Cappuccino",  "1x Espresso, 2x Steamed Milk, 2x Milk Foam");
        ProductNameAndRecipe.put("Cafe Latte",  "1x Espresso, 3x Steamed Milk, 1x Milk Foam");
        ProductNameAndRecipe.put("Mocha",       "1x Espresso, 1x Steamed Milk, 1x Milk Foam, 2x Hot Chocolate");
        ProductNameAndRecipe.put("Hot Water",   "5x Hot Water");

        Scanner scan = new Scanner(System.in);
        int userSelection=0;
        /* If the user selects 0   : Menu will be displayed
           If the user selects 1-6 : Corresponding coffee will be prepared
           If the user selects 7   : Loop will end and program will close
         */
        while(userSelection != 7) {
            if(userSelection == 0){
                for(String menu:listOfProductNameAndPrice){
                    System.out.println(menu);
                }
            }
            // Inside the else branch selected coffee will be prepared according to the recipe list
            else{
                String coffeeNameAndPrice;
                try {
                    // userSelection variable is used as a index to listOfProductNameAndPrice ArrayList
                    coffeeNameAndPrice = listOfProductNameAndPrice.get(userSelection);
                } catch(IndexOutOfBoundsException e) {
                    System.out.println("Girdiğiniz indeks menü aralığında bulunmamaktadır.");
                    System.out.println("Menüden seçim yapmak içim lütfen 1 ve 6 aralığında bir değer giriniz");
                    continue;
                }
                System.out.println("Teşekkürler kahveniz hazırlanıyor.");

                Utility utility = new Utility();
                String coffeeNameParsed = utility.parseCoffeeNameAndPrice(coffeeNameAndPrice);



            }
            System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz");
            userSelection = scan.nextInt();
        }


    }
}
