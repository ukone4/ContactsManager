public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        // Ajouter 5 contacts
        myContactsManager.addContact(new Contact("Uriel", "0101010101"));
        myContactsManager.addContact(new Contact("Servais", "0202020202"));
        myContactsManager.addContact(new Contact("Souleymane", "0303030303"));
        myContactsManager.addContact(new Contact("Lagayel", "0404040404"));
        myContactsManager.addContact(new Contact("Ismael", "0505050505"));

        // Rechercher un contact
        Contact foundContact = myContactsManager.searchContact("Souleymane");
        if (foundContact != null) {
            System.out.println("Numéro de Souleymane : " + foundContact.phoneNumber);
        } else {
            System.out.println("Contact non trouvé !");
        }
    }
}
