package com.tnf.models;


import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator( name = "cart_seq", sequenceName = "cart_sequence" )
    @Column(name = "cart_id", nullable = false)
    private Long id;

    @Column(name = "quantity", nullable = false)
    @ColumnDefault("1")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productType_id", nullable = false)
    private ProductType type;

    public Cart(){
        super();
    }

    public Cart(Long id, Integer quantity, User user, ProductType type) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.user = user;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        return "Cart{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", userId=" + (user != null ? user.getId() : null) +
                ", typeId=" + (type != null ? type.getId() : null) +
                '}';
    }
}
