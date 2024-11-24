package com.nari.EcomerceApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nari.EcomerceApp.Model.Product;
import com.nari.EcomerceApp.Repository.ProductRepo;

@Service
public class ProductService {

	
	
//	List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Iphone",70000),
//			                             new Product(102,"Samsung",80000),
//			                             new Product(103,"RealMe",60000)));
	@Autowired
	private ProductRepo repo;
	
	public List<Product> getAllProductsDetails() {
		
		return repo.findAll();
	}

	public Product getProdutById(int prodId) {
		
		return repo.findById(prodId).orElse(new Product());
				                
	}

	public String saveProduct(Product prod) {
		repo.save(prod);
		return "product saved Successfully.." +prod;
	}

	public String updateProduct(Product prod, int id) {
		repo.save(prod);
		return "Product Updated successfully : " +id;
	}

	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Product deleted successfully " +id;
	}

}
