package by.volosevich.mystore.dao;

import by.volosevich.mystore.model.Catalog;

import java.util.List;

public interface CatalogDAO {

 List<String> getCataloglist ();
 List<String> getSubcatalogs(String catalogname);
}
