package com.tnf.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "delivery_seq", sequenceName = "delivery_sequence")
    @Column(name = "delivery_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "expected_date")
    private LocalDate expectedDate;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

    public Delivery() {
        super();
    }

    public Delivery(Long id, Order order, Shipment shipment, String status, LocalDate expectedDate,
                    LocalDate deliveryDate) {
        super();
        this.id = id;
        this.order = order;
        this.shipment = shipment;
        this.status = status;
        this.expectedDate = expectedDate;
        this.deliveryDate = deliveryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(LocalDate expectedDate) {
        this.expectedDate = expectedDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", orderId=" + (order != null ? order.getId() : null) +
                ", shipmentId=" + (shipment != null ? shipment.getId() : null) +
                ", status='" + status + '\'' +
                ", expectedDate=" + expectedDate +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
