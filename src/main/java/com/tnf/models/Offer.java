package com.tnf.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_seq")
    @SequenceGenerator(name = "offer_seq", sequenceName = "offer_sequence", allocationSize = 1)
    @Column(name = "offer_id", nullable = false )
    private Long id;

    @Column(name = "offer_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal offerPrice;

    @Column(name = "minimum_purchase_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal minimumPurchaseAmount;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = false, length = 1000)
    private String description; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false )
    private Product product;

    public Offer() {
        super();
    }

    public Offer(Long id, BigDecimal offerPrice, BigDecimal minimumPurchaseAmount, String title, String description, Product product) {
        this.id = id;
        this.offerPrice = offerPrice;
        this.minimumPurchaseAmount = minimumPurchaseAmount;
        this.title = title;
        this.description = description;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }

    public BigDecimal getMinimumPurchaseAmount() {
        return minimumPurchaseAmount;
    }

    public void setMinimumPurchaseAmount(BigDecimal minimumPurchaseAmount) {
        this.minimumPurchaseAmount = minimumPurchaseAmount;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Offer [id=" + id + ", offerPrice=" + offerPrice + ", minimumPurchaseAmount=" + minimumPurchaseAmount
                + ", title=" + title + ", description=" + description + ", product=" + product + "]";
    }   

    
    

}
