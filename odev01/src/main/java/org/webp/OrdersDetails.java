package org.webp;

import javax.persistence.*;

@Entity
public class OrdersDetails {

    @Id
    private int productQuantity;

    private int orderId;

    private int productId;

    private int billId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    //Burada Lazy varsayilandir cunku veri yapisi buyuk olabilir
    private Customers CustomerId;

//Consructor Method
    public OrdersDetails(){}

//Getter and Setter Method

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }
}

