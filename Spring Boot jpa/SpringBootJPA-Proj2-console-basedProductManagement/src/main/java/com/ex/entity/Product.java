package com.ex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence_generator")
@SequenceGenerator(name = "my_sequence_generator", sequenceName = "my_entity_seq", allocationSize = 50)
private Long productId ;

@Column
@NonNull
private String productName ;

@Column
@NonNull
private String description ;

@Column
@NonNull
private Double price;
}
