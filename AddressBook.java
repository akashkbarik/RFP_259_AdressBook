package Assignment.Day9.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    //    variables of contacts
    public static final int FIRST_NAME = 1;
    public static final int LAST_NAME = 2;
    public static final int ADDRESS = 3;
    public static final int CITY = 4;
    public static final int STATE = 5;
    public static final int ZIP = 6;
    public static final int MOBILE_NUMBER = 7;
    public static final int EMAIL = 8;
    //    variables of Address book
    public static final int ADD_DETAILS = 1;
    public static final int EDIT_DETAILS = 2;
    public static final int DELETE_DETAILS = 3;
    public static final int DISPLAY = 4;
    public static final int CREATE_ADDRESS_BOOK=1;
    public static final int EDIT_ADDRESS_BOOK=2;
    public static final int DISPLAY_ADDRESS_BOOK=3;
    static Scanner sc = new Scanner(System.in);
    ArrayList<Contact> arrayDetails = new ArrayList<>();
    static HashMap<String, ArrayList<Contact>> hashmap = new HashMap<>();
    static AddressBook details = new AddressBook();

    public void addDetails() {
        Contact info = new Contact();
        System.out.println("Enter the first name");
        info.setFirst_name(sc.next());
        System.out.println("Enter the last name");
        info.setLast_name(sc.next());
        System.out.println("Enter the address");
        info.setAddress(sc.next());
        System.out.println("Enter the city");
        info.setCity(sc.next());
        System.out.println("Enter the state");
        info.setState(sc.next());
        System.out.println("Enter the email");
        info.setEmail(sc.next());
        System.out.println("Enter the zip code");
        info.setZip(sc.nextInt());
        System.out.println("Enter the phone number");
        info.setPhone_no(sc.nextInt());
        arrayDetails.add(info);
        System.out.println(arrayDetails);
    }

    public void display() {
        System.out.println(arrayDetails);
    }

    public void editDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String confirmName = sc.next();

        for (int i = 0; i < arrayDetails.size(); i++) {
            if (arrayDetails.get(i).getFirst_name().equals(confirmName)) {
                System.out.println("Select form below to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                int edit = sc.nextInt();

                switch (edit) {
                    case FIRST_NAME:
                        System.out.println("Enter first name");
                        arrayDetails.get(i).setFirst_name(sc.next());
                        break;
                    case LAST_NAME:
                        System.out.println("Enter Last name");
                        arrayDetails.get(i).setLast_name(sc.next());
                        break;
                    case ADDRESS:
                        System.out.println("Enter Address");
                        arrayDetails.get(i).setAddress(sc.next());
                        break;
                    case CITY:
                        System.out.println("Enter City");
                        arrayDetails.get(i).setCity(sc.next());
                        break;
                    case STATE:
                        System.out.println("Enter State");
                        arrayDetails.get(i).setState(sc.next());
                        break;
                    case ZIP:
                        System.out.println("Enter Zip");
                        arrayDetails.get(i).setZip(sc.nextInt());
                        break;
                    case MOBILE_NUMBER:
                        System.out.println("Enter Mobile number");
                        arrayDetails.get(i).setPhone_no(sc.nextInt());
                        break;
                    case EMAIL:
                        System.out.println("Enter new E-mail");
                        arrayDetails.get(i).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(arrayDetails);
            } else
                System.out.println("Enter a valid First name");
        }
    }

    public void deleteDetails() {
        System.out.println("Confirm the first name of the person to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < arrayDetails.size(); i++) {

            if (arrayDetails.get(i).getFirst_name().equals(confirmName)) {
                arrayDetails.remove(i);
                System.out.println("List After removing" + arrayDetails);

            } else {
                System.out.println("Enter valid first name");
            }
        }
    }

    public void createAddressBook() {

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
            int choose = sc.nextInt();

            if (choose == 4) {
                System.out.println("Exited");
                break;
            }

            switch (choose) {
                case CREATE_ADDRESS_BOOK:
                    System.out.println("Enter the name of address book: ");
                    String address_name = sc.next();

                    if (hashmap.containsKey(address_name)) {
                        System.out.println("Adress book name exits, enter different name");
                        break;
                    }

                    ArrayList<Contact> new_address_book = new ArrayList<>();
                    arrayDetails = new_address_book;
                    while (true) {
                        System.out.println("Choose what you want to do: ");
                        System.out
                                .println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display Contact\n5.Exit");
                        int choose1 = sc.nextInt();
                        if (choose1 == 5) {
                            System.out.println("Exited");
                            break;
                        }
                        switch (choose1) {
                            case ADD_DETAILS:
                                details.addDetails();
                                break;
                            case EDIT_DETAILS:
                                details.editDetails();
                                break;
                            case DELETE_DETAILS:
                                details.deleteDetails();
                                break;
                            case DISPLAY:
                                details.display();
                                break;
                            default:
                                System.out.println("Choose valid option");
                                break;
                        }
                        hashmap.put(address_name, arrayDetails);
                        System.out.println(hashmap);
                    }
                    break;

                case EDIT_ADDRESS_BOOK:
                    System.out.println("Enter the name of address book: ");
                    String address_name_old = sc.next();

                    if (hashmap.containsKey(address_name_old)) {

                        ArrayList<Contact> old_address_book = new ArrayList<>();
                        arrayDetails = old_address_book;
                        arrayDetails = hashmap.get(address_name_old);
                        while (true) {
                            System.out.println("Choose what you want to do: ");
                            System.out.println(
                                    "1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display contact.\n5.Exit");
                            int choose1 = sc.nextInt();
                            if (choose1 == 4) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
                                case ADD_DETAILS:
                                    details.addDetails();
                                    break;
                                case EDIT_DETAILS:
                                    details.editDetails();
                                    break;
                                case DELETE_DETAILS:
                                    details.deleteDetails();
                                    break;
                                case DISPLAY:
                                    details.display();
                                    break;
                                default:
                                    System.out.println("Choose valid option");
                                    break;
                            }
                            hashmap.put(address_name_old, arrayDetails);
                            System.out.println(hashmap);
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                    break;

                case DISPLAY_ADDRESS_BOOK:
                    System.out.println(hashmap);
                    break;

                default:
                    System.out.println("Enter valid option");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        details.createAddressBook();
    }
}


