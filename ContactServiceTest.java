package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        assertTrue(service.addContact(contact));
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        assertTrue(service.deleteContact("1"));
    }

    @Test
    public void testUpdateContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        service.updateFirstName("1", "Mike");

        assertEquals("Mike",
                service.getContact("1").getFirstName());
    }
}