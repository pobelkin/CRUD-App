package com.crud.productlist.models;

import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The brand is required")
    private String brand;

    @NotEmpty(message = "The category name is required")
    private String category;

    @DecimalMin(value = "0.0", inclusive = true, message = "The price must be at least 0")
    private double price;

    @Size(min = 10, message = "The description should be at least 10 characters")
    @Size(max = 2000, message = "The description cannot exceed 2000 characters")
    private String description;

    private MultipartFile imageFile;


    public @NotEmpty(message = "The name is required") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "The name is required") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "The brand is required") String getBrand() {
        return brand;
    }

    public void setBrand(@NotEmpty(message = "The brand is required") String brand) {
        this.brand = brand;
    }

    public @NotEmpty(message = "The category name is required") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty(message = "The category name is required") String category) {

        this.category = category;
    }

    @DecimalMin(value = "0.0", inclusive = true, message = "The price must be at least 0")
    public double getPrice() {
        return price;
    }

    public void setPrice(@DecimalMin(value = "0.0", inclusive = true, message = "The price must be at least 0") double price) {
        this.price = price;
    }

    public @Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 2000, message = "The description cannot exceed 2000 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 2000, message = "The description cannot exceed 2000 characters") String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
