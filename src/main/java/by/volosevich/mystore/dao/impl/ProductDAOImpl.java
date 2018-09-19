package by.volosevich.mystore.dao.impl;

import by.volosevich.mystore.dao.ProductDAO;
import by.volosevich.mystore.dao.mappers.ProductMapper;
import by.volosevich.mystore.dao.sql_statement.Statements;
import by.volosevich.mystore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    public JdbcTemplate jdbcTemplate;


    @Override
    public List<Product> getProductListBySelectedSubcatalog(String subcatalog) {
        List<Product> listProducts = jdbcTemplate.query(Statements.SQL_SELECT_PRODUCTS_AND_PRICE_BY_SUBCATALOG, new Object[]{
                subcatalog
        }, new ProductMapper());
        return listProducts;
    }

}
