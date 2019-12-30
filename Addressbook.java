import java.util.LinkedList;

// Only the List to save the Person-Objects in.
public class Addressbook{

    // Class atributes:
    private LinkedList<Person> _addressbook;
    // Does the adressbook need a specific name?
    //private String name;

    // Class Constructor:
    public Addressbook(){
        this._addressbook = new LinkedList<Person>();
    }


    // Need this Class the ability to add and delet Objects in it?
    // Class - Methods:
    @Override
    public String toString() {
        return "{" +
            " _addressbook='" + getAddressbook() + "'" +
            "}";
    }


    // Getter and Setter:
    public LinkedList<Person> getAddressbook() {
        return this._addressbook;
    }

    public void setAddressbook(LinkedList<Person> _addressbook) {
        this._addressbook = _addressbook;
    }

  
}
