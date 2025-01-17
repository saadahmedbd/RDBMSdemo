package com.saad.RDMSdemo.model;

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
public class products {

    @Id
    private String productId;
    private String productName;

    @ManyToMany(mappedBy = "productsList")
    List<category> categoryList=new ArrayList<>();

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<category> categoryList) {
        this.categoryList = categoryList;
    }
}
