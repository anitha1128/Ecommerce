package ecom.com.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import ecom.com.model.Product;

public interface ProductService {

    // Save a product
    Product saveProduct(Product product);

    // Get all products
    List<Product> getAllProducts();

    // Delete a product by its ID
    Boolean deleteProduct(Integer id);

    // Get a product by its ID
    Product getProductById(Integer id);

    // Update a product along with an uploaded file
    Product updateProduct(Product product, MultipartFile file);

    // Get all active products by category
    List<Product> getAllActiveProducts(String category);

    // Find active products with pagination
    Page<Product> findByIdActiveTrue(Pageable pageable);

    // Search for products by a string
    List<Product> searchProduct(String ch);

    // Get active products with pagination
    Page<Product> getAllActiveProductPagination(Integer pageNo, Integer pageSize, String category);
    
    public Page<Product> searchProductPagination(Integer pageNo, Integer pageSize, String ch);
    
    public Page<Product> getAllProductsPagination(Integer pageNo, Integer pageSize);

	Page<Product> searchActiveProductPagination(Integer pageNo, Integer pageSize, String category, String ch);

	//public Page<Product> searchActiveProductPagination(Integer pageNo, Integer pageSize, String category, String ch);
}
