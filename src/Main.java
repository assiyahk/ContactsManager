public class Main {
  public static void main(String[] args) {

    ContactsManager myContactsManager = new ContactsManager();

    Contact c1 = new Contact();
    c1.setName("Alice");
    c1.setPhoneNumber("0700000001");
    myContactsManager.addContact(c1);

    Contact c2 = new Contact();
    c2.setName("Bob");
    c2.setPhoneNumber("0700000002");
    myContactsManager.addContact(c2);

    Contact c3 = new Contact();
    c3.setName("Chloé");
    c3.setPhoneNumber("0700000003");
    myContactsManager.addContact(c3);

    Contact c4 = new Contact();
    c4.setName("David");
    c4.setPhoneNumber("0700000004");
    myContactsManager.addContact(c4);

    Contact c5 = new Contact();
    c5.setName("Eva");
    c5.setPhoneNumber("0700000005");
    myContactsManager.addContact(c5);

    Contact found = myContactsManager.searchContact("Bob");
    if (found != null) {
      System.out.println("Numéro de " + found.getName() + " : " + found.getPhoneNumber());
    } else {
      System.out.println("Contact non trouvé.");
    }
  }
}