package LAB_6;

import java.util.Date;

public class Staff extends Person {
    private Department department;
    private Date joined;
    private String education;
    private String certification;
    private String languages;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Date getJoined() {
        return joined;
    }

    public String getEducation() {
        return education;
    }

    public String getCertification() {
        return certification;
    }

    public String getLanguages() {
        return languages;
    }
}
