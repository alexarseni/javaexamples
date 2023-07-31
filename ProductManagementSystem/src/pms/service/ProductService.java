package pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import pms.bean.Product;

public class ProductService {

private List<Product> listOfProducts = new ArrayList<Product>(); //i do not want other methods to access
//the listOfProducts directly, only through my own method

public String storeProduct(Product product) {
	
	int flag=0;
	if(listOfProducts.size()==0) {
		listOfProducts.add(product);
		return "Product details stored succcessfully";
	}else {
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			//if the inserted pid is equal to any other pid already inserted then the item should be discarded
			if(p.getPid()==product.getPid()) { //list allows for duplicates
				flag++; //parsing the Arraylist elements one by one
				break;
			}
		}
	}
	if(flag!=0) {
		return "product id must be unique";
	}else {
		listOfProducts.add(product);
		//flag=0;
		return "Product details stored succcessfully"; //we reutrn it, not print it, because we do not want to interact with
		//input/output devices
	}

}

public int numberOfProduct() {
	return listOfProducts.size();
}

}
