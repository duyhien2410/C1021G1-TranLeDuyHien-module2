package ss12.bai_tap.arraylist_linkedlist_trong_java_collection_framwork;

public class Product implements Comparable<Product>{
    private String id;
    private String nameProduct;
    private int valueProduct;

    public Product() {
    }

    public Product(String id, String nameProduct, int valueProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.valueProduct = valueProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(int valueProduct) {
        this.valueProduct = valueProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", valueProduct=" + valueProduct +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.valueProduct-o.getValueProduct();
    }
}
