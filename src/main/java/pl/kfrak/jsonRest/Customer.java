package pl.kfrak.jsonRest;

/**
 * Created by RENT on 2017-05-25.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String idNumber;

    public Customer(){}

    public Customer(String firstname, String lastName, int birthYear, String idnumber) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

