package omerfaruk.dursun.coffe.shop.application.material;

/**
 * The Material class represents the ingredients that make up the different kinds of coffee.
 * Material and MaterialQuantity classes have Composition relationship.
 *
 * @author Omer Faruk Dursun
 */
public class Material {

    private final String name;

    /**
     * Material Constructor with name field
     *
     * @param name Materials name
     */
    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
