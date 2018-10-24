package by.volosevich.mystore.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Order {

    private int orderId;
    private Users user;
    private Date orderDate;
    private Map<Product,Integer> productList;
    private OrderStatusEnum orderStatus;
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String housingNumber;
    private String apartment;
    private String postCode;
    private BigDecimal summa;
    private TypeOfPaymentEnum typeOfPayment;
    private PaymentStatusEnum paymentStatus;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<Product, Integer> productList) {
        this.productList = productList;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHousingNumber() {
        return housingNumber;
    }

    public void setHousingNumber(String housingNumber) {
        this.housingNumber = housingNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }

    public TypeOfPaymentEnum getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(TypeOfPaymentEnum typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", productList=" + productList +
                ", orderStatus=" + orderStatus +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", housingNumber='" + housingNumber + '\'' +
                ", apartment='" + apartment + '\'' +
                ", postCode='" + postCode + '\'' +
                ", summa=" + summa +
                ", typeOfPayment=" + typeOfPayment +
                ", paymentStatus=" + paymentStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getOrderId() == order.getOrderId() &&
                Objects.equals(getUser(), order.getUser()) &&
                Objects.equals(getOrderDate(), order.getOrderDate()) &&
                Objects.equals(getProductList(), order.getProductList()) &&
                getOrderStatus() == order.getOrderStatus() &&
                Objects.equals(getCountry(), order.getCountry()) &&
                Objects.equals(getCity(), order.getCity()) &&
                Objects.equals(getStreet(), order.getStreet()) &&
                Objects.equals(getHouseNumber(), order.getHouseNumber()) &&
                Objects.equals(getHousingNumber(), order.getHousingNumber()) &&
                Objects.equals(getApartment(), order.getApartment()) &&
                Objects.equals(getPostCode(), order.getPostCode()) &&
                Objects.equals(getSumma(), order.getSumma()) &&
                getTypeOfPayment() == order.getTypeOfPayment() &&
                getPaymentStatus() == order.getPaymentStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getUser(), getOrderDate(), getProductList(), getOrderStatus(),
                getCountry(), getCity(), getStreet(), getHouseNumber(), getHousingNumber(), getApartment(),
                getPostCode(), getSumma(), getTypeOfPayment(), getPaymentStatus());
    }
}
