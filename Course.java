
package Model;


public class Course {
    private String courseName;
    private String student;
    private String profesor;
    private int sports;
    private int filledSports; 
    
    public Course(String courseName, String student,String profesor, int sports, int filledSports){
        
        this.courseName=courseName;
        this.student=student;
        this.profesor=profesor;
        this.sports=sports;
        this.filledSports=filledSports;
    }
    
    public String getCourseName()
    {
         return courseName;
    }
            
    public String getStudent()
    {
        return student;
    }
    
    public String getProfesor()
    {
        return profesor;
    }
    
    public int getSports()
    {
        return sports;
    }
    
    public int getFilledSports()
    {
        return filledSports;
    }
}

