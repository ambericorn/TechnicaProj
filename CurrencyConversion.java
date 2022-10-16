
import java.util.*;

import javax.swing.JOptionPane;

public class CurrencyConversion {
	
	
	public static String curcov(){
	  
	   Scanner scan = new Scanner(System.in);
	  try{
			String currType = (JOptionPane.showInputDialog(null, "Currency to convert to dollars", "JPY"));
		int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Amount?", 9));
	     String z = "https://www.xe.com/currencyconverter/convert/?Amount=" + currType + "&From=" + amount + "&To=USD";
	     scan.close();
	    return z;
	  }
	  catch(java.util.NoSuchElementException e){
	    System.out.println("Sorry! We cant convert that!");
	  }
	return null;
	}

	
}
	
	

