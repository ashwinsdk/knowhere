package com.tnf.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gift_card")
public class GiftCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "gift_card_seq", sequenceName = "gift_card_sequence")
    @Column(name = "gift_card_id", nullable = false)
    private Long id;

    @Column(name = "gift_card_code")
    private String couponCode;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    public GiftCard() {
    }

    public GiftCard(Long id, String couponCode, Double amount, LocalDate expiryDate, Boolean isActive, Payment payment) {
        this.id = id;
        this.couponCode = couponCode;
        this.amount = amount;
        this.expiryDate = expiryDate;
        this.isActive = isActive;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
