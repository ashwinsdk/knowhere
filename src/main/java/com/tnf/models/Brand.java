package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "brand_seq", sequenceName = "brand_sequence")
    @Column(name = "brand_id", nullable = false)
    private Long id;

    @Column(name = "brand_name", nullable = false, length = 100)
    private String name;

    public Brand() {
        super();
    }

    public Brand(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
