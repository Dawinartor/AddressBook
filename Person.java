//import package to get age from birthdate

public class Person{

    // Class atributes:
    private String _firstName;
    private String _secondName;
    private String _nickName;
    private int _phonenumber;
    private String _birthdate;   // look for formatter-Package
    private int _age;
    private String _address;


    // Class Constructor:
    public Person(String firstname, String secondname, String nickname, int phonenumber, String birthdate, int age, String address){
        this._firstName = firstname;
        this._secondName = secondname;
        this._nickName = nickname;
        this._phonenumber = phonenumber;
        this._birthdate = birthdate;
        this._age = age;
        this._address = address;
    }


    // Class - Methodes:
    @Override
    public String toString() {
        return "{" +
            " _firstName='" + getFirstName() + "'" +
            ", _secondName='" + getSecondName() + "'" +
            ", _nickName='" + getNickName() + "'" +
            ", _phonenumber='" + getPhonenumber() + "'" +
            ", _birthdate='" + getBirthdate() + "'" +
            ", _age='" + getAge() + "'" +
            ", _address='" + getAddress() + "'" +
            "}";
    }


    // Getter and Setter:
    public String getFirstName() {
        return this._firstName;
    }

    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String getSecondName() {
        return this._secondName;
    }

    public void setSecondName(String _secondName) {
        this._secondName = _secondName;
    }

    public String getNickName() {
        return this._nickName;
    }

    public void setNickName(String _nickName) {
        this._nickName = _nickName;
    }

    public int getPhonenumber() {
        return this._phonenumber;
    }

    public void setPhonenumber(int _phonenumber) {
        this._phonenumber = _phonenumber;
    }

    public String getBirthdate() {
        return this._birthdate;
    }

    public void setBirthdate(String _birthdate) {
        this._birthdate = _birthdate;
    }

    public int getAge() {
        return this._age;
    }

    public void setAge(int _age) {
        this._age = _age;
    }

    public String getAddress() {
        return this._address;
    }

    public void setAddress(String _address) {
        this._address = _address;
    }


}