package com.example.InventoryShop.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int quantity;

    // Getters and Setters
}

