import java.util.LinkedList;

// Only the List to save the Person-Objects in.
public class Addressbook{

    // Class atributes:
    private LinkedList<Person> _adressbook;
    // Does the adressbook need a specific name?
    //private String name;


    public Addressbook(){
        this._adressbook = new LinkedList<Person>();

    }
}
