package pl.cz.shop.service;

import org.springframework.stereotype.Service;
import pl.cz.shop.entity.Product;
import pl.cz.shop.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList(){
        return productRepository.findAll();
    }
}