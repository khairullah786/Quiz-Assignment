




import java.util.Scanner;


 class Assignment {
	
	
	public static void main (String[] args) {
		
		
		
		String answer1 = "";
		String answer2 = "";
		String answer3= "";
		
		Scanner Scan = new Scanner(System.in);
		
		int numberCorrect = 0;
		
		int quesions = 4;
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println("What is the Capital Of Afghanistan?");
		System.out.println("a: Kabul");
			System.out.println("b: Bamyan");
			System.out.println("c: Herat");
			System.out.println("d: Panjshier");
			
			answer1 = Scan.nextLine();
		
		if(answer1.equals("a"))
		{
			System.out.println("that is Correct");
			numberCorrect = numberCorrect + 1;
		
			
		} else {
			
			
	System.out.println("that is inCorrect");
	
	
			
	    System.out.println("What is the biggist City In the World?");
	    System.out.println("a: Tokya");
		System.out.println("b: Shanghai");
		System.out.println("c: Dehli");
		System.out.println("d: New York");
		
			answer2= Scan.nextLine();
			
			if(answer2.equals("b"))
			{
				
			System.out.println("That is Correct");
			numberCorrect = numberCorrect + 1;
			
			}else {
				
				System.out.println("that is inCorrect");
			
			}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
			

			System.out.println("How many way you can Save a Document?");
			System.out.println("a: 2");
			System.out.println("b: 3");
			System.out.println("c: 4");
			System.out.println("d: 5");
			
			answer3= Scan.nextLine();
			
			if(answer3.equals("b"))
			
			{
				System.out.println("That is Correct");
				numberCorrect = numberCorrect + 1;
			}else {
				System.out.println("that is inCorrect");
				
				
			}
				
			
		
		
		}
		
	}
		
}
	
