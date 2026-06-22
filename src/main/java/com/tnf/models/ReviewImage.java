package com.tnf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "review_image")
public class ReviewImage {
    @Id
    @Column(name="review_id")
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "review_id")
    private Review review;

    @Column(name = "image_id")
    private Integer imageId;

    public ReviewImage() {
    }

    public ReviewImage(Integer id, Review review, Integer imageId) {
        this.id = id;
        this.review = review;
        this.imageId = imageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
