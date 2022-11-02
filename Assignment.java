




import java.util.Scanner;


 class Assignment {
	
	
	public static void main (String[] args) {
		
		
		
		String answer1 = "";
		String answer2 = "";
		
		Scanner Scan = new Scanner(System.in);
		
		int numberCorrect = 0;
		int Score = 0;
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
			Score = Score + 5;
			System.out.println("your score is " + Score );
			
		} else {
			Score = Score - 2;
			
	System.out.println("that is inCorrect");
	System.out.println("your score is " + Score );
	
			
	    System.out.println("What is Capital OF Afghanistan?");
	    System.out.println("a: Kabul");
		System.out.println("b: Bamyan");
		System.out.println("c: Herat");
		System.out.println("d: Panjshier");
		
			answer2= Scan.nextLine();
			
			if(answer2.equals("b"))
			{
				
			System.out.println("That is Correct");
			numberCorrect = numberCorrect + 1;
			System.out.println("your score is " + Score );
			}else {
				Score = Score - 2;
				System.out.println("that is inCorrect");
				System.out.println("your score is " + Score );
				
			}
			
			
			
				
		
			
	
	
		
		
		}
		
	}
		
}
	
