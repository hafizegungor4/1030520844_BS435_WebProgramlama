package org.webp;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class OrdersDetails {

    @Id @GeneratedValue
    private long id;

    @Id @NotNull
    private int productQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Orders> orderId;

    private int productId;

    private int billId;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Customers> CustomerId;

    //Consructor Method
    public OrdersDetails(){}

    //Getter and Setter Method

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public List<Orders> getOrderId() {
        return orderId;
    }

    public void setOrderId(List<Orders> orderId) {
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

    public List<Customers> getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(List<Customers> customerId) {
        CustomerId = customerId;
    }
}

