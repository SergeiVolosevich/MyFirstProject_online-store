package by.volosevich.mystore.service;

import by.volosevich.mystore.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductListBySelectedSubcatalog(String subcatalog);

}
