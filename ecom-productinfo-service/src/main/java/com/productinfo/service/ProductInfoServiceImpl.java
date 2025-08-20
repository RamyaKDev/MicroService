package com.productinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productinfo.exceptions.ProductNotFoundException;
import com.productinfo.model.Product;

@Service
public class ProductInfoServiceImpl implements IProductInfoService{
	
	@Autowired
	private RestTemplate template;
	//pass the application name instead of localhost
	private final String BASEURL="http://localhost:8081/product-api/v1/products";
	@Override
	public Product getById(int productId)  {
		//http://localhost:8081/product-api/v1/products/productId/1
		String url=BASEURL.concat("/productId/")+productId;
		ResponseEntity<Product> productEntity=template.getForEntity(url,  Product.class);
		System.out.println("Get product by id....."+productEntity.getStatusCode());
		return productEntity.getBody();
		 
	}

	@Override
	public List<Product> getAll() {
		//http://localhost:8081/product-api/v1/products
		ResponseEntity<List> productEntity=template.getForEntity(BASEURL, List.class);
		List<Product> products=productEntity.getBody();
		System.out.println("Get all products ....."+productEntity.getStatusCode());
		
		return products;
	}

	@Override
	public List<Product> getByBrand(String mbrand)  {
//		 http://localhost:8081/product-api/v1/products/brand/Samsung
		String url=BASEURL.concat("/brand/").concat(mbrand);
		ResponseEntity<List> productEntity=template.getForEntity(url, List.class);
		List<Product> products=productEntity.getBody();
		System.out.println("Get products by brand....."+productEntity.getStatusCode());
		
		return products;
	}

	@Override
	public List<Product> getByCategory(String mcategory)  {
//		 http://localhost:8081/product-api/v1/products/category?category=electronics
		String url=BASEURL.concat("/category?category=").concat(mcategory);
		ResponseEntity<List> productEntity=template.getForEntity(url, List.class);
		List<Product> products=productEntity.getBody();
		System.out.println("Get products by category....."+productEntity.getStatusCode());
		
		return products;
	}

}
