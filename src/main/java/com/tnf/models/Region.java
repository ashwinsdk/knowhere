package com.tnf.models;


import jakarta.persistence.*;

@Entity
@Table( name = "Region" )
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator( name = "region_seq", sequenceName = "region_sequence" )
    @Column( name = "region_id", nullable = false)
    private Long id;

    @Column( name = "region_name", nullable = false, length = 100)
    private String regionName;

    @Column( name = "currency", nullable = false, length = 20)
    private String currency;

    public Region() {
        super();
    }

    public Region(Long id, String regionName, String currency) {
        super();
        this.id = id;
        this.regionName = regionName;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", regionName='" + regionName + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
