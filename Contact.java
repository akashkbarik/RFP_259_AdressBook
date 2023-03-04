package Assignment.Day9.AddressBook;

public class Contact {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    int phone_no;
    String Email;

    Contact(String first_name,
            String last_name,
            String address,
            String city,
            String state,
            int zip,
            int phone_no,
            String Email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_no = phone_no;
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Contact | " +
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

