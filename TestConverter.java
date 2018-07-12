
/**
 * This class test he CurrencyConverter class. 
 * 
 * @author Chris Peterson
 * @version 1/28/2014
 */
public class TestConverter
{
    public static void main (String [] args) 
    {
     // create a reference variable,& create an object 
     CurrencyConverter cc;
     cc = new CurrencyConverter();
     //print starting values
     System.out.println("A dollar equals " + (cc.getEuro()) + (cc.getBritishPound()) + (cc.getYen()) + " in euros, pounds, and yen.");
     // set & print the values of the fields 
     cc.dollarConverter(20.00, 'y');
     System.out.println("Your $20.00 converted to yen is " + cc.getYen() + ".");
     //call mutator
     cc.setAmount(500.00,'e');
     //Print the value
     System.out.println("Your $500.00 converted to euros is " + cc.getEuro());
     // call mutator 
     cc.setAmount(6.00, 'b');
     System.out.println("Your $6.00 converted to british pounds is " + cc.getBritishPound());
     
     
    }
}
