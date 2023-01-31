package je;

import java.util.*;
import java.util.logging.Logger;

class POINT1  {
    float x1;
    float x2;
    float y1;
    float y2;
    POINT1(float x1,float x2,float y1,float y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    POINT1(POINT1 obj){
        x1 = obj.x1;
        x2 = obj.x2;
        y1 = obj.y1;
        y2 = obj.y2;

    }
    boolean equals(){
        return ((x1==x2) && (y1==y2));
    }
    
    
}

 class POINT{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args)  {
        float x1;
        float x2;
        float y1;
        float y2;
        Scanner sc = new Scanner(System.in);
        try{
        Log.info("Enter x1 and y1:");
         x1 = sc.nextFloat();
         y1 = sc.nextFloat();
        Log.info("Enter x2 and y2:");
         x2 = sc.nextFloat();
         y2 = sc.nextFloat();
        sc.close();
       
        POINT1 obj1 = new POINT1(x1, x2, y1, y2);
        String cmpr = "Point1 equals Point2: "+obj1.equals();
        Log.info(cmpr);
        POINT1 obj2 = new POINT1(obj1);
        String op1 = "Original Point (x1,y1) "+obj1.x1+" "+obj1.y1+" (x2,y2) "+obj1.x2+" "+obj1.y2;
        String op2 = "After Cloning (x1 ,y1) "+obj2.x1+" "+obj2.y1+" (x2,y2) "+obj2.x2+" "+obj2.y2;
        Log.info(op1);
        Log.info(op2);
    } 
    catch(Exception e){
        String exp = "Exception:"+e;
        Log.info(exp);
    }
}  

    
}
