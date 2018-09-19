package by.volosevich.mystore.service.impl;

import by.volosevich.mystore.dao.ProductDAO;
import by.volosevich.mystore.model.Product;
import by.volosevich.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProductListBySelectedSubcatalog(String subcatalog) {
        return productDAO.getProductListBySelectedSubcatalog(subcatalog);
    }
}
