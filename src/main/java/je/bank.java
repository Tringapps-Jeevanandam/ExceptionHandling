package je;

import java.util.*;
import java.util.logging.Logger;
class BANK{
    String accountHolderName;
    int accountNumber;
    double accountBalance=0;
    static Scanner so = new Scanner(System.in);


    BANK(){
        Log.info("Bank Account");
        Log.info("Enter Your Name:");
        accountHolderName = so.nextLine();
        Log.info("Enter Account number:");
        accountNumber = so.nextInt();
        Log.info("Account Created");
    
    }
    void display(){
        Log.info("Account Holder Name: {}",accountHolderName);
        Log.info("Account Number: {}",accountNumber);
        Log.info("Balance: Rs.{} ",accountBalance);
    }
    void deposit(){
        Log.info("Enter Amount to deposit: Rs. ");
        double depositAmt = so.nextDouble();
        accountBalance+=depositAmt;
        Log.info("Rs. {} Deposited Successfully",depositAmt);
    }
    void withdraw(){
        Log.info("Enter Withdrawn amt: Rs. ");
        int withdrawAmt = so.nextInt();
        if(accountBalance>withdrawAmt){
            accountBalance-=withdrawAmt;
            Log.info("---Amount Withdrawn Succsessfully---\n Account Balance: Rs. {}",accountBalance);
        }
        else{
            Log.warning("***Insufficient Amount***");
        }
    }
    public static final Logger Log = Logger.getLogger("InfoLogging");
 public static void main(String[] args) {
    BANK bk = new BANK();
    int ch;
    while(true){
    try{

    Log.info("Enter Your choice \n 1.deposit\n 2.Withdraw\n 3.View Balance\n 4.exit");
    ch = so.nextInt();
    switch(ch){
        case 1: bk.deposit();break;
        case 2: bk.withdraw();break;
        case 3: bk.display();break;
        case 4: System.exit(0);break;
        default: System.exit(0); break;     
        }
       }
       catch(InputMismatchException e){
        String exp = "Exception:"+ e;
        Log.info(exp);
        so.nextLine();
    }
    }
  
}
}
