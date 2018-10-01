package by.volosevich.mystore.dao.sql_statement;

public class Statements {

    public static final String SQL_SELECT_PRODUCTS_AND_PRICE_BY_SUBCATALOG = "select goods.mark," +
            " goods.model,goods.description,goods.quantity,price.price,price.currency, " +
            "goods.subdirectory_name from goods join price on goods.goods_id=price.goods_id where subdirectory_name= ?";
    public static final String SQL_SELECT_CATALOGS = "SELECT * FROM CATALOG";
    public static final String SQL_SELECT_SUBCATALOGS_BY_CATALOG_NAME = "SELECT subdirectory_name FROM subdirectory WHERE CATALOG_NAME =?";
    public static final String SQL_UPDATE_USER_INFO = "insert into user_info (user_name, name, surname, patronymic, sex, birthday)\n" +
            "values (?, ?, ? , ?, ?,?)";
    public static final String SQL_UDATE_USERS = "insert into users (username, password, email) values (?,?,?)";
}
