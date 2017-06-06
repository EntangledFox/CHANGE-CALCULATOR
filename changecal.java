/*THESE CODES ARE UNDER GPL V2.0 PROTOCOL
*AND THEY CAN BE FOUND AT http://code.gnu.hk:80/
*
*
*
*
*
*
*
*
*
*/
import java.util.Scanner;
class program{
	public static void main(String[] args){

	double SinglePrice = 0.0;
	double TotalPrice = 0.0;
	double Change = 0.0;
	double PriceReceived = 0.0;
	double ReturnPrice = 0;
	double ReturnCents = 0.0;
	double ReturnQuater = 0.0;
	System.out.println("CHANGE APP")	;
	System.out.println("Input Your price of goods one by one, [type] '-1' to calculate; [input] the money received to get values of change; [press] CTRL + C to terminate.");
	System.out.println("#######Example Usage: ~$ java changer");
	System.out.println("#######-> 30");
	System.out.println("#######-> 20");
	System.out.println("#######-> -1");
	System.out.println("#######-> 70");
	System.out.println("#######Change: 20");
	System.out.println("#######Another Round?");
	Scanner input=new Scanner(System.in);  
	Scanner total=new Scanner(System.in);  
	System.out.println("Now Input the price of goods, one row one price.");
	System.out.print("->");
	while(input.hasNext())  
        {  	
		
		SinglePrice = Double.valueOf(input.next()).doubleValue();
		if (SinglePrice >= 0)
		{

		TotalPrice = TotalPrice + SinglePrice;
		System.out.println("You need to pay " + TotalPrice)  ;
		System.out.print("->");
		}		
		else
		{

		System.out.print("Input total amount of money received-> " )  ;
		PriceReceived = Double.valueOf(total.next()).doubleValue();
		System.out.println("Received total amount of " + PriceReceived )  ;
		Change = PriceReceived - TotalPrice;
		if (Change >= 0)
		{
		System.out.println("We need to find change of " + Change + " for him(her)" )  ;
		ReturnPrice = (int)Change; //Get dollars
		System.out.println("We need to give " + ReturnPrice + " dollars" )  ;
		Change = Change - ReturnPrice;
                ReturnQuater = Change / 0.25;
		ReturnQuater = (int)ReturnQuater;
                System.out.println("We need to give " + ReturnQuater + " quaters");
		ReturnCents = Change - 0.25 * ReturnQuater;
		ReturnCents = ReturnCents * 100;
		ReturnCents = (int)ReturnCents;
                System.out.println("We need to give " + ReturnCents + " quaters");









		}




		else 
 		System.out.println("Hmm...Need More money...")  ;
		{
				System.out.print("Another Round? ->")  ;	
				SinglePrice = 0.0;
	                        TotalPrice = 0.0;
	                        Change = 0.0;
	                        PriceReceived = 0.0;
				ReturnPrice = 0;
				ReturnCents = 0;
				ReturnQuater = 0;	
		}
		}

        }  
}
}
