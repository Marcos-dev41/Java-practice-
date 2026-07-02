package com.webApp.demo.service;
import com.webApp.demo.model.Product;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101,"Iphone",7000),
        new Product(102,"Xiaomi",3000),
        new Product(103,"Nokia",2000),
        new Product(104,"samsung",5000)));
    public List<Product> getProducts(){
      return products;
    }
    public Product getProductById(int prodId){
        return products.stream()
            .filter(p->p.getProdId() == prodId)
            .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
    public void updateProduct(Product prod){
        int index = 0;
        for (int i=0; i<products.size();i++){
            if(products.get(i).getProdId()== prod.getProdId())
            index= i;
        }
        products.set(index, prod);
        
    }
    public void deleteProduct(int prodId){
        products.removeIf(p -> p.getProdId() == prodId);
    }
}
