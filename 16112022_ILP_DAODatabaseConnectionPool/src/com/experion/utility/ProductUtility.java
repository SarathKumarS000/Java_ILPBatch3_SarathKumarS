package com.experion.utility;

import java.util.List;

import com.experion.entity.Product;
import com.experion.service.ProductService;
import com.experion.service.ProductServiceImpl;

public class ProductUtility {
	
	private static ProductService productService = new ProductServiceImpl();
	public static void main(String[] args) {
		
		listAllProducts();
		
	}	
		private static void listAllProducts() {
			List<Product> productList = productService.listAllProducts();
			System.out.println("Product Code" + " 	" + "Product Name");
			for(Product product : productList)
				System.out.println(product.getProductCode() + " 	" + product.getProductName());
		}
	}


