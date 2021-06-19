package omerfaruk.dursun.coffe.shop.application;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * UtilityTest class includes unit tests for Utility class
 * @author Omer Faruk Dursun
 */
public class UtilityTest {

    @Test
    public void parseCoffeeNameTest(){
        Utility utility = new Utility();
        String returnString = utility.parseCoffeeName("Turkish Coffee (7 ₺)");
        String expected = "Turkish Coffee";
        Assert.assertEquals(expected,returnString);
    }

    @Test
    public void parseCoffeePriceTest(){
        Utility utility = new Utility();
        Double returnDouble = utility.parseCoffeePrice("Turkish Coffee (7.25 ₺)");
        Double expected = 7.25;
        Assert.assertEquals(expected,returnDouble);
    }

    @Test
    public void parseRecipeTest(){
        Utility utility = new Utility();
        ArrayList<String> returnArrayList = utility.parseRecipe("4x Espresso, 12x Steamed Milk");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("4x Espresso");
        expected.add("12x Steamed Milk");
        Assert.assertEquals(expected,returnArrayList);

    }

    @Test
    public void parseMaterialAndQuantityTest(){
        Utility utility = new Utility();
        ArrayList<String> returnArrayList = utility.parseMaterialAndQuantity("4x Espresso");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("4");
        expected.add("Espresso");
        Assert.assertEquals(expected,returnArrayList);
    }

}
