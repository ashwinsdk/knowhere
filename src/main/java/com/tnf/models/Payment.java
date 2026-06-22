package com.tnf.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "payment_seq", sequenceName = "payment_sequence")
    @Column(name = "payment_id", nullable = false)
    private Long id;

//    @OneToOne( mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "order_id", nullable = false)
//    Order order;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "status")
    private String status;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @OneToMany(mappedBy = "payment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Coupon> coupons;

    @OneToOne(mappedBy = "giftCard", cascade = CascadeType.ALL, orphanRemoval = true)
    private GiftCard giftCard;

    public Payment() {
    }

    public Payment(GiftCard giftCard, List<Coupon> coupons, PaymentType paymentType, String status, Double amount, Long id) {
        this.giftCard = giftCard;
        this.coupons = coupons;
        this.paymentType = paymentType;
        this.status = status;
        this.amount = amount;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }
}
