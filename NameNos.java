import java.util.Scanner;

public class NameNos 
{
    	public static void main( String[] args ) 
    	{
		Scanner reader = new Scanner(System.in);
	
		int n;
		System.out.print("Enter the number: ");
		n = reader.nextInt();
		switch(n)
   		{
			case 1:
      		 		System.out.print("\nOne");
      		 		break;
			case 2:
      	  	 		System.out.print("\nTwo");
      	         		break;
			case 3:
      		 		System.out.print("\nThree");
      		 		break;
			case 4:
      		 		System.out.print("\nFour");
      		 		break;
			case 5:
      		 		System.out.print("\nFive");
      	         			break;
			case 6:
      		 		System.out.print("\nSix");
      		 		break;
			case 7:
      		 		System.out.print("\nSeven");
      		 		break;
			case 8:
      		 		System.out.print("\nEight");
      	         			break;
			case 9:
      		 		System.out.print("\nNine");
      	         			break;
			default:
      		 		System.out.print("\nInvalid number\nPlease try again ....\n");
      		 		break;
    		}
    	}

}