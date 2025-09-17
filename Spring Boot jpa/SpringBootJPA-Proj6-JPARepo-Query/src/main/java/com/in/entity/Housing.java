package com.in.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "HOUSE")
@Data                       // Lombok: getters, setters, toString, equals, hashCode
@NoArgsConstructor          // Lombok: no-args constructor
@AllArgsConstructor         // Lombok: all-args constructor
@Builder                    // Lombok: builder pattern
public class Housing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // --- Required fields ---
    @NonNull
    @Column(name = "House_Owner_Name", nullable = false)
    private String ownerName;

    @NonNull
    @Column(name = "House_Address", nullable = false)
    private String address;

    @NonNull
    @Column(name = "House_City", nullable = false)
    private String city;

    // --- Optional fields ---
    @NonNull
    @Column(name = "House_State")
    private String state;

    @NonNull
    @Column(name = "House_Postal_Code")
    private String postalCode;

    @NonNull
    @Column(name = "House_Price")
    private Double price;

    @NonNull
    @Column(name = "House_Bedrooms")
    private Integer bedrooms;

    @NonNull
    @Column(name = "House_Bathrooms")
    private Integer bathrooms;
}
