package com.tnf.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "coupon_seq", sequenceName = "coupon_sequence")
    @Column(name = "coupon_id", nullable = false)
    private Long id;

    @Column(name = "coupon_code")
    private String couponCode;

    @Column(name = "min_amount")
    private Double minAmount;

    @Column(name = "discount_amount")
    private Double discountAmount;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "payment_id", nullable = false)
    private Payment payment;

    public Coupon() {
    }

    public Coupon(Long id, String couponCode, Double minAmount, Double discountAmount, LocalDate expiryDate, Payment payment) {
        this.id = id;
        this.couponCode = couponCode;
        this.minAmount = minAmount;
        this.discountAmount = discountAmount;
        this.expiryDate = expiryDate;
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

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
