package omerfaruk.dursun.coffe.shop.application;
/**
 * The MaterialQuantity class represents a material and quantity of that material.
 * Material and MaterialQuantity classes have Composition relationship.
 * @author Omer Faruk Dursun
 */
public class MaterialQuantity {
    private final Material material;
    private Integer quantity;

    /**
     * Material Constructor with material and quantity fields
     * @param material A material object
     * @param quantity Quantity of the material object
     */
    public MaterialQuantity(Material material, Integer quantity) {
        this.material = material;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Material getMaterial() {
        return material;
    }

}
