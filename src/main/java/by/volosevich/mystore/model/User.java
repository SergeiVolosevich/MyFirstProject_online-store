package by.volosevich.mystore.model;

import java.util.Date;
import java.util.Objects;

public class User {

    private int userID;
    private String userLoggin;
    private String email;
    private String password;
    private Date userDateCreation;// Test what kind of DataType use
    private UserStatusEnum userStatus;
    private String userRole;
    private StringBuffer userFullNumber;
    private String userName;
    private String userSurname;
    private String userPatronymic;
    private UserGenderEnum userGender;
    private Date birthdayDate; // Test what kind of DataType use
    //store address with RawMapper or ResultSet
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String housingNumber;
    private String apartment;
    private String postCode;
//

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserLoggin() {
        return userLoggin;
    }

    public void setUserLoggin(String userLoggin) {
        this.userLoggin = userLoggin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUserDateCreation() {
        return userDateCreation;
    }

    public void setUserDateCreation(Date userDateCreation) {
        this.userDateCreation = userDateCreation;
    }

    public UserStatusEnum getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatusEnum userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public StringBuffer getUserFullNumber() {
        return userFullNumber;
    }

    public void setUserFullNumber(StringBuffer userFullNumber) {
        this.userFullNumber = userFullNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPatronymic() {
        return userPatronymic;
    }

    public void setUserPatronymic(String userPatronymic) {
        this.userPatronymic = userPatronymic;
    }

    public UserGenderEnum getUserGender() {
        return userGender;
    }

    public void setUserGender(UserGenderEnum userGender) {
        this.userGender = userGender;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
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

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userLoggin='" + userLoggin + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userDateCreation=" + userDateCreation +
                ", userStatus=" + userStatus +
                ", userRole='" + userRole + '\'' +
                ", userFullNumber=" + userFullNumber +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userPatronymic='" + userPatronymic + '\'' +
                ", userGender=" + userGender +
                ", birthdayDate=" + birthdayDate +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", housingNumber='" + housingNumber + '\'' +
                ", apartment='" + apartment + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserID() == user.getUserID() &&
                Objects.equals(getUserLoggin(), user.getUserLoggin()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getUserDateCreation(), user.getUserDateCreation()) &&
                getUserStatus() == user.getUserStatus() &&
                Objects.equals(getUserRole(), user.getUserRole()) &&
                Objects.equals(getUserFullNumber(), user.getUserFullNumber()) &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getUserSurname(), user.getUserSurname()) &&
                Objects.equals(getUserPatronymic(), user.getUserPatronymic()) &&
                getUserGender() == user.getUserGender() &&
                Objects.equals(getBirthdayDate(), user.getBirthdayDate()) &&
                Objects.equals(getCountry(), user.getCountry()) &&
                Objects.equals(getCity(), user.getCity()) &&
                Objects.equals(getStreet(), user.getStreet()) &&
                Objects.equals(getHouseNumber(), user.getHouseNumber()) &&
                Objects.equals(getHousingNumber(), user.getHousingNumber()) &&
                Objects.equals(getApartment(), user.getApartment()) &&
                Objects.equals(getPostCode(), user.getPostCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUserLoggin(), getEmail(), getPassword(),
                getUserDateCreation(), getUserStatus(), getUserRole(), getUserFullNumber(), getUserName(),
                getUserSurname(), getUserPatronymic(), getUserGender(), getBirthdayDate(), getCountry(),
                getCity(), getStreet(), getHouseNumber(), getHousingNumber(), getApartment(), getPostCode());
    }
}
