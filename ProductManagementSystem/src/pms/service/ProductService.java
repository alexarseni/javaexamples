package pms.service;

import java.util.ArrayList;
import java.util.List;

import pms.bean.Product;

public class ProductService {

private List<Product> listOfProducts = new ArrayList<Product>();

public String storeProduct(Product product) {
	
	listOfProducts.add(product);
	return "Product details stored succcessfully";
}

public int numberOfProduct() {
	return listOfProducts.size();
}

}
