package javaapplication12;


public class StudentInfo 
{
        
    String University;
    String College;
    String term; 
    String SY;
    
    

private String idNum;
private String familyname;
private String firstname;
private String academicProgram;
private String track;

public StudentInfo (String University, String College, String term, String SY)
{   
        this.University = University;
        this.College= College;
        this.term = term;
        this.SY = SY;  
}

    
public void print()
{
        System.out.println(University);
        System.out.println(College);
        System.out.println(term);
        System.out.println(SY);
        System.out.println(idNum);
        System.out.println(familyname);
        System.out.println(firstname);
        System.out.print(academicProgram);
        System.out.println(track);
        
        
        
    
}
// setters and getters
// five private fields
public void setidNum(String setidNum)
{
   this.idNum = setidNum;
            
}
public String getidNum() 
{
    return idNum;
}

public void setfamilyname(String setfamilyname) 
{
    this.familyname = setfamilyname;
    
}
public String getfamilyname()
{
    return familyname;
}

public void setfirstname(String setfirstname)
{
   this.firstname = setfirstname;
            
}
public String getfirstname() 
{
    return firstname;
}

public void setacademicProgram(String setacademicProgram)
{
   this.academicProgram = setacademicProgram;
            
}
public String getacademicProgram() 
{
    return academicProgram;
}

public void settrack(String settrack)
{
   this.track= settrack;
            
}
public String gettrack() 
{
    return track;
}




}