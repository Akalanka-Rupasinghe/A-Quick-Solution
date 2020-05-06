package Models;

public class Enroll{

    public String Name;

    public String Address; 

    public String PreferdedCourses;

    public String Email;

    public int Telephone;

public Enroll(String Name,String Address,String PreferdedCourses,String Email, int Telephone)

{
       this.Name=Name;

       this.Address=Address;

       this.PreferdedCourses=PreferdedCourses;

       this.Email=Email;

       this.Telephone=Telephone;
}

    public String getName()

    {

        return Name;

    }

    

    public String getAddress()

    {

        return Address;

    }

    

    public String getPreferdedCourses()

    {

        return PreferdedCourses;

    }

    

    public String getEmail()

    {

        return Email;

    }

    

    public int getTelephone()

    {

        return Telephone;

    }


}
