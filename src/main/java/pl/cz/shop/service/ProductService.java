package pl.cz.shop.service;

import org.springframework.stereotype.Service;
import pl.cz.shop.entity.Product;
import pl.cz.shop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
//Czym sie rózni wzorzec MVC od wzorców projektowych GOF ?
    private final ProductRepository productRepository;

    //Autowired niepotrzebny
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(Long id){

        //uwaga na optionale findById to optional, get to product
        return productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product not found by id: "+ id)
        );
    }
}