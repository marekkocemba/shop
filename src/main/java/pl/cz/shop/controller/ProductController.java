package pl.cz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.cz.shop.entity.User;
import pl.cz.shop.service.ProductService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

    @GetMapping("/products")
    private String getUserList(Model model) {
       
        return "product_list";
    }
}
