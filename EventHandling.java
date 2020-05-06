
package Models;



public class NewEvents {
    
    private String Name;
    private String ID;
    private String Description;
    private String Type;
    private String location;
    private String Time;
    
    public NewEvents(String N, String I, String D, String Ty, String L, String Ti){
    
    this.Name = N;
    this.ID = I;
    this.Description = D;
    this.Type = Ty;
    this.location = L;
    this.Time = Ti;
   
}
    
    public String GetName(){
    return Name;
    }
    
    public String GetID(){
    return ID;
    }
    
    public String GetDescription(){
    return Description;
    }
    
    public String GetType(){
    return Type;
    }
     public String GetLocation(){
    return location;
    }
     public String GetTime(){
    return Time;
     }
            
    
}
