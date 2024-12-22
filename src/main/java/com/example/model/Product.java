package com.example.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private Integer prodId;
    private String prodName;
    private String description;
    private String brand;
    private Integer price;
    private String category;
    private Date releasedate;
    private boolean available;
    private Integer quantity;


}
