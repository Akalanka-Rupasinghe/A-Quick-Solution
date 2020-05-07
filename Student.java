package Models;

public class Student {
    String Name;
    String Age;
    String Address;
    String Gender;
    String ID;
    String Contact;
    String Email;
    String Password;
    
    public Student(String Name,String Age,String Address,String Gender,String ID,String Contact,String Email)
    {
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Gender=Gender;
        this.ID=ID;
        this.Contact=Contact;
        this.Email=Email;
        
    }
    public String getName(){
        return Name;
    }
        public String getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
    }
    public String getGender(){
        return Gender;
    }
    public String getID(){
        return ID;
    }
    public String getContact(){
        return Contact;
    }
    public String getEmail(){
        return Email;
    }
    
}
