package by.volosevich.mystore.dao;

import by.volosevich.mystore.dao.impl.OrderDAOImpl;
import by.volosevich.mystore.model.Order;

public interface OrderDAO {

    OrderDAOImpl createOrder(Order order);

}
