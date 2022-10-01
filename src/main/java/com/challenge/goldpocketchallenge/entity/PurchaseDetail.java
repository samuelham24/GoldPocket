package com.challenge.goldpocketchallenge.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_purchase_details")
public class PurchaseDetail {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String purchaseDetailId;

    @ManyToOne
    private Product product;
    private BigDecimal price;
    private Double quantityInGram;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "pocket_id")
    private Pocket pocket;

    public String getPurchaseDetailId() {
        return purchaseDetailId;
    }

    public void setPurchaseDetailId(String purchaseDetailId) {
        this.purchaseDetailId = purchaseDetailId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getQuantityInGram() {
        return quantityInGram;
    }

    public void setQuantityInGram(Double quantityInGram) {
        this.quantityInGram = quantityInGram;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Pocket getPocket() {
        return pocket;
    }

    public void setPocket(Pocket pocket) {
        this.pocket = pocket;
    }
}
