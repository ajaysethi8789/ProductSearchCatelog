package com.app.productcatelog.adapter;

import java.util.List;
import com.app.productcatelog.model.ProductModel;

public interface ProductAdapter {

	public String addProductDetail(ProductModel product);

	public List<ProductModel> getProductDetailsByBrand(String brandName);

	public List<ProductModel> getProductDetailsBySeller(String sellerName);

}
