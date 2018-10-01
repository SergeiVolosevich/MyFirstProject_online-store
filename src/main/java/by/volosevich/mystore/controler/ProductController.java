package by.volosevich.mystore.controler;

import by.volosevich.mystore.exeption.NullProductList;
import by.volosevich.mystore.model.Product;
import by.volosevich.mystore.service.CatalogService;
import by.volosevich.mystore.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Controller
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/subcatalog/{subcatalog}")
    public String getListProducts(HttpServletRequest request, HttpServletResponse response,
                                  @PathVariable String subcatalog, Model model, Locale locale) throws NullProductList {
        List<Product> list = productService.getProductListBySelectedSubcatalog(subcatalog);

        if (list.size()!=0){
            model.addAttribute("productList",list);
            return "products";
        } else {
            throw new NullProductList();
        }

    }


    @ExceptionHandler(NullProductList.class)
    public ModelAndView handleNullProductList(Exception e, Locale locale){
        logger.error("Null product list" + e.getMessage());
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error",messageSource.getMessage("error",null,locale));
        return modelAndView;
    }
}
