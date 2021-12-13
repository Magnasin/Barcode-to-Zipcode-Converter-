/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barzipconvertion;

import java.util.Scanner;

/**
 *
 * @author abeld
 */

public class BarZipConvertion { // Class responsible for converting zip / bar codes

/**
 @param args the command line arguments
*/

private int zipCode;
private String scanCode;

public BarZipConvertion(int zipCode) { // One arg constructor for converting zip to bar
this.zipCode = zipCode;
createBarCode();
}

public BarZipConvertion(String scanCode) { // One arg constructor responsible for converting bar to zip
this.scanCode = scanCode;
createZip();
}

public String getBarCode() { // Method for aquiring the barcode
return scanCode;
}

public int getZIPCode() { // Method for obtain zipcode
return zipCode;
}

private void createZip() { // Creates a barcode given a zipcode
zipCode = 0;
for(int i = 1; i < scanCode.length()- 1; i += 5){
    
String barCode = scanCode.substring(i, i + 5);

    if("||:::".equals(barCode)){
    zipCode = 0 + zipCode * 10;
    }
            
    if(":::||".equals(barCode)){
    zipCode = 1 + zipCode * 10;
    }
            
    if("::|:|".equals(barCode)){
    zipCode = 2 + zipCode * 10;
    }
            
    if("::||:".equals(barCode)){
    zipCode = 3 + zipCode * 10;
    }
            
    if(":|::|".equals(barCode)){
    zipCode = 4 + zipCode * 10;
    }
            
    if(":|:|:".equals(barCode)){
    zipCode = 5 + zipCode * 10;
    }
            
    if(":||::".equals(barCode)){
    zipCode = 6 + zipCode * 10;
    }
            
    if("|:::|".equals(barCode)){
    zipCode = 7 + zipCode * 10;
    }
            
    if("|::|:".equals(barCode)){
    zipCode = 8 + zipCode * 10;
    }
            
    if("|:|::".equals(barCode)){
    zipCode = 9 + zipCode * 10;
    }
  }
}

private void createBarCode() { // Responsible for creating a zipcode
scanCode = "";
int zipCode = this.zipCode;

while (zipCode > 0) {
    
    switch (zipCode % 10) {
        
        case 0: {
        scanCode = "||:::" + scanCode;
        break;
        }
        
        case 1: {
        scanCode = ":::||" + scanCode;
        break;
        }
        
        case 2: {
        scanCode = "::|:|" + scanCode;
        break;
        }
        
        case 3: {
        scanCode = "::||:" + scanCode;
        break;
        }
        
        case 4: {
        scanCode = ":|::|" + scanCode;
        break;
        }
        
        case 5: {
        scanCode = ":|:|:" + scanCode;
        break;
        }

        case 6: {
        scanCode = ":||::" + scanCode;
        break;
        }
        
        case 7: {
        scanCode = "|:::|" + scanCode;
        break;
        }
       
        case 8: {
        scanCode = "|::|:" + scanCode;
        break;
        }

        case 9: {
        scanCode = "|:|::" + scanCode;
        break;
        }
    }
    zipCode = zipCode / 10;
    }

scanCode = "|" + scanCode + "|"; 
}

public static int userMenu(){ // Method displays user menu
      

      System.out.println("Welcome! Press 1 to convert a zipcode to a barcode, "
              + " press 2 to convert a barcode to a zipcode or 3 to quit."); 
      Scanner userMenu = new Scanner(System.in);
      int userChoice = userMenu.nextInt();      
      return userChoice;     

}
}



