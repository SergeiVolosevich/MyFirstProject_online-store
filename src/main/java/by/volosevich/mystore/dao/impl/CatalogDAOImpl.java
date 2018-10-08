package by.volosevich.mystore.dao.impl;

import by.volosevich.mystore.dao.CatalogDAO;
import by.volosevich.mystore.dao.sql_statement.Statements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CatalogDAOImpl implements CatalogDAO {


    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<String> getCataloglist() {
        List<String> cataloglist = jdbcTemplate.queryForList(Statements.SQL_SELECT_CATALOGS, String.class);
        return cataloglist;
    }

    @Override
    public List<String> getSubcatalogs(String catalogname) {
        List<String> subcataloglist = jdbcTemplate.queryForList(Statements.SQL_SELECT_SUBCATALOGS_BY_CATALOG_NAME, new Object[]{
                catalogname}, String.class);

        return subcataloglist;
    }

}
