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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id", nullable = false)
    private Catalog catalog;

    @Column(name = "subcategory_name", nullable = false, length = 100)
    private String name;

    public Subcategory() {
        super();
    }

    public Subcategory(Long id, Catalog catalog, String name) {
        super();
        this.id = id;
        this.catalog = catalog;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
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
                ", catalog=" + catalog +
                ", name='" + name + '\'' +
                '}';
    }
}
