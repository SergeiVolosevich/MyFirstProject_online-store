package by.volosevich.mystore.model;

import java.util.List;
import java.util.Objects;

public class ShoppingCard {

    private int shoppingCardUd;
    private Users user;
    private List<Product> productList;

    public ShoppingCard() {
    }

    public int getShoppingCardUd() {
        return shoppingCardUd;
    }

    public void setShoppingCardUd(int shoppingCardUd) {
        this.shoppingCardUd = shoppingCardUd;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "shoppingCardUd=" + shoppingCardUd +
                ", user=" + user +
                ", productList=" + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCard)) return false;
        ShoppingCard that = (ShoppingCard) o;
        return getShoppingCardUd() == that.getShoppingCardUd() &&
                Objects.equals(getUser(), that.getUser()) &&
                Objects.equals(getProductList(), that.getProductList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShoppingCardUd(), getUser(), getProductList());
    }
}
