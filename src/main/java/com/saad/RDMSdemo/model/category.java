package com.saad.RDMSdemo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class category {
    @Id
    private String categoryId;
    private String categoryName;

    @ManyToMany( cascade = CascadeType.ALL)
    List<products> productsList=new ArrayList<>();

    public List<products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<products> productsList) {
        this.productsList = productsList;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
