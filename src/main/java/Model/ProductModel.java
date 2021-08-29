package Model;

public class ProductModel extends AbstractModel{
    private String nameProduct;
    private String imageProduct;
    private String title;
    private String description;
    private float price;
    private Long catoryId;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getCatoryId() {
        return catoryId;
    }

    public void setCatoryId(Long catoryId) {
        this.catoryId = catoryId;
    }
}
