package src.main.java.bank.models;

public class Member {
    private String firstName;
    private String lastName;
    private String address;
    private String dob;
    private String phoneNumber;
    private String emailId;

    public Member(String firstName, String lastName, String address, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
