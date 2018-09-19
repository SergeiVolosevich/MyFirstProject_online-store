package by.volosevich.mystore.model;

import java.math.BigDecimal;
import java.util.*;

public class Product {
    private int productId;
    private String mark;
    private String model;
    private StringBuffer description;
    private Map<String, String> properties = new HashMap<>();//jenerics for value Key and Value
    private Queue<String> photo = new ArrayDeque<>();//foto read documentation on browser
    private int quantity;
    private StringBuffer review;
    private Queue<String> fotoReview = new ArrayDeque<>();//посмотреть как прально делать гетер и сеттер для очереди
    private String reviewerName;
    private String subdirectory;
    private String catalog;
    private BigDecimal price;
    private Date lastChangePrice;
    private String currency; //char currency or Enum;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public StringBuffer getDescription() {
        return description;
    }

    public void setDescription(StringBuffer description) {
        this.description = description;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public Queue<String> getPhoto() {
        return photo;
    }

    public void setPhoto(Queue<String> photo) {
        this.photo = photo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StringBuffer getReview() {
        return review;
    }

    public void setReview(StringBuffer review) {
        this.review = review;
    }

    public Queue<String> getFotoReview() {
        return fotoReview;
    }

    public void setFotoReview(Queue<String> fotoReview) {
        this.fotoReview = fotoReview;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getSubdirectory() {
        return subdirectory;
    }

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getLastChangePrice() {
        return lastChangePrice;
    }

    public void setLastChangePrice(Date lastChangePrice) {
        this.lastChangePrice = lastChangePrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", description=" + description +
                ", properties=" + properties +
                ", photo=" + photo +
                ", quantity=" + quantity +
                ", review=" + review +
                ", fotoReview=" + fotoReview +
                ", reviewerName='" + reviewerName + '\'' +
                ", subdirectory='" + subdirectory + '\'' +
                ", catalog='" + catalog + '\'' +
                ", price=" + price +
                ", lastChangePrice=" + lastChangePrice +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId() &&
                getQuantity() == product.getQuantity() &&
                Objects.equals(getMark(), product.getMark()) &&
                Objects.equals(getModel(), product.getModel()) &&
                Objects.equals(getDescription(), product.getDescription()) &&
                Objects.equals(getProperties(), product.getProperties()) &&
                Objects.equals(getPhoto(), product.getPhoto()) &&
                Objects.equals(getReview(), product.getReview()) &&
                Objects.equals(getFotoReview(), product.getFotoReview()) &&
                Objects.equals(getReviewerName(), product.getReviewerName()) &&
                Objects.equals(getSubdirectory(), product.getSubdirectory()) &&
                Objects.equals(getCatalog(), product.getCatalog()) &&
                Objects.equals(getPrice(), product.getPrice()) &&
                Objects.equals(getLastChangePrice(), product.getLastChangePrice()) &&
                Objects.equals(getCurrency(), product.getCurrency());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getProductId(), getMark(), getModel(), getDescription(), getProperties(), getPhoto(), getQuantity(), getReview(), getFotoReview(), getReviewerName(), getSubdirectory(), getCatalog(), getPrice(), getLastChangePrice(), getCurrency());
    }
}
