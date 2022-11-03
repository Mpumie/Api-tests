package pojo;

import java.util.List;

public class SignUp {
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String contactNumber;
    private String contactPerson;
    private List<Industry> Industry;
    private  String preferredCommunicationType;

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<pojo.Industry> getIndustry() {
        return Industry;
    }

    public void setIndustry(List industry) {
        Industry = industry;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPreferredCommunicationType() {
        return preferredCommunicationType;
    }

    public void setPreferredCommunicationType(String preferredCommunicationType) {
        this.preferredCommunicationType = preferredCommunicationType;
    }
}
