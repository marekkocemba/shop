package pl.cz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.cz.shop.dto.ProductDto;
import pl.cz.shop.entity.Product;
import pl.cz.shop.enums.ProductUnitEnum;
import pl.cz.shop.service.ProductService;

import javax.validation.Valid;

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

    @GetMapping("/products/form")
    private String getProductForm(Model model){

        model.addAttribute("product", new Product());

        return "product_form";
    }

    @PostMapping("/products")
    private String saveProduct(@ModelAttribute("product") Product product,
            Model model){
        try {
            productService.saveProduct(product);
            model.addAttribute("naszaListaProduktow", productService.getProducts());
            return "product_list";
        }catch (Exception e){
            model.addAttribute("product", product);
            return "product_form";
        }
    }
}
