
package Model;


public class Student {
    private String name;
    private String ID;
    private String course;
    
    public Student (String name, String ID, String course){
        
        this.name=name;
        this.ID=ID;
        this.course=course;
    }
    
    public String getname()
    {
        return name;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getcourse()
    {
        return course;
    }
}
