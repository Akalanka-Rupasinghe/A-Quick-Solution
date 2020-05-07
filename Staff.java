package Models;


public class Staff {

    String Name;
    String Password;
    
    public Staff(String Name,String Password)
    {
       this.Name=Name;
       this.Password=Password;
    }
    public String getName(){
        return Name;
    }
        public String getPassword(){
        return Password;
    }

}
