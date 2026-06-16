package com.tnf.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table( name = "address" )
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "address_seq", sequenceName = "address_sequence")
    @Column(name = "address_id", nullable = false)
    private Long id;

    @Column(name = "receiver_name", nullable = false, length = 100)
    private String receiverName;

    @Column(name = "receiver_phone", nullable = false, length = 20)
    private String receiverPhone;

    @Column(name = "receiver_address", nullable = false)
    private String receiverAddress;

    @Column(name = "city", nullable = false, length = 100)
    private String cityName;

    @Column(name = "state", nullable = false, length = 100)
    private String stateName;

    @Column(name = "country", nullable = false, length = 100)
    private String countryName;

    @Column(name = "landmark", nullable = false, length = 100)
    private String landmarkName;

    @Column(name = "pincode", nullable = false, length = 20)
    private String pincodeValue;

    @Column(name = "instructions", length = 20,nullable = false)
    private String instructionsValue;

    @Column(name = "is_default", nullable = false)
    @ColumnDefault("false")
    private Boolean isDefault;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Address() {
        super();
    }

    public Address(Long id, String receiverName, String receiverPhone, String receiverAddress, String cityName, String stateName, String countryName, String landmarkName, String pincodeValue, String instructionsValue, Boolean isDefault, User user) {
        this.id = id;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverAddress = receiverAddress;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.landmarkName = landmarkName;
        this.pincodeValue = pincodeValue;
        this.instructionsValue = instructionsValue;
        this.isDefault = isDefault;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }

    public String getPincodeValue() {
        return pincodeValue;
    }

    public void setPincodeValue(String pincodeValue) {
        this.pincodeValue = pincodeValue;
    }

    public String getInstructionsValue() {
        return instructionsValue;
    }

    public void setInstructionsValue(String instructionsValue) {
        this.instructionsValue = instructionsValue;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", landmarkName='" + landmarkName + '\'' +
                ", pincodeValue='" + pincodeValue + '\'' +
                ", instructionsValue='" + instructionsValue + '\'' +
                ", isDefault=" + isDefault +
                ", user=" + user +
                '}';
    }
}
