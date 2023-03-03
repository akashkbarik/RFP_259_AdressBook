package Assignment.Day9.AddressBook;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("welcome to the AddressBook program.\n..............................");

        System.out.println("please enter no. of people : ");
        int n = sc.nextInt();
        Contact[] contact = new Contact[n];
        AddressBook addressBook = new AddressBook();
        int ch;
        do {
            System.out.println("enter your choice");

            System.out.println("1: add contact");
            System.out.println("2: edit contact");
            System.out.println("3: delete contact");
            System.out.println("4: print");
            System.out.println("5: exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addressBook.add_Contact(contact);
                    break;
                case 2:
                    addressBook.edit_Contact(contact);
                    break;
                case 3:
                    addressBook.delete_Contact(contact);
                    System.out.println("deleted successfully");
                    break;
                case 4:
                    addressBook.print_Contact(contact);
                    break;
                default:
                    break;
            }
        }
        while (ch != 5);
    }

    public void print_Contact(Contact[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("contact :" + ar[i]);
        }
    }

    public void add_Contact(Contact[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Contact();
            System.out.println("enter the firstname :");
            ar[i].setFirst_name(sc.next());
            System.out.println("enter the lastname :");
            ar[i].setLast_name(sc.next());
            System.out.println("enter the address :");
            ar[i].setAddress(sc.next());
            System.out.println("enter the city :");
            ar[i].setCity(sc.next());
            System.out.println("enter the state :");
            ar[i].setState(sc.next());
            System.out.println("enter the zip :");
            ar[i].setZip(sc.nextInt());
            System.out.println("enter the phone_no :");
            ar[i].setPhone_no(sc.nextInt());
            System.out.println("enter the Email :");
            ar[i].setEmail(sc.next());
            System.out.println("contact added\n............");

        }
    }

    public void edit_Contact(Contact[] ar) {
        System.out.println("want to edit: (y/n) ");
        String y = sc.next();
        if (y.equalsIgnoreCase("y")) {
            for (int i = 0; i < ar.length; i++) {
                System.out.println("enter the name you want to change ");
                String name = sc.next();
                if (name.equals(ar[i].getFirst_name())) {

                    for (int j = 0; j < ar.length; j++) {
                        System.out.println("enter the new details : ");
                        System.out.println("-------------------------------");
                        System.out.println("enter the firstname :");
                        ar[i].setFirst_name(sc.next());
                        System.out.println("enter the lastname :");
                        ar[i].setLast_name(sc.next());
                        System.out.println("enter the address :");
                        ar[i].setAddress(sc.next());
                        System.out.println("enter the city :");
                        ar[i].setCity(sc.next());
                        System.out.println("enter the state :");
                        ar[i].setState(sc.next());
                        System.out.println("enter the zip :");
                        ar[i].setZip(sc.nextInt());
                        System.out.println("enter the phone_no :");
                        ar[i].setPhone_no(sc.nextInt());
                        System.out.println("enter the Email :");
                        ar[i].setEmail(sc.next());
                        ar[j] = ar[i];

                        System.out.println("edited successfully\n..............");
                    }
                } else System.out.println("user not found");
            }
        } else System.out.println("OK..");
    }

    public void delete_Contact(Contact[] ar) {
        System.out.println("want to delete: choose (y/n) ");
        String d = sc.next();
        if (d.equalsIgnoreCase("y")) {

            System.out.println("enter the name you want to delete ");
            String name = sc.next();
            for (int i = 0; i < ar.length; i++) {
                if (name.equals(ar[i].getFirst_name())) {
                    for (int j = 0; j < ar.length - 1; j++) {
                        ar[j] = ar[j + 1];
                    }
                }
            }
        }
    }
}
