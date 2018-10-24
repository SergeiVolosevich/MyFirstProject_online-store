package by.volosevich.mystore.model;

import by.volosevich.mystore.configuration.validation.annotations.ConfirmPassword;
import by.volosevich.mystore.configuration.validation.annotations.DuplicateUserName;

import javax.validation.GroupSequence;
import javax.validation.constraints.*;
import java.util.Objects;


@ConfirmPassword(message = "{confirmPassword}")
public class Users {

    @DuplicateUserName(message = "{duplicate.username}")
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$", message = "{userName}")
    @NotEmpty(message = "{userName}")
    private String userName;


    @Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$", message = "{password}")
    private String password;

    @NotEmpty(message = "{confirmPassword.not.empty}")
    private String copyPassword;

    @NotEmpty(message = "{email.not.empty}")
    @Email(message = "{email}")
    private String email;

    private String name;


    private String surname;


    private String patronymic;


    private String sex;

    //    @NotEmpty
//    @Pattern(regexp = "(0[1-9]|1[0-9]|2[0-9]|3[01])[- /.](0[1-9]|1[012])[- /.][0-9]{4}")
    private String birthdayDate;

    public Users() {
    }

    public String getCopyPassword() {
        return copyPassword;
    }

    public void setCopyPassword(String copyPassword) {
        this.copyPassword = copyPassword;
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
        return "Users{" +
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
        if (!(o instanceof Users)) return false;
        Users user = (Users) o;
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
