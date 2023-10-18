package model;

import java.util.Objects;

public class BugReporter {

    private String firstname;
    private String lastname;
    private String email;

    public BugReporter(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Improper email address");
        } else {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email);
    }
}
