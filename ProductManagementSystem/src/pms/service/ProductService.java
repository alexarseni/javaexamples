package pms.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import pms.bean.Product;
import pms.exception.ProductPriceException;

public class ProductService {

private List<Product> listOfProducts = new ArrayList<Product>(); //i do not want other methods to access
//the listOfProducts directly, only through my own method
//this variable is initialised everytime we run the program, data is not saved permanently
{

listOfProducts.add(new Product(1, "TV", 5600)); //initial product for testing purposes
}

public String storeProduct(Product product) {
	
	int flag=0; //make sure flag is zero everytime we run this code to add a new product
	try {
		if(listOfProducts.size()==0) {
			if(product.getPrice()<0) {
				throw new ProductPriceException("Price must be >0");
			}
			else {
				listOfProducts.add(product);
				return "Product details stored succcessfully";
			}
		}
			
		else {
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
 //we may have to raise an exception if the user has input a duplicate id or a negative price
		if(flag!=0) {
			return "product id must be unique";
		}else if(product.getPrice()<0){
			throw new ProductPriceException("Price must be > 0");
		}
		else{
			listOfProducts.add(product);
			//flag=0;
			return "Product details stored succcessfully"; //we reutrn it, not print it, because we do not want to interact with
			//input/output devices
		}
		
	}
	catch (Exception e) {
		return e.toString();
	}
}

public int numberOfProduct() {
	return listOfProducts.size();
}

public String deleteProduct(int pid) {
	int flag =0; 
	Iterator<Product> li = listOfProducts.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		if(p.getPid() == pid) { //find the elements with the argument pid
			listOfProducts.remove(p); //removing by the object, not the iterator
			//li.remove();
			flag++; //parsing the Arraylist elements one by one
			break;
		}
	}
	if (flag == 0) {
		return "Product not present";
	}
	else {
		return "Product removed successfully";
	}
	
}

public String updateProduct(Product product) {
	int flag = 0;
	Iterator<Product> li = listOfProducts.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		if(p.getPid()==product.getPid()) { //find the element we want to update based on its pid
			p.setPrice(product.getPrice()); //update the old price with the newly inserted price
			flag++;
			break;
		}
		
	}
	if (flag ==0) return"Product not present";
	else return "Product updated successfully";
	}

public List<Product> displayAllProducts() {
	return listOfProducts;
	
}
}
