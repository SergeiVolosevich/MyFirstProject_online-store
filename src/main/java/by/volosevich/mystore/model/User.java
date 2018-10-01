package by.volosevich.mystore.model;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.Objects;

public class User {

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$")
    private String userName;

    @NotEmpty
    @Pattern(regexp= "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$")
    private String password;


    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String name;

    @NotEmpty
    private String surname;

    @NotEmpty
    private String patronymic;

    @NotEmpty
    private String sex;

    @NotEmpty
    @Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01])[- /.](0[1-9]|1[012])[- /.][0-9]{4}")
    private String birthdayDate;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Objects.equals(getPatronymic(), user.getPatronymic()) &&
                Objects.equals(getSex(), user.getSex()) &&
                Objects.equals(getBirthdayDate(), user.getBirthdayDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserName(), getPassword(), getEmail(), getName(), getSurname(), getPatronymic(), getSex(), getBirthdayDate());
    }
}
