package je;
import java.util.*;
import java.util.logging.Logger;
class SCHOOLS {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    String studName;
    int grade;
    float gpa;
    SCHOOLS(String studname,int grade,float gpa){
        this.studName = studname;
        this.grade = grade;
        this.gpa = gpa;
    }
    void updategpa(){
        float newgpa;
        Scanner sc = new Scanner(System.in);
        Log.info("Enter new GPA");
        newgpa = sc.nextFloat();
        this.gpa = newgpa;
        sc.close();
    }
    String displayDetails(){
        return this.studName+" has a "+this.gpa+" GPA";
    }
}
 class SCHOOL{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        String studName;
        int grade;
        float gpa;
        Scanner obj = new Scanner(System.in);
        try{
        Log.info("Enter Student details:");
        Log.info("Student Name");
        studName = obj.nextLine();
        Log.info("Grade");
        grade = obj.nextInt();
        Log.info("GPA");
        gpa = obj.nextFloat();
        SCHOOLS sh = new SCHOOLS(studName,grade,gpa);
        Log.info("Do you want to update GPA? (y/n)");
        char ch = obj.next().charAt(0);
        if(Character.toLowerCase(ch)=='y'){
            sh.updategpa();
        }
        String displaydetails = sh.displayDetails();
        Log.info(displaydetails);
        obj.close();
    }
    catch(Exception e){
        String exp = "Exception:"+e;
        Log.info(exp);
    }
    }
}
