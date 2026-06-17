package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "subcategory")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "subcategory_seq", sequenceName = "subcategory_sequence")
    @Column(name = "subcategory_id", nullable = false)
    private Long id;

    @Column(name = "catalog_id", nullable = false)
    private Long catalogId;

    @Column(name = "subcategory_name", nullable = false, length = 100)
    private String name;

    public Subcategory() {
        super();
    }

    public Subcategory(Long id, Long catalogId, String name) {
        super();
        this.id = id;
        this.catalogId = catalogId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "id=" + id +
                ", catalogId=" + catalogId +
                ", name='" + name + '\'' +
                '}';
    }
}
