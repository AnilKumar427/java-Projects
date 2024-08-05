package code_for_ticket;

import java.util.Scanner;

public class Ticket {
	
		public static void main(String a[])
		{
			
			//SELECT THE BOARDING STOPS BY GIVING VALUE TO S
			
			
			//SELECT THE DESTINATION STOP BY GIVING VALUE TO P
			//
					
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose the Boarding Stop:");
		System.out.println("1.L.B nagar 2.sagar x-road 3.OMKAR NAGAR 4.hastinapur 5.bn-reddy 6.sagar complex 7.gurramguda 8.injapur 9.emjyal 10.ragannaguda 11.manneguda 12.bongloor 13.mangalpally 14.sheriguda 15.ibrahimpatnam");
		int S= scan.nextInt();
		System.out.println("Choose the Departure Stop:");
		System.out.println("1.L.B nagar 2.sagar x-road 3.OMKAR NAGAR 4.hastinapur 5.bn-reddy 6.sagar complex 7.gurramguda 8.injapur 9.emjyal 10.ragannaguda 11.manneguda 12.bongloor 13.mangalpally 14.sheriguda 15.ibrahimpatnam");
		int P=scan.nextInt();
		
			scan.close();
		

		System.out.println("***TSRTC(HYDERABAD)***");
	    //choosing boarding stop	
		if(S!=P)
		{  if(S<P)
		  {
			switch(S)
			
			{
				case 1: System.out.println("FROM: LB-NAGAR");
					break;
				case 2:System.out.println("FROM: SAGAR x-ROAD");
					break;
				case 3: System.out.println("FROM: OMKAR NAGAR");
					break;
				case 4: System.out.println("FROM: HASTINAPUR");
					break;
				case 5: System.out.println("FROM: BN-REDDY NAGAR");
					break;
				case 6: System.out.println("FROM: SAGAR COMPLEX");
					break;
				case 7: System.out.println("FROM: GURRAMGUDA");
					break;
				case 8: System.out.println("FROM: INJAPUR");
					break;
				case 9: System.out.println("FROM: EMJYAL");
					break;
				case 10: System.out.println("FROM: RAGANNAGUDA");
					break;
				case 11: System.out.println("FROM: MANNEGUDA");
					break;
				case 12: System.out.println("FROM: BONGULOOR");
					break;
				case 13: System.out.println("FROM: MANGALPALLY");
					break;
				case 14: System.out.println("FROM: SHERIGUDA");
					break;
				default: System.out.println("enter a valid boarding stop");
			}
		//choosing destination stop
		
		
		switch(P)
			{
				case 1: System.out.println("TO: LB-NAGAR");
					break;
				case 2:System.out.println("TO: SAGAR x-ROAD");
					break;
				case 3: System.out.println("TO: OMKAR NAGAR");
					break;
				case 4: System.out.println("TO: HASTINAPUR");
					break;
				case 5: System.out.println("TO: BN-REDDY NAGAR");
					break;
				case 6: System.out.println("TO: SAGAR COMPLEX");
					break;
				case 7: System.out.println("TO: GURRAMGUDA");
					break;
				case 8: System.out.println("TO: INJAPUR");
					break;
				case 9: System.out.println("TO: EMJYAL");
					break;
				case 10: System.out.println("TO: RAGANNAGUDA");
					break;
				case 11: System.out.println("TO: MANNEGUDA");
					break;
				case 12: System.out.println("TO: BONGULOOR");
					break;
				case 13: System.out.println("TO: MANGALPALLY");
					break;
				case 14: System.out.println("TO: SHERIGUDA");
					break;
				default: System.out.println("TO: Ibrahimpatnam");
			}
		  }
		else
			System.out.println("ERROR");
		}
		else
			System.out.println("ERROR");
	if(S!=P)
	{ 
		if(S<P)
		{
		System.out.print("FARE:");
	//from LB NAGAR
	if(S==1)
	{
			if(P==2)
			{
				System.out.print(" RS:10/-");
			}
			else if(P==3)
			{
				System.out.print(" RS:15/-");
		        }
			else if(P==4)
			{
				System.out.print(" RS:20/-");
		        }
			else if(P==5)
			{
				System.out.print(" RS:30/-");
		        }
			else if(P==6)
			{
				System.out.print(" RS:35/-");
		        }

			else if(P==7)
			{
				System.out.print(" RS:38/-");
		        }
			else if(P==8)
			{
				System.out.print(" RS:40/-");
		        }
			else if(P==9)
			{
				System.out.print(" RS:45/-");
		        }
			else if(P==10)
			{
				System.out.print(" RS:50/-");
		        }
			else if(P==11)
			{
				System.out.print(" RS:55/-");
		        }

			else if(P==12)
			{
				System.out.print(" RS:60/-");
		        }
			else if(P==13)
			{
				System.out.print(" RS:65/-");
		        }
			else if(P==14)
			{
				System.out.print(" RS:70/-");
		        }
			else
				System.out.print(" RS:80/-");
	}
	//FROM SAGAR X-ROAD
	else if(S==2)
	{
			if(P==3)
		{
			System.out.print(" RS:5/-");
		}
			else if(P==4)
			{
				System.out.print(" RS:10/-");
		        }
			else if(P==5)
			{
				System.out.print(" RS:15/-");
		        }
			else if(P==6)
			{
				System.out.print(" RS:17/-");
		        }
			else if(P==7)
			{
				System.out.print(" RS:20/-");
		        }

			else if(P==8)
			{
				System.out.print(" RS:25/-");
		        }
			else if(P==9)
			{
				System.out.print(" RS:30/-");
		        }
			else if(P==10)
			{
				System.out.print(" RS:40/-");
		        }
			else if(P==11)
			{
				System.out.print(" RS:50/-");
		        }
			else if(P==12)
			{
				System.out.print(" RS:55/-");
		        }

			else if(P==13)
			{
				System.out.print(" RS:60/-");
		        }
			else if(P==14)
			{
				System.out.print(" RS:65/-");
		        }
			else 
			{
				System.out.print(" RS:70/-");
		        }
	}
	//FROM OMKAR NAGAR
	else if(S==3)
	{
		if(P==4)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==5)
		{
			System.out.print(" RS:10/-");
	        }
		else if(P==6)
		{
			System.out.print(" RS:12/-");
	        }
		else if(P==7)
		{
			System.out.print(" RS:18/-");
	        }

		else if(P==8)
		{
			System.out.print(" RS:25/-");
	        }
		else if(P==9)
		{
			System.out.print(" RS:30/-");
	        }
		else if(P==10)
		{
			System.out.print(" RS:35/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:40/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:45/-");
	        }

		else if(P==13)
		{
			System.out.print(" RS:50/-");
	        }
		else if(P==14)
		{
			System.out.print(" RS:55/-");
	        }
		else 
		{
			System.out.print(" RS:60/-");
	        }
	}
	//FROM HASTINAPUR
	else if(S==4)
	{
		if(P==5)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==6)
		{
			System.out.print(" RS:10/-");
	        }
		else if(P==7)
		{
			System.out.print(" RS:12/-");
	        }
		else if(P==8)
		{
			System.out.print(" RS:18/-");
	        }

		else if(P==9)
		{
			System.out.print(" RS:25/-");
	        }
		else if(P==10)
		{
			System.out.print(" RS:30/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:35/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:40/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:45/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:50/-");
	        }
		else 
		{
			System.out.print(" RS:55/-");
		}
	}
	//FROM BN REDDY NAGAR
	else if(S==5)
	{	
		if(P==6)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==7)
		{
			System.out.print(" RS:10/-");
	        }
		else if(P==8)
		{
			System.out.print(" RS:15/-");
	        }

		else if(P==9)
		{
			System.out.print(" RS:20/-");
	        }
		else if(P==10)
		{
			System.out.print(" RS:25/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:30/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:35/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:38/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:43/-");
	        }
		else 
		{
			System.out.print(" RS:50/-");
		}

	}
	//from sagar complex
	else if(S==6)
	{
		 if(P==7)
			{
				System.out.print(" RS:5/-");
		        }
			else if(P==8)
			{
				System.out.print(" RS:8/-");
		        }

			else if(P==9)
			{
				System.out.print(" RS:13/-");
		        }
			else if(P==10)
			{
				System.out.print(" RS:18/-");
		        }
			else if(P==11)
			{
				System.out.print(" RS:25/-");
		        }
			else if(P==12)
			{
				System.out.print(" RS:30/-");
		        }
			else if(P==13)
			{
				System.out.print(" RS:35/-");
		        }

			else if(P==14)
			{
				System.out.print(" RS:38/-");
		        }
			else 
			{
				System.out.print(" RS:43/-");
			}
	}
	//from gurramguda
	else if(S==7)
	{
		if(P==8)
		{
			System.out.print(" RS:5/-");
	        }

		else if(P==9)
		{
			System.out.print(" RS:8/-");
	        }
		else if(P==10)
		{
			System.out.print(" RS:13/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:18/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:23/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:28/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:30/-");
	        }
		else 
		{
			System.out.print(" RS:35/-");
		}
	}
	//from injapur
	else if(S==8)
	{
		if(P==9)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==10)
		{
			System.out.print(" RS:8/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:13/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:18/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:23/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:28/-");
	        }
		else 
		{
			System.out.print(" RS:32/-");
		}
	}//from emyjal
	else if(S==9)
	{
		if(P==10)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==11)
		{
			System.out.print(" RS:8/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:10/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:15/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:18/-");
	        }
		else 
		{
			System.out.print(" RS:23/-");
		}
	}//from ragannaguda
	else if(S==10)
	{
		if(P==11)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==12)
		{
			System.out.print(" RS:8/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:13/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:17/-");
	        }
		else 
		{
			System.out.print(" RS:20/-");
		}
	}//from manneguda
	else if(S==11)
	{
		if(P==12)
		{
			System.out.print(" RS:5/-");
	        }
		else if(P==13)
		{
			System.out.print(" RS:8/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:12/-");
	        }
		else 
		{
			System.out.print(" RS:18/-");
		}
	}//from bonguloor
	else if(S==12)
	{
		if(P==13)
		{
			System.out.print(" RS:5/-");
	        }

		else if(P==14)
		{
			System.out.print(" RS:10/-");
	        }
		else 
		{
			System.out.print(" RS:15/-");
		}
	}//from mangalpally
	else if(S==13)
	{
		if(P==14)
		{
			System.out.print(" RS:5/-");
	        }
		else 
		{
			System.out.print(" RS:10/-");
		}
	}//from sheriguda
	else if(S==14)
	{
		if(P==15)
			System.out.print("RS:8/-");
		else 
			System.out.println("error!");
		
	}

	else 
		System.out.println("ERROR!");
	System.out.println(" ");
	System.out.println("   Thank you!");
	System.out.println("..Happy journey..");
	}
	}
	}	
	}
		



