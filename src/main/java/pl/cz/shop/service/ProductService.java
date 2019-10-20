package pl.cz.shop.service;

import org.springframework.stereotype.Service;
import pl.cz.shop.dto.ProductDto;
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

    public Product saveProduct(ProductDto productDto){
        //tak naprawde powinien to być dtos

        Product product = new Product(productDto);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("no product found by id (delete): "+id));
        productRepository.delete(product);
        //productRepository.deleteById(id);
    }
}