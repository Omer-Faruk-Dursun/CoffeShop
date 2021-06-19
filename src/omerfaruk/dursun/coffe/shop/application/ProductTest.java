package omerfaruk.dursun.coffe.shop.application;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ProductTest {
    @Test
    public void toStringTest(){
        ArrayList<MaterialQuantity> recipeListOfProduct = new ArrayList<>();
        recipeListOfProduct.add(new MaterialQuantity(new Material("Coffee Beans"), 7));
        Product p = new Product("Turkish Coffee",10.0,recipeListOfProduct);
        String expected = "Turkish Coffee seçtiniz. Bu içeceğimiz 7 adet Coffee Beans içermektedir.";
        Assert.assertEquals(expected,p.toString());
    }
}
