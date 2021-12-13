/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barzipconvertion;

import static barzipconvertion.BarZipConvertion.userMenu;
import java.util.Scanner;

/**
 *
 * @author abeld
 */

public class TestClass { // Class responsible for testing the convertion of zip / bar codes

  public static void main(String[] args) {
            
      int choice = 0;
      
      do { 
        choice = userMenu();
        
      switch (choice) { // Switch that uses 3 cases 
      
        case 1:{  // Option for zipcode to barcode
        
        System.out.println("Please enter you're zip code: ");
        Scanner userInput = new Scanner(System.in);    
        int zipCode = userInput.nextInt(); userInput.nextLine();
        System.out.println("The zipcode you entered is: " + zipCode);
        BarZipConvertion zipToBar = new BarZipConvertion(zipCode);
        System.out.println("For this zip code the corresponding barcode"
        + " is: " + zipToBar.getBarCode());
        break;
        
        }
        
        case 2: { // Option for barcode to zipcode
        
        System.out.println("Please enter a barcode to turn into zip code");
        Scanner userInput = new Scanner(System.in);
        String scanCode = userInput.nextLine();
        System.out.println("The barcode you entered is: " + scanCode);
        BarZipConvertion barToZip = new BarZipConvertion(scanCode);
        System.out.println("Based on the barcode you entered, the zipcode is: "
        + barToZip.getZIPCode());
         break;
            
        }
        
        default: { // Option that asks the user for either 1 or 2.
        
        System.out.println("Press 1 to convert a zipcode to a barcode,  "
                + "press 2 to convert a barcode to a zipcode or 3 to quit");
            
        }
      } 

    }  
    
    while (choice != 3);  // If neither of the previous are selected program ends run
    if (choice == 3){
       return;
    }
    }
}

