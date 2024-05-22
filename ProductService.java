import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<Integer, Product> productRepository;

    public ProductService() {
        productRepository = new HashMap<>();
        // Dummy data for demonstration
        productRepository.put(1, new Product(1, "Product A", "Description of Product A", 100.0));
        productRepository.put(2, new Product(2, "Product B", "Description of Product B", 150.0));
        productRepository.put(3, new Product(3, "Product C", "Description of Product C", 200.0));
    }

    public Product getProductById(int id) {
        return productRepository.get(id);
    }
}
