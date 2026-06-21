package com.tnf.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "shipment_seq", sequenceName = "shipment_sequence")
    @Column(name = "shipment_id", nullable = false)
    private Long id;

    @Column(name = "location", length = 255)
    private String location;

    @Column(name = "shipment_date")
    private LocalDateTime shipmentDate;

    public Shipment() {
        super();
    }

    public Shipment(Long id, String location, LocalDateTime shipmentDate) {
        super();
        this.id = id;
        this.location = location;
        this.shipmentDate = shipmentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDateTime shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", shipmentDate=" + shipmentDate +
                '}';
    }
}
