package com.nari.EcomerceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nari.EcomerceApp.Model.Product;
import com.nari.EcomerceApp.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	

	@GetMapping("products")
	public List<Product> getAllProductsDetails(){
		
		return service.getAllProductsDetails();
	}
	
	@GetMapping("/products/{pId}")
	public Product getProductById(@PathVariable int pId) {
		
		return service.getProdutById(pId);
	}
	
	@PostMapping("products")
	public String saveProduct(@RequestBody Product prod) {
		
		return service.saveProduct(prod);
	}
	
	@PutMapping("/products/{id}")
	public String updateProduct(@RequestBody Product prod, @PathVariable int id) {
		return service.updateProduct(prod ,id);
	}
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	
	
}
