package by.volosevich.mystore.service.impl;

import by.volosevich.mystore.dao.CatalogDAO;
import by.volosevich.mystore.model.Catalog;
import by.volosevich.mystore.service.CatalogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CatalogServiceImpl implements CatalogService {

@Resource
    private CatalogDAO catalogDAO;

    @Override
    public List<String> getCataloglist() {
        return catalogDAO.getCataloglist();
    }

    @Override
    public List<String> getSubcatalogList(String catalogname) {
        return catalogDAO.getSubcatalogs(catalogname);
    }
}
