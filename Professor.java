
package Model;


public class Professor {
    private String proName;
    private String coursesTeach;
    
    public Professor (String proName, String coursesTeach){
        
        this.proName=proName;
        this.coursesTeach=coursesTeach;
    }
    
    public String getproName()
    {
        return proName;
    }
    
    public String getcoursesTeach()
    {
        return coursesTeach;
        
    }
}
