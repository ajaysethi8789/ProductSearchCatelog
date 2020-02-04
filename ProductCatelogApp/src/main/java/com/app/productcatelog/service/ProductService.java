package com.app.productcatelog.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.app.productcatelog.adapter.ProductAdapter;
import com.app.productcatelog.model.ProductModel;
import com.google.gson.Gson;

@Service
public class ProductService implements ProductAdapter {

	final static Logger logger = Logger.getLogger(ProductService.class);

	List<ProductModel> productList = new ArrayList<ProductModel>();

	@Override
	public String addProductDetail(ProductModel product) {
		// TODO Auto-generated method stub
		logger.info("addProductDetail function");
		logger.debug("Product Details" + product);
		productList.add(product);
		return "Product detail has been saved successfully";
	}

	@Override
	public List<ProductModel> getProductDetailsByBrand(String brandName) {

		logger.info("getProductDetailsByBrand function");
		logger.debug("brand Name " + brandName);
		List<ProductModel> brandList = new ArrayList<ProductModel>();
		for (ProductModel product : productList) {
			if (product.getBrandName().equals(brandName)) {
				brandList.add(product);
			}
		}
		return brandList;
	}

	@Override
	public List<ProductModel> getProductDetailsBySeller(String sellerName) {
		logger.info("getProductDetailsBySeller function");
		logger.debug("sellerName Name " + sellerName);

		List<ProductModel> sellerList = new ArrayList<ProductModel>();
		for (ProductModel product : productList) {
			if (product.getSellerName().equals(sellerName)) {
				sellerList.add(product);
			}
		}
		return sellerList;
	}

}
