import java.util.Iterator;
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


    // Class - Methods:
    @Override
    public String toString() {
        return "{" +
            " _addressbook='" + getAddressbook() + "'" +
            "}";
    }

    // Need this Class the ability to add and delet Objects in it?
    
    // TODO: Method to add Person Object in LinkedList.
    public boolean addPerson(Person person){
        Person comparisonObject = person;
        boolean successfull = false;
    // add Method have to check if the, to add object, is already in the list:
    // IF no: add the new Person-Object in the list -> return true.
    // IF yes: return false.

        for (Iterator i = _addressbook.iterator(); i.hasNext();) {
            if(comparisonObject.equals(i)){
                System.out.println("ACHTUNG: Objekt ist bereits vorhanden.");
                successfull = false;
            } else {
                _addressbook.add(comparisonObject);
                successfull = true;
            }
        }
        return successfull;
    }


    // TODO: Method to remove Person Objekt.
    public boolean removePerson(Person person){
        Person comparisPerson = person;
        boolean successfull = false;

        
    }

    // TODO: Method to edit specific Person Object, that already exists, in LinkedList.

    // TODO: Method to save the content of LinkedList permanently.




    // Getter and Setter:
    public LinkedList<Person> getAddressbook() {
        return this._addressbook;
    }

    public void setAddressbook(LinkedList<Person> _addressbook) {
        this._addressbook = _addressbook;
    }

  
}
