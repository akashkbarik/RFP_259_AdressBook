package Assignment.Day9.AddressBook;

import java.util.Objects;

public class Contact {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    int phone_no;
    String Email;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return this.getFirst_name().equals(contact.getFirst_name());
    }

    @Override
    public String toString() {
        return "\ndetails of "+first_name+" : | " +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone_no=" + phone_no +
                ", Email='" + Email + '\'' +
                " |";
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, address, city, state, zip, phone_no, Email);
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public String getEmail() {
        return Email;
    }
}

