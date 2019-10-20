package pl.cz.shop.dto;

import pl.cz.shop.entity.Product;
import pl.cz.shop.enums.ProductUnitEnum;

import javax.persistence.*;
import javax.validation.constraints.Min;

public class ProductDto {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private ProductUnitEnum unit;
    private String mainPhoto;

    public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.unit = product.getUnit();
        this.mainPhoto = product.getMainPhoto();
    }

    public ProductDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public ProductUnitEnum getUnit() {
        return unit;
    }

    public void setUnit(ProductUnitEnum unit) {
        this.unit = unit;
    }
}
