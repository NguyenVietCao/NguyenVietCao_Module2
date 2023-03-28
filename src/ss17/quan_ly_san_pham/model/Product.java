package ss17.quan_ly_san_pham.model;

import ss17.quan_ly_san_pham.service.IFunction;

import java.io.Serializable;

public class Product implements Serializable {
    String idProduct;
    String nameProduct;
    float priceProduct;
    String manufacturer;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, float priceProduct, String manufacturer) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufacturer = manufacturer;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
//    @Override
//    public String getInformationToCsv(){
//        this.idProduct + ","+ this.nameProduct + "," + this.priceProduct + "," + this.manufacturer;
//    }
}
