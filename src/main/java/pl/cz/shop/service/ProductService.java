package pl.cz.shop.service;

import org.springframework.stereotype.Service;
import pl.cz.shop.entity.Product;
import pl.cz.shop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        Product product = new Product();
        product.setId(1L);
        product.setTitle("Pomarańcze");
        product.setDescription("Kraj pochodzenia: Hiszpania");
        product.setMainPhoto("https://i.iplsc.com/pomarancze-obnizaja-cisnienie/0001QINR5B5TNVGN-C122-F4.jpg");
        product.setPrice(5.00);
        product.setUnit("kilogram");

        Product product2 = new Product();
        product2.setId(2L);
        product2.setTitle("Banany");
        product2.setDescription("Zielone, import");
        product2.setMainPhoto("http://echokamienia.pl/wp-content/uploads/2016/06/Banan.jpg");
        product2.setPrice(4.00);
        product2.setUnit("kilogram");

        Product product3 = new Product();
        product3.setId(3L);
        product3.setTitle("Arbuz");
        product3.setDescription("Krajowy");
        product3.setMainPhoto("https://www.ogrodinfo.pl/wp-content/uploads/2018/09/fotolia_arbuz_d-696x392.jpg");
        product3.setPrice(7.00);
        product3.setUnit("sztuka");

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

}