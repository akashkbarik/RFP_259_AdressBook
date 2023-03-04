package Assignment.Day9.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("welcome to the AddressBook program.\n..............................");

        ArrayList<Contact> contact = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        int choice = 0;
        while (choice != 5) {
            System.out.println("enter your choice");

            System.out.println("1: add contact");
            System.out.println("2: edit contact");
            System.out.println("3: delete contact");
            System.out.println("4: print");
            System.out.println("5: exit");
            System.out.println("enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.editContact(contact);
                    break;
                case 3:
                    addressBook.deleteContact(contact);
                    System.out.println("deleted successfully");
                    break;
                case 4:
                    addressBook.printContact(contact);
                    break;
                default:
                    break;
            }
        }
    }

    public void printContact(ArrayList<Contact> contacts) {
        System.out.println("Contact : ");
        for (Contact contact : contacts) {
            System.out.println(contact + ", ");
        }
    }

    public void addContact(ArrayList<Contact> contacts) {

        System.out.println("enter the firstname :");
        String firstname = sc.next();
        System.out.println("enter the lastname :");
        String lastname = sc.next();
        System.out.println("enter the address :");
        String address = sc.next();
        System.out.println("enter the city :");
        String city = sc.next();
        System.out.println("enter the state :");
        String state = sc.next();
        System.out.println("enter the zip :");
        int zip = sc.nextInt();
        System.out.println("enter the phone_no :");
        int phone = sc.nextInt();
        System.out.println("enter the Email :");
        String email = sc.next();
        contacts.add(new Contact(firstname, lastname, address, city, state, zip, phone, email));
        System.out.println("contact added\n............");

    }


    public void editContact(ArrayList<Contact> contacts) {
        System.out.println("want to edit: (y/n) ");
        String y = sc.next();
        if (y.equalsIgnoreCase("y")) {
            for (Contact contact : contacts) {
                System.out.println("enter the name you want to change ");
                String name = sc.next();
                if (name.equals(contact.getFirst_name())) {
                    System.out.println("enter the new details : ");
                    System.out.println("-------------------------------");
                    System.out.println("enter the firstname :");
                    String firstname = sc.next();
                    System.out.println("enter the lastname :");
                    String lastname = sc.next();
                    System.out.println("enter the address :");
                    String address = sc.next();
                    System.out.println("enter the city :");
                    String city = sc.next();
                    System.out.println("enter the state :");
                    String state = sc.next();
                    System.out.println("enter the zip :");
                    int zip = sc.nextInt();
                    System.out.println("enter the phone_no :");
                    int phone = sc.nextInt();
                    System.out.println("enter the Email :");
                    String email = sc.next();

                    System.out.println("edited successfully\n..............");
                } else System.out.println("user not found");
            }
        }
    }

    public void deleteContact(ArrayList<Contact> contacts) {
        System.out.println("want to delete: choose (y/n) ");
        String d = sc.next();
        if (d.equalsIgnoreCase("y")) {

            System.out.println("enter the name you want to delete ");
            String name = sc.next();
            for (Contact contact : contacts)
                if (name.equals(contact.getFirst_name())) {
                    contacts.remove(contact);
                }
        }
    }
}


