package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "catalog_seq", sequenceName = "catalog_sequence")
    @Column(name = "catalog_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "catalog_name", nullable = false, length = 100)
    private String name;

    public Catalog() {
        super();
    }

    public Catalog(Long id, Category category, String name) {
        super();
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", categoryId=" + (category != null ? category.getId() : null) +
                ", name='" + name + '\'' +
                '}';
    }
}
