
/**
 * CurrencyConverter will convert currency for different dollar amounts.
 * 
 * @author Chris Peterson
 * @version 1/27/2014
 */
public class CurrencyConverter
{
    // instance variables
  private double amount;
  private double dollar;
  private double euro;
  private double britishPound;
  private double yen;
    
   // constants
   final double EURO_CONVERSION = 0.7311;
   final double BRITISH_POUND = 0.6064;
   final double YEN_CONVERSION = 102.32;
    
    /**
     * Constructor for objects of class CurrencyConverter
     */
    public CurrencyConverter()
   {
     //set variable
     dollar = 1;
     euro = 0.7311;
     britishPound = 0.6064;
     yen = 102.32;
   }

    
    /**
     * converts dollars into whatever currency you want, expects two values
     * 
     * @param  double dollar : dollar amount to convert  currency : set to what you want to convert to
     *
     */
    public void dollarConverter(double amount, char currency)
   {
     if (currency == 'e' || currency == 'E')
     {
      dollar = amount;
      euro = amount * EURO_CONVERSION;  
     }   
     else if (currency == 'b' || currency == 'B')
     {
      dollar = amount;
      britishPound = amount * BRITISH_POUND;
     }
     else if (currency == 'y' || currency == 'Y')
     {
      dollar = amount;
      yen = amount * YEN_CONVERSION;
     }
     else 
     {
      dollar = amount;
     }
   }
    
    
    /**
     * Set the monetary amount in whatever scale the user wants (mutator)
     * 
     * @param  double dollar : dollar amount to convert  currency : set to what you want to convert to
     *         
     */
    public void setAmount(double amount, char currency)
   {
    if (currency == 'e' || currency == 'E')
     {
      dollar = amount;
      euro = amount * EURO_CONVERSION;  
     }   
     else if (currency == 'b' || currency == 'B')
     {
      dollar = amount;
      britishPound = amount * BRITISH_POUND;
     }
     else if (currency == 'y' || currency == 'Y')
     {
      dollar = amount;
      yen = amount * YEN_CONVERSION;
     }
   }
    /**
    *these methods get the values you mutate with the mutator method, (accessors)
    *and returns them
    *
    *
    *@return converters the amount dependent on 'e'=euro, 'b'=british, 'y'=yen in every other known conversion
    */
   public double getEuro()
    {
     return euro;
    }
    
   public double getBritishPound()
    {
     return britishPound;
    } 
    
   public double getYen()
    {
     return yen;
    } 
}
