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

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    private String getUserList(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        System.out.println(user == null ? "null" : user.getLogin());
        model.addAttribute("productList", productService.getProductList());
        return "product_list";
    }
}
