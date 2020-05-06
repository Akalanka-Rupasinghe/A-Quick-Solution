
package Models;

public class ModelClass {
    public int ID;
    public String Name;
    public String Duration; 
    public String EntryRequirements;
    public String EligibleCourses;
    public int Fee;
 
    public ModelClass (int ID,String Name,String Duration,String EntryRequirements,String EligibleCourses, int Fee)
    {
        this.ID=ID;
        this.Name=Name;
        this.Duration=Duration;
        this.EntryRequirements=EntryRequirements;
        this.EligibleCourses=EligibleCourses;
        this.Fee=Fee;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getDuration()
    {
        return Duration;
    }
    
    public String getEntryRequirements()
    {
        return EntryRequirements;
    }
    
    public String getEligibleCourses()
    {
        return EligibleCourses;
    }
    
    public int getFee()
    {
        return Fee;
    }
}