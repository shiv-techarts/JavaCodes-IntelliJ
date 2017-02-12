package contactapp;

import contact.ContactList;

public class Main {

    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.insert("Shiv");
        list.insert("Rakesh");
        list.insert("Sumit");
        list.insert("Shubham");
        list.insert("Pooja");

        list.printList();
        System.out.println("Size: " + list.get_size());
        System.out.println("==================");
        list.delete("Shiv");
        list.printList();
        System.out.println("Size: " + list.get_size());

    }
}
