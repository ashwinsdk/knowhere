package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table( name = "wishlist" )
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "wishlist_seq", sequenceName = "wishlist_sequence")
    @Column(name = "wishlist_id",nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productType_id", nullable = false)
    private ProductType type;

    public Wishlist() {
        super();
    }

    public Wishlist(Long id, User user, ProductType type) {
        System.out.println();
        this.id = id;
        this.user = user;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "id=" + id +
                ", user=" + user +
                ", type=" + type +
                '}';
    }
}
