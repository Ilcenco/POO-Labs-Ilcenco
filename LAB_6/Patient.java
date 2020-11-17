package LAB_6;

import java.util.Date;

public class Patient extends Person {
    private int id;
    private String name = super.getFullName();
    private String gender = super.getGender();
    private Date birthDate = super.getBirthDate();
    private int age;
    private Date accepted;
    private String sickness;
    private String prescriptions;
    private String allergies;
    private String specialReqs;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setSpecialReqs(String specialReqs) {
        this.specialReqs = specialReqs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public Date getAccepted() {
        return accepted;
    }

    public String getSickness() {
        return sickness;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getSpecialReqs() {
        return specialReqs;
    }
}
