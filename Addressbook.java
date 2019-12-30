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

    
    /** 
     * add Method have to check if the, to add object, is already in the list:
     * IF no: add the new Person-Object in the list -> return true.
     * IF yes: return false.
     * 
     * @param Person person
     * @return boolean successfull
     */
    public boolean addPerson(Person person){
        Person comparisonPerson = person;
        boolean successfull = false;
    
        for (Iterator i = _addressbook.iterator(); i.hasNext(); i.next()) {
            if(comparisonPerson.equals(i)){
                System.out.println("ACHTUNG: Objekt ist bereits vorhanden.");
                successfull = false;
            } else {
                _addressbook.add(comparisonPerson);
                successfull = true;
            }
        }
        return successfull;
    }


    public boolean removePerson(Person person){
        Person comparisonPerson = person;
        boolean successfull = false;

        for (Iterator i = _addressbook.iterator(); i.hasNext(); i.next()) { 
            if(comparisonPerson.equals(i)){
                _addressbook.remove(i);
                successfull = true;
            } else {
                successfull = false;
            }
        }
        return successfull;
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
