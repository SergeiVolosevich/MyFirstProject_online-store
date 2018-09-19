package by.volosevich.mystore.dao;

import by.volosevich.mystore.model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getProductListBySelectedSubcatalog(String subcatalog);

}
