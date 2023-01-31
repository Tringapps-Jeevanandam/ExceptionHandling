package je;


import java.util.*; 
import java.util.logging.Logger;
class Shape2 {
    String shapeName;
    double radius;
    double length;
    double width;
    double side1;
    double side2;
    double side3;

    Shape2(String shapeName, double r){
        this.radius=r;
        this.shapeName=shapeName;
    }
    Shape2(String shapeName, double len,double wid){
        this.shapeName = shapeName;
        this.length = len;
        this.width = wid;
    }
    Shape2(String shapeName, double s1, double s2, double s3){
        this.shapeName = shapeName;
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    double area(double radius) {
    	return radius*radius*3.14;
    }
    double area(double length,double width) {
    	return length*width;
    }
    double area(double side1, double side2,double side3) {
    	double s = perimeter(side1,side2,side3)/2;
    	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    double perimeter(double radius) {
    	return 2*3.14*radius;
    }
    double perimeter(double length,double width) {
    	return 2*(length+width);
    }
    double perimeter(double side1, double side2,double side3) {
    	return side1+side2+side3;
    }   
}
class Shape{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        int choice;
        String shapeName;
        double r;
        double len;
        double wid;
        double s1;
        double s2;
        double s3;
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
            Log.info("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    Log.info("Enter Radius:");
                    r = sc.nextDouble();
                    shapeName = "Circle";
                    Shape2 sh = new Shape2(shapeName, r);
                    Log.info("Area of Circle: {} ",sh.area(r));
                  Log.info("Perimeter of Circle:{} ",sh.perimeter(r));

                }break;
                case 2:{
                	Log.info("Enter Length and Width:");
                	len = sc.nextDouble();
                	wid = sc.nextDouble();
                	shapeName = "Rectangle";
                	Shape2 sh = new Shape2(shapeName, len,wid);
                	Log.info("Area of Rectangle:{} ",sh.area(len, wid));
                	Log.info("Perimeter of Rectangle:{} ",sh.perimeter(len, wid));

                }break;
                case 3:{
                	Log.info("Enter Three sides of the triangle:");
                	s1 = sc.nextDouble();
                	s2 = sc.nextDouble();
                	s3 = sc.nextDouble();
                	shapeName = "Triangle";
                	Shape2 sh = new Shape2(shapeName,s1,s2,s3);
                	Log.info("Area of Triangle:{} ",sh.area(s1,s2,s3));
                	Log.info("Perimeter of Triangle:{} ",sh.perimeter(s1,s2,s3));
                	
                }break;
                case 4: System.exit(0); break;
            
                default:Log.info("***Enter right choice***");
                    break;
                   
            }
        }
        catch(Exception e){
            String exp = "Exception:"+ e;
            Log.info(exp);
            sc.nextLine();
        }
            
        }
    }
}
