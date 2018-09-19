package by.volosevich.mystore.controler;


import by.volosevich.mystore.model.Product;
import by.volosevich.mystore.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    @GetMapping(value = "/")
    public String ListCatalogs(Model model) {
        model.addAttribute("listCatalogs", catalogService.getCataloglist());
        return "welcome";
    }

    @GetMapping(value = "/{catalog}")
    public String ListSubcatalogs(HttpServletRequest request, HttpServletResponse response,
                                  @PathVariable String catalog, Model model) {
        model.addAttribute("listSubcatalogs", catalogService.getSubcatalogList(catalog));

        return "welcome";
    }

    @GetMapping(value = "/toDo")
    public String toDoList() {
        return "toDo";
    }
}