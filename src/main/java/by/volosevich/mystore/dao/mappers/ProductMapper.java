package by.volosevich.mystore.dao.mappers;

import by.volosevich.mystore.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setMark(resultSet.getString("mark"));
        product.setModel(resultSet.getString("model"));
        product.setDescription(new StringBuffer(resultSet.getString("description")));
        product.setQuantity(resultSet.getInt("quantity"));
        product.setPrice(resultSet.getBigDecimal("price"));
        product.setCurrency(resultSet.getString("currency"));
        product.setSubdirectory(resultSet.getString("subdirectory_name"));
        return product;
    }
}
