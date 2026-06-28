package contactservice;

import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact) {

        if (getContact(contact.getContactId()) != null) {
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String contactId) {

        Contact contact = getContact(contactId);

        if (contact != null) {
            contacts.remove(contact);
            return true;
        }

        return false;
    }

    public boolean updateFirstName(String contactId, String firstName) {

        Contact contact = getContact(contactId);

        if (contact != null) {
            contact.setFirstName(firstName);
            return true;
        }

        return false;
    }

    public boolean updateLastName(String contactId, String lastName) {

        Contact contact = getContact(contactId);

        if (contact != null) {
            contact.setLastName(lastName);
            return true;
        }

        return false;
    }

    public boolean updatePhone(String contactId, String phone) {

        Contact contact = getContact(contactId);

        if (contact != null) {
            contact.setPhone(phone);
            return true;
        }

        return false;
    }

    public boolean updateAddress(String contactId, String address) {

        Contact contact = getContact(contactId);

        if (contact != null) {
            contact.setAddress(address);
            return true;
        }

        return false;
    }

    public Contact getContact(String contactId) {

        for (Contact contact : contacts) {

            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }

        return null;
    }
}