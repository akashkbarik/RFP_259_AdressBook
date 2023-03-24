package Assignment.Day9.AddressBook;

import java.util.*;
import java.util.stream.Collectors;

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
    public static final int CREATE_ADDRESS_BOOK = 1;
    public static final int EDIT_ADDRESS_BOOK = 2;
    public static final int DISPLAY_ADDRESS_BOOK = 3;
    private static final int SEARCH = 5;
    private static final int BYCITY = 1;
    private static final int BYSTATE = 2;
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Contact> list = new LinkedList<>();

    static Map<String, LinkedList<Contact>> map = new HashMap<>();

    public void addDetails() {

        Contact info = new Contact();
        System.out.println("Enter the first name");
        String fname = sc.next();
        info.setFirst_name(fname);
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

        list.add(info);
        System.out.println("list before removing duplicates: ");
        list.forEach(System.out::println);
        List<Contact> uniqueContacts = list
                .stream()
                .filter(i -> !(i.getFirst_name().equals(fname)))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("list after removing dupllicates : ");
        uniqueContacts.forEach(System.out::println);

    }

    public void display() {

        System.out.println("list are : \n");
        if (list.isEmpty()) {
            System.out.println("empty!");
        } else {
            System.out.println(list + "\n");
        }
    }


    public void editDetails() {

        System.out.println("Confirm your first name to edit details: ");
        String confirmName = sc.next();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirst_name().equals(confirmName)) {
                System.out.println("Select form below to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                int edit = sc.nextInt();

                switch (edit) {
                    case FIRST_NAME:
                        System.out.println("Enter first name");
                        list.get(i).setFirst_name(sc.next());
                        break;
                    case LAST_NAME:
                        System.out.println("Enter Last name");
                        list.get(i).setLast_name(sc.next());
                        break;
                    case ADDRESS:
                        System.out.println("Enter Address");
                        list.get(i).setAddress(sc.next());
                        break;
                    case CITY:
                        System.out.println("Enter City");
                        list.get(i).setCity(sc.next());
                        break;
                    case STATE:
                        System.out.println("Enter State");
                        list.get(i).setState(sc.next());
                        break;
                    case ZIP:
                        System.out.println("Enter Zip");
                        list.get(i).setZip(sc.nextInt());
                        break;
                    case MOBILE_NUMBER:
                        System.out.println("Enter Mobile number");
                        list.get(i).setPhone_no(sc.nextInt());
                        break;
                    case EMAIL:
                        System.out.println("Enter new E-mail");
                        list.get(i).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(list);
            } else
                System.out.println("Enter a valid First name");
        }
    }

    public void deleteDetails() {
        System.out.println("Confirm the first name of the person to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getFirst_name().equals(confirmName)) {
                list.remove(i);
                System.out.println("List After removing" + list);

            } else {
                System.out.println("Enter valid first name");
            }
        }
    }

    public void createAddressBookMenu() {

        System.out.println("Enter the name of address book: ");
        String addressBookName = sc.next();

        if (map.containsKey(addressBookName)) {
            list = map.get(addressBookName);
            System.out.println("Adress book name exits, enter different name");
        }

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display Contact\n5.search person\n6.Exit");
            int choose1 = sc.nextInt();
            if (choose1 == 6) {
                System.out.println("Exited");
                break;
            }
            switch (choose1) {
                case ADD_DETAILS:
                    addDetails();
                    break;
                case EDIT_DETAILS:
                    editDetails();
                    break;
                case DELETE_DETAILS:
                    deleteDetails();
                    break;
                case DISPLAY:
                    display();
                    break;

                default:
                    System.out.println("Choose valid option");
                    break;
            }

            map.put(addressBookName, list);
        }
    }

    public void editAddressBookMenu() {
        System.out.println("Enter the name of address book: ");
        String addressBookOldName = sc.next();

        AddressBook book = new AddressBook();
        if (map.containsKey(addressBookOldName)) {
            list = map.get(addressBookOldName);
            while (true) {
                System.out.println("Choose what you want to do: ");
                System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display contact.\n5.Exit");
                int choose1 = sc.nextInt();
                if (choose1 == 5) {
                    System.out.println("Exited");
                    break;
                }
                switch (choose1) {
                    case ADD_DETAILS:
                        book.addDetails();
                        break;
                    case EDIT_DETAILS:
                        book.editDetails();
                        break;
                    case DELETE_DETAILS:
                        book.deleteDetails();
                        break;
                    case DISPLAY:
                        book.display();
                        break;

                    default:
                        System.out.println("Choose valid option");
                        break;
                }
                map.put(addressBookOldName, list);
                for (Map.Entry m : map.entrySet()) {
                    System.out.println(m.getKey() + " " + m.getValue());
                }
            }
        } else {
            System.out.println("Enter valid address book name");
        }
    }

    public void displayMap() {


        if (map.isEmpty()) {
            System.out.println("no contact found!");
        } else
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
    }

    public void AddressBookOptions() {

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4\n4.exit");
            int choose = sc.nextInt();

            if (choose == 4) {
                System.out.println("Exited");
                break;
            }

            switch (choose) {
                case CREATE_ADDRESS_BOOK:
                    createAddressBookMenu();
                    break;

                case EDIT_ADDRESS_BOOK:
                    editAddressBookMenu();
                    break;
                case DISPLAY_ADDRESS_BOOK:
                    displayMap();
                    break;
                case SEARCH:
                    System.out.println("Choose what you want to do: ");
                    System.out.println("1.search by city.\n2.search by state.\n3.exit");
                    int choose2 = sc.nextInt();
                    if (choose2==3){
                        System.out.println("exited");
                        break;
                    }
                    switch (choose2){
                        case BYCITY:
                            System.out.println("enter a city name : ");
                            String city= sc.next();
                            List<Contact> uniqueContacts = map.entrySet()
                                    .stream()
                                    .flatMap(people->people.getValue().stream())
                                    .filter(i -> i.getCity().equals(city))
                                    .collect(Collectors.toList());
                            System.out.println("list of people from city "+city+ "are :");
                            uniqueContacts.forEach(System.out::println);
                            break;
                        case BYSTATE:
                            System.out.println("enter a state name : ");
                            String state= sc.next();
                            List<Contact> uniqueContacts2 = map.entrySet()
                                    .stream()
                                    .flatMap(people->people.getValue().stream())
                                    .filter(i -> i.getState().equals(state))
                                    .collect(Collectors.toList());
                            System.out.println("list of people from city "+state+ "are :");
                            uniqueContacts2.forEach(System.out::println);
                            break;
                    }



                default:
                    System.out.println("Enter valid option");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        System.out.println("Welcome to Address Book Program");
        book.AddressBookOptions();
    }
}

