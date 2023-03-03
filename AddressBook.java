package Assignment.Day9.AddressBook;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("welcome to the AddressBook program.\n..............................");

        System.out.println("please enter no. of people : ");
        int n = sc.nextInt();
        Contact[] contact = new Contact[n];
        AddressBook addressBook = new AddressBook();
        addressBook.add_contact(contact);
        addressBook.edit_Contact(contact);

    }

    public void add_contact(Contact[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Contact();
            System.out.println("enter the firstname :");
            ar[i].setFirst_name(sc.next());
            System.out.println("enter the lastname :");
            ar[i].setLast_name(sc.next());
            System.out.println("enter the address :");
            ar[i].setAddress(sc.nextLine());
            System.out.println("enter the city :");
            ar[i].setCity(sc.nextLine());
            System.out.println("enter the state :");
            ar[i].setState(sc.nextLine());
            System.out.println("enter the zip :");
            ar[i].setZip(sc1.nextInt());
            System.out.println("enter the phone_no :");
            ar[i].setPhone_no(sc1.nextInt());
            System.out.println("enter the Email :");
            ar[i].setEmail(sc.nextLine());
            System.out.println();

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
                    System.out.println("enter the new details : ");
                    System.out.println("-------------------------------");
                    System.out.println("enter the firstname :");
                    ar[i].setFirst_name(sc.next());
                    System.out.println("enter the lastname :");
                    ar[i].setLast_name(sc.next());
                    System.out.println("enter the address :");
                    ar[i].setAddress(sc.nextLine());
                    System.out.println("enter the city :");
                    ar[i].setCity(sc.nextLine());
                    System.out.println("enter the state :");
                    ar[i].setState(sc.nextLine());
                    System.out.println("enter the zip :");
                    ar[i].setZip(sc1.nextInt());
                    System.out.println("enter the phone_no :");
                    ar[i].setPhone_no(sc1.nextInt());
                    System.out.println("enter the Email :");
                    ar[i].setEmail(sc.nextLine());
                }
                else System.out.println("user not found");
            }
        }
        else System.out.println("OK..");
    }
}
