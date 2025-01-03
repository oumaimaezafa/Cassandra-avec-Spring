package ma.oumaimaezafa.crudwithcasandra.service;


import ma.oumaimaezafa.crudwithcasandra.entities.Product;
import ma.oumaimaezafa.crudwithcasandra.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteProduct(String id) {
        repository.deleteById(id);
    }

    public Product updateProduct(String id, Product updatedProduct) {
        Optional<Product> existingProduct = repository.findById(id);

        if (existingProduct.isPresent()) {
            Product productToUpdate = existingProduct.get();
            productToUpdate.setName(updatedProduct.getName());
            productToUpdate.setDescription(updatedProduct.getDescription());
            productToUpdate.setPrice(updatedProduct.getPrice());
            return repository.save(productToUpdate);
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }
}
