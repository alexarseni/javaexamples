package pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import pms.bean.Product;

public class ProductService {

private List<Product> listOfProducts = new ArrayList<Product>();

public String storeProduct(Product product) {
	
	int flag=0;
	if(listOfProducts.size()==0) {
		listOfProducts.add(product);
		return "Product details stored succcessfully";
	}else {
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				flag++;
				break;
			}
		}
	}
	
	if(flag!=0) {
		return "product id must be unique";
	}else {
		listOfProducts.add(product);
		//flag=0;
		return "Product details stored succcessfully";
	}

}

public int numberOfProduct() {
	return listOfProducts.size();
}

}
