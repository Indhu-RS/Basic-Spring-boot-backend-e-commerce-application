package com.example.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ProductRepo;
import com.example.model.Product;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //List <Product> products=new ArrayList<Product>{Arrays.asList(new Product(101,"IPhone",50000),new Product(102, "Samsung", 70000))};
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product product) {
        repo.save(product);
        }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

        

}
