package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table( name = "product_image" )

public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_image_seq")
    @SequenceGenerator(name = "product_image_seq", sequenceName = "product_image_sequence", allocationSize = 1)
    @Column(name = "product_image_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    private ProductType productType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id", nullable = false)
    private Image image;

    public ProductImage(Long id, ProductType productType, Image image) {
        this.id = id;
        this.productType = productType;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductImage [id=" + id + ", productTypeId=" + (productType != null ? productType.getId() : null)
                + ", imageId=" + (image != null ? image.getId() : null) + "]";
    }

    public ProductImage() {
        super();
    }


}