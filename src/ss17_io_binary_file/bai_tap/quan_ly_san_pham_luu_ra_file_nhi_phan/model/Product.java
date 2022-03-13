package ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model;

public class Product {
    private String productCode;
    private String productName;
    private String manufacturer;
    private String productPrice;

    public Product() {
    }

    public Product(String productCode, String productName, String manufacturer, String productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
