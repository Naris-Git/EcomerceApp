package com.nari.EcomerceApp.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	@Id
	private int prodId;
	 private String prodName;
	 private int prodCost;
	 
	 public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdCost() {
		return prodCost;
	}
	public void setProdCost(int prodCost) {
		this.prodCost = prodCost;
	}
	public Product(int prodId, String prodName, int prodCost) {
	
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
