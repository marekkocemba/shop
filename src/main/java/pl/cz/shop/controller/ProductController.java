package pl.cz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.cz.shop.entity.Product;
import pl.cz.shop.enums.ProductUnitEnum;
import pl.cz.shop.service.ProductService;

//@Controller @Service @Repository @Component @Configuration @Bean

@Controller
public class ProductController {

    // Czeste pytanie podczas rozmowy jak są wstrykiwane zaleznosci w Springu
    // Odp: Przez pole, konstruktor i metode

    private ProductService productService;

    //@Autowired nie jest to potrzebne
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    private String getProductList(Model model) {

        model.addAttribute("naszaListaProduktow", productService.getProducts());
        return "product_list";
    }

    @GetMapping("/products/{id}")
    private String getProductById(@PathVariable("id") Long id, Model model) {

        model.addAttribute("product", productService.getProductById(id));
        return "product_details";
       // propozycja :  model.addAttribute("imageList", imageService.getImagesByProductId);
    }
}
