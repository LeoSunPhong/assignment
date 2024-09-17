package ontapgk1;

import java.util.Date;

abstract class Person implements IPerson{

    protected String id;
    protected String fullname;
    protected Date dateOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    @Override
     public abstract void displayInfo();

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullname=" + fullname + ", dateOfBirth=" + dateOfBirth + '}';
    }
     
    
}
