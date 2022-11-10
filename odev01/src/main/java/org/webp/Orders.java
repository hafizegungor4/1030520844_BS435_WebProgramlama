package org.webp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "Orders")
@Entity
public class Orders {

    @NotNull @GeneratedValue
    private Long Id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Long orderId;

    private String customerName;

    private String customerSurname;

    private String productName;

    private int pricePerUnit;

    private int productQuantity;

    private String deliveryDate;

    private String supplierName;

    private float price;

//Constructor Method
    public Orders() {}

//Getter and Setter Method

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
