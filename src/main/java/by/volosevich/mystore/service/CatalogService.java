package by.volosevich.mystore.service;

import by.volosevich.mystore.model.Catalog;

import java.util.List;

public interface CatalogService {

     List<String> getCataloglist();
     List<String> getSubcatalogList(String catalogname);
}
