package contact;

/**
 * Created by shiv on 1/12/16.
 */
class Contact {
    private String name; // First Name
    private Contact next; // Reference for next Contact

    public Contact(String tempName) {
        this.name = tempName;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getNext() {
        return next;
    }

    public void setNext(Contact next) {
        this.next = next;
    }
}
