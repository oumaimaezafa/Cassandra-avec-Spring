package ma.oumaimaezafa.crudwithcasandra.web;


import ma.oumaimaezafa.crudwithcasandra.entities.Product;
import ma.oumaimaezafa.crudwithcasandra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);
        return "Product removed with id: " + id;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
        Product updated = service.updateProduct(id, updatedProduct);
        if (updated != null) {
            return updated; // Retourne le produit mis à jour
        } else {
            throw new RuntimeException("Product not found with id " + id);
        }
    }
}
