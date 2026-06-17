package com.tnf.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "inventory_seq", sequenceName = "inventory_sequence")
    @Column(name = "inventory_id", nullable = false)
    private Long id;

    @Column(name = "type_id", nullable = false)
    private Long typeId;

    @Column(name = "available_quantity")
    private Integer availableQuantity;

    @Column(name = "reserved_quantity")
    private Integer reservedQuantity;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Inventory() {
        super();
    }

    public Inventory(Long id, Long typeId, Integer availableQuantity, Integer reservedQuantity,
                     LocalDateTime updatedAt) {
        super();
        this.id = id;
        this.typeId = typeId;
        this.availableQuantity = availableQuantity;
        this.reservedQuantity = reservedQuantity;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Integer reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", availableQuantity=" + availableQuantity +
                ", reservedQuantity=" + reservedQuantity +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
