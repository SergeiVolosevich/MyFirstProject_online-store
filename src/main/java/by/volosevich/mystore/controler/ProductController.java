package by.volosevich.mystore.controler;

import by.volosevich.mystore.model.Product;
import by.volosevich.mystore.service.CatalogService;
import by.volosevich.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/subcatalog/{subcatalog}")
    public String getListProducts(HttpServletRequest request, HttpServletResponse response,
                                  @PathVariable String subcatalog, Model model) {
        model.addAttribute("productList",productService.getProductListBySelectedSubcatalog(subcatalog));
        return "products";
    }
}
