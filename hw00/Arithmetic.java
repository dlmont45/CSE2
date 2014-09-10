//Dan Lee
//hw02
//Arithmetic Program

//  First change Directories of the program
//      cd hw02
//  
//  Compile the program
//      javac Arithmetic.java
//
//  Then run the Program
//      javac Arithmetic.java//
//  
//      Program should:
//          -Total cost of each kind of item
//          -Total cost of purchases (without tax)
//          -Total actually paid for the transaction (including sales tax)
//          
//  Commit Program
//      javac Arithmetic.java
//
//  Push Program
//      javac Arithmetic.java


//  Define a Class
        public class Arithmetic{

//  Add main method
        public static void main(String [] args) {

//  Begin input variables
//      Tax Percent        
        double taxPercent=0.06; //Tax percentage

//      Socks        
        int nSocks=3; //Number of socks
        double sockCost$=2.58; //Cost per pair of socks //('$' is a part of the variable)
        double sockTax$=0.00; //Tax cost of socks
        
//      Drinking Glasses        
        int nGlasses=6; //Numer of drinking glasses
        double glassesCost$=2.29; //Cost of drinking glasses
        double glassesTax$=0.00; //Tax cost of drinking glasses
        
//      Envelope
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=2.29; //Cost per box of envelopes
        double envelopeTax$=0.00; //Tax cost of envelope

//      Total Costs        
        double totalSockCost$; //Total cost of Socks
        double totalGlassesCost$; //Total cost of Glasses
        double totalEnvelopeCost$; //Total cost of Envelopes
        double totalSub$; //Subtotal of transaction
        double totalTaxCost$; //Total cost of tax
        double totalTransaction$; //Total transaction cost



//  Compute the values for the costs for subtotal
//      Subtotal Costs:
                totalSockCost$ = nSocks * sockCost$; //Total cost of socks (tax prior)
                totalGlassesCost$ = nGlasses * glassesCost$; //Total cost of drinking glasses (tax prior)
                totalEnvelopeCost$ = nEnvelopes * envelopeCost$;  //Total cost of envelopes (tax prior)
                totalSub$ = totalSockCost$ + totalGlassesCost$ + totalEnvelopeCost$;//Subtotal of transaction
                
//      Tax cost of items:
                sockTax$ = totalSockCost$ * taxPercent; //Tax cost socks
                glassesTax$ = totalGlassesCost$ * taxPercent; //Tax cost of drinking glasses
                envelopeTax$ = totalEnvelopeCost$ * taxPercent; //Tax cost of envelopes 
                totalTaxCost$ = sockTax$ + glassesTax$ + envelopeTax$; //Total cost of tax
                
//      Calculate total cost of transaction
                totalTransaction$ = totalSub$ + totalTaxCost$;  //Cost of total transaction

        

//      Print out total output data
//              Total cost of each kind of item
                        System.out.println("3 socks for "+ totalSockCost$ +" dollars, " + "tax was "+ (int)(sockTax$*100) / 100.0 +" dollars");
                        System.out.println("6 drinking glasses for " +totalGlassesCost$ +" dollars, " + "tax was "+(int)(glassesTax$*100) / 100.0 +" dollars");
                        System.out.println("1 envelope for "+ totalEnvelopeCost$ +" dollars, " + "tax was "+ (int)(envelopeTax$*100) / 100.0 +" dollars");
        
//              Total cost of purchases without tax
                        System.out.println("Total cost of items without tax was "+ totalSub$ +" dollars");
                        
//              Total cost of tax
                        System.out.println("Total tax cost was "+ (int)(totalTaxCost$*100) / 100.0 +" dollars");
                        
//              Total cost of entire transaction
                        System.out.println("Total cost of entire transaction was "+ (int)(totalTransaction$*100) / 100.0 +" dollars");
                        

//      test/testtest
            
        }
            
}
        


