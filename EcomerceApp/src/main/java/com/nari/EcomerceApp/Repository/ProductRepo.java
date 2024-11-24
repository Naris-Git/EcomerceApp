package com.nari.EcomerceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nari.EcomerceApp.Model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
