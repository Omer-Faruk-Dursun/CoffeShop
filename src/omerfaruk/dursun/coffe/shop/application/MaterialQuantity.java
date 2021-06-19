package omerfaruk.dursun.coffe.shop.application;
/**
 * The Material class represents a material and quantity of that material.
 * @author Omer Faruk Dursun
 */
public class MaterialQuantity {
    private Material material;
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
