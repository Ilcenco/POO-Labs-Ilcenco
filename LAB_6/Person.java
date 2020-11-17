package LAB_6;

import java.util.Date;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String FullName = givenName+" "+middleName+" "+familyName;
    private Date birthDate;
    private String Gender;
    private String homeAdress;
    private String phone;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFullName() {
        return FullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return Gender;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public String getPhone() {
        return phone;
    }
}
