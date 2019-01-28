package javaapplication12;

/**
 *
 * @author M306User
 */
public class STUDAcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        StudentInfo student = new StudentInfo ("University of Cordilleras", "College of Information", "2nd term", "S.Y. 2018-2019");
        student.setidNum("18-0740-830");
        student.setfamilyname("Imasa");
        student.setfirstname("John Lisbert");
        student.setacademicProgram("BSIT: ");
        student.settrack("NET-SEC");
        
        student.term = "3rd term";
        student.print();
        
       
        System.out.println();   
        
        StudentInfo stud = new StudentInfo ("University of Cordilleras", "College of Information", "2nd term", "S.Y. 2018-2019");
        stud.setidNum("18-0315-349");
        stud.setfamilyname("De Guzman");
        stud.setfirstname("Windzor Dave");
        stud.setacademicProgram("BSIT: ");
        stud.settrack("WEB DEV");
        stud.print();
        
       
        
        
        System.out.println(stud.getidNum() + stud.getfamilyname());
        
        
        // TODO code application logic here
               
    }
    
}