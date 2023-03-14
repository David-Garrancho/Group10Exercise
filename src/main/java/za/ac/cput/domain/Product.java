package za.ac.cput.domain;

import java.util.Objects;

public class Product {
    private String prodCode;
    private String prodName;
    private String prodType;

    public Product() {
    }

    public Product(String prodCode, String prodName, String prodType) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodType = prodType;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdCode() {
        return prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdType() {
        return prodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(prodCode, product.prodCode) && Objects.equals(prodName, product.prodName) && Objects.equals(prodType, product.prodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodCode, prodName, prodType);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodCode='" + prodCode + '\'' +
                ", prodName='" + prodName + '\'' +
                ", prodType='" + prodType + '\'' +
                '}';
    }
}


