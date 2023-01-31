package je;

import java.util.*;
import java.util.logging.Logger;
class CREDIT implements Cloneable{
    String cardHolderName;
    long cardNumber;
    String expDate;

    CREDIT(String cardHolderName,long cardNumber,String expDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }
    boolean equals(long newCardNumber){
        return cardNumber==newCardNumber;
    }

    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }  

}
class CREDITCARD{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) throws CloneNotSupportedException {
        String cardHolderName;
        long cardNumber;
        String expDate;
        try{
        Scanner sc = new Scanner(System.in);
        Log.info("Enter Credit Card details:\nCard Holder Name: ");
        cardHolderName = sc.nextLine();
        Log.info("Card Number:");
        cardNumber = sc.nextLong();
        Log.info("Exp Date:");
        expDate = sc.next();
        CREDIT cr = new CREDIT(cardHolderName, cardNumber, expDate);
        CREDIT cr2 = (CREDIT)cr.clone();
        Log.info("New card Number: ");
        long newCardNumber = sc.nextLong();
        if(!cr.equals(newCardNumber)){
            Log.info("Card number updated");
            cr2.cardNumber = newCardNumber;
        }
        else{
            Log.info("Card Numbersk are same");
        }
        String op1 ="ORIGINAL CARD DETAILS: Card Holder Name: "+cr.cardHolderName+" Card Number:"+cr.cardNumber+" Exp Date: "+cr.expDate;
        String op2 = "AFTER CLONING : Card Holder Name: "+cr2.cardHolderName+" Card Number:"+cr2.cardNumber+" Exp Date: "+cr2.expDate;
        Log.info(op1);
        Log.info(op2);
        }
        catch(Exception e){
        String exp = "Exception:"+e;
        Log.info(exp);
    }

    }
}
