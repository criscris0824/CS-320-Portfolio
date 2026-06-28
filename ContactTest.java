package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreation() {
        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        assertEquals("123", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testUpdateFields() {
        Contact contact = new Contact(
                "123",
                "John",
                "Smith",
                "1234567890",
                "123 Main Street");

        contact.setFirstName("Mike");
        contact.setLastName("Jones");
        contact.setPhone("0987654321");
        contact.setAddress("456 Oak Street");

        assertEquals("Mike", contact.getFirstName());
        assertEquals("Jones", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Oak Street", contact.getAddress());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345678901",
                    "John",
                    "Smith",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    public void testNullContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "John",
                    "Smith",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Johnnnnnnnn",
                    "Smith",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "John",
                    "Smithhhhhhh",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "12345",
                    "123 Main Street");
        });
    }

    @Test
    public void testNullPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "John",
                    "Smith",
                    null,
                    "123 Main Street");
        });
    }

    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "1234567890",
                    "123 Main Street Apartment Number 999999");
        });
    }

    @Test
    public void testNullAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "John",
                    "Smith",
                    "1234567890",
                    null);
        });
    }
}