import java.util.Scanner;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public void displayProductDetails(int productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product ID to view details: ");
        int productId = scanner.nextInt();
        
        controller.displayProductDetails(productId);
    }
}
