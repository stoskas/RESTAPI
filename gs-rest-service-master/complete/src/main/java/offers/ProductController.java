package offers;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

	// request for all products.
	@GetMapping("/Productlist")
	public List<Product> Index() {
		return Productlist.GetProducts();
	}

	// request to sort products by price(ascending)
	@GetMapping("/Productlist/priceasc")
	public List<Product> getSortedasc() {

		List<Product> asdf = Productlist.GetProducts();
		asdf.sort(new PriceComparatorasc());
		return asdf;
	}
	// request to sort products by price(descending)

	@GetMapping("/Productlist/pricedesc")
	public List<Product> getSorteddesc() {

		List<Product> asdf = Productlist.GetProducts();
		asdf.sort(new PriceComparatordesc());
		return asdf;
	}

	// request for specific product(by id).
	@GetMapping("/Productlist/id/{id}")
	public Product show(@PathVariable String id) {
		int productId = Integer.parseInt(id);
		return Productlist.getProductbyId(productId);

	}
	// request for specific product(by price).

	@GetMapping("/Productlist/price/{price}")
	public Product show(@PathVariable Double price) {

		return Productlist.getProductbyPrice(price);

	}

	// create new product
	@PostMapping("/Productlist/post")
	public Product create(@RequestBody Product body) {

		Productlist.createProduct(body);
		return body;

	}
	//delete product

	@DeleteMapping("/Productlist/delete/{id}")
	public static boolean delete(@PathVariable String id) {
		int productId = Integer.parseInt(id);
		return Productlist.delete(productId);
	}

}
