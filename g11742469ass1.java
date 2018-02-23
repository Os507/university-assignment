import java.util.Scanner;
public class g11742469ass1 {
    public static void main(String[] args) {
     
       Scanner sc=new Scanner (System. in);
       final int PrepaidSIMcard = 30;
       final int PostpaidSIMcard = 50;
       final int InternetCard = 300;
       final double amount;
       double vat=0.05;
       
     System.out.println("Initializing Jeddah For Communication Sales Report Creator...");
     System.out.println();
     System.out.println("please enter the sales for the 1st half of year:");
      System.out.print("       Number of prepaid SIM cards sold  :"); 
      int numPrepaidSIMcard1 = sc.nextInt();
      System.out.print("       Number of postpaid SIM cards sold :");   
      int numPostpaidSIMcard1 = sc.nextInt();
      System.out.print("       Number of Internet cards sold     :"); 
      int numInternetCard1 = sc.nextInt();
      
      System.out.println();  
      
      System.out.println("please enter the sales for the 2nd half of year:");
      System.out.print("       Number of prepaid SIM cards sold  :"); 
      int numPrepaidSIMcard2 = sc.nextInt();
      System.out.print("       Number of postpaid SIM cards sold :");   
      int numPostpaidSIMcard2 = sc.nextInt();
      System.out.print("       Number of Internet cards sold     :"); 
      int numInternetCard2 = sc.nextInt();
    
    
System.out.println();
 System.out.println("-----------------------------------------------------------------------");
 System.out.println("*******      Jeddah For Communication Yearly Sales Report       *******");
 System.out.println("-----------------------------------------------------------------------");
  // fisrt half 
System.out.println("    1st Half Sales");
System.out.printf("%12s\t%14s\t%10s\t%10s\t%20s\n", "CARD", "QUANTITY", "COST", "VAT", "TOTAL SALES COST" );
  //prepaid1
   int cost_PrepaidSIMcard1 = numPrepaidSIMcard1 * PrepaidSIMcard;
   double vat_PrepaidSIMcard1 = cost_PrepaidSIMcard1 * vat;
   double TOTAL_PrepaidSIMcard1 = cost_PrepaidSIMcard1 + vat_PrepaidSIMcard1;
System.out.printf("%15s\t%13d\t%10dSR\t%10.1fSR\t%19.1f\n", "prepaid", numPrepaidSIMcard1, cost_PrepaidSIMcard1, vat_PrepaidSIMcard1, TOTAL_PrepaidSIMcard1);
   //postpaid1
   int cost_PostpaidSIMcard1 = numPostpaidSIMcard1 * PostpaidSIMcard;
   double vat_PostpaidSIMcard1 = cost_PostpaidSIMcard1 * vat;
   double TOTAL_PostpaidSIMcard1 = cost_PostpaidSIMcard1 + vat_PostpaidSIMcard1;
System.out.printf("%16s\t%5d\t%10dSR\t%10.1fSR\t%19.1f\n", "Postpaid", numPostpaidSIMcard1, cost_PostpaidSIMcard1, vat_PostpaidSIMcard1, TOTAL_PostpaidSIMcard1);
  //internet1   
   int cost_InternetCard1 = numInternetCard1 * InternetCard;
   double vat_InternetCard1 = cost_InternetCard1 * vat;
   double TOTAL_InternetCard1 = cost_InternetCard1 + vat_InternetCard1; 
System.out.printf("%16s\t%5d\t%11dSR\t%11.1fSR\t%20.1f\n", "Internet", numInternetCard1, cost_InternetCard1, vat_InternetCard1, TOTAL_InternetCard1);
   double TOTAL_1sthalfSALES =  TOTAL_PrepaidSIMcard1 + TOTAL_PostpaidSIMcard1 + TOTAL_InternetCard1;
System.out.printf("TOTAL SALES: %3.1f\n", TOTAL_1sthalfSALES );
  System.out.println();
   
  //second half
System.out.println("2nd Half Sales");
System.out.printf("%8s\t%14s\t%10s\t%10s\t%20s\n", "CARD", "QUANTITY", "COST", "VAT", "TOTAL SALES COST" );
  //prepaid2
   int cost_PrepaidSIMcard2 = numPrepaidSIMcard2 * PrepaidSIMcard;
   double vat_PrepaidSIMcard2 = cost_PrepaidSIMcard2 * vat;
   double TOTAL_PrepaidSIMcard2 = cost_PrepaidSIMcard2 + vat_PrepaidSIMcard2;
System.out.printf("%11s\t%12d\t%10dSR\t%10.1fSR\t%19.1f\n", "prepaid", numPrepaidSIMcard2, cost_PrepaidSIMcard2, vat_PrepaidSIMcard2, TOTAL_PrepaidSIMcard2);
  //postpaid2
   int cost_PostpaidSIMcard2 = numPostpaidSIMcard2 * PostpaidSIMcard;
   double vat_PostpaidSIMcard2 = cost_PostpaidSIMcard2 * vat;
   double TOTAL_PostpaidSIMcard2 = cost_PostpaidSIMcard2 + vat_PostpaidSIMcard2;
System.out.printf("%12s\t%12d\t%10dSR\t%10.1fSR\t%19.1f\n", "Postpaid", numPostpaidSIMcard2, cost_PostpaidSIMcard2, vat_PostpaidSIMcard2, TOTAL_PostpaidSIMcard2);
  //internet2   
   int cost_InternetCard2 = numInternetCard2 * InternetCard;
   double vat_InternetCard2 = cost_InternetCard2 * vat;
   double TOTAL_InternetCard2 = cost_InternetCard2 + vat_InternetCard2; 
System.out.printf("%12s\t\t%d\t%11dSR\t%11.1fSR\t%20.1f\n", "Internet", numInternetCard2, cost_InternetCard2, vat_InternetCard2, TOTAL_InternetCard2);
   double TOTAL_2ndhalfSALES =  TOTAL_PrepaidSIMcard2 + TOTAL_PostpaidSIMcard2 + TOTAL_InternetCard2;
System.out.printf("TOTAL SALES: %4.1f\n", TOTAL_2ndhalfSALES );
  System.out.println();

//the total year
System.out.println("SALES SUMMARY:");
System.out.printf("1st Half Sales : %7.1f\n", TOTAL_1sthalfSALES );
System.out.printf("2nd half Sales : %3.1f\n", TOTAL_2ndhalfSALES );
double grand_total = TOTAL_1sthalfSALES + TOTAL_2ndhalfSALES;
System.out.printf("GRAND TOTAL    : %5.2f\n",grand_total );
  System.out.println();

//precent of sales
double precent_PrepaidSIMcard = (int)(100*(TOTAL_PrepaidSIMcard1+TOTAL_PrepaidSIMcard2)*100/grand_total)/(100.0);
System.out.print("%");
System.out.printf(" of Prepaid cards Sales  : %3.2f\n", precent_PrepaidSIMcard );

double precent_PostpaidSIMcard = (int)(100*(TOTAL_PostpaidSIMcard1+TOTAL_PostpaidSIMcard2)*100/grand_total)/(100.0);
System.out.print("%");
System.out.printf(" of Postpaid cards Sales : %3.2f\n", precent_PostpaidSIMcard );

double precent_InternetCard = (int)(100*(TOTAL_InternetCard1+TOTAL_InternetCard2)*100/grand_total)/(100.0);
System.out.print("%");
System.out.printf(" of Internet cards Sales : %3.2f\n", precent_InternetCard );

System.out.println("-----------------------------------------------------------");
    }
    
}
 
