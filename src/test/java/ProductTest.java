import omerfaruk.dursun.coffe.shop.application.material.Material;
import omerfaruk.dursun.coffe.shop.application.material.MaterialQuantity;
import omerfaruk.dursun.coffe.shop.application.product.Product;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ProductTest class includes unit tests for Product class
 *
 * @author Omer Faruk Dursun
 */
public class ProductTest {
    @Test
    public void toStringTest() {
        ArrayList<MaterialQuantity> recipeListOfProduct = new ArrayList<>();
        recipeListOfProduct.add(new MaterialQuantity(new Material("Coffee Beans"), 7));
        Product p = new Product("Turkish Coffee", 10.0, recipeListOfProduct);
        String expected = "Turkish Coffee seçtiniz. Bu içeceğimiz 7 adet Coffee Beans içermektedir.";

        assertEquals(expected, p.toString());
    }
}
