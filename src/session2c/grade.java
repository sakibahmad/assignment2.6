package session2c; 
	/*.....................GRADE...................*/ 
	import java.util.Scanner;
	public class grade extends demo {

		public static void main(String[] args) {
			demo o=new demo();
  			o.nos();
  			
			// DEFINE CONSTRAINT
			
  			int age,marks;
			System.out.println(" Enter age ");
			
			// TAKEING USER INPUT
			
			@SuppressWarnings("resource")
			Scanner obj=new Scanner(System.in);
			age=obj.nextInt();
			System.out.println(" Enter marks");
			marks=obj.nextInt();
			
			// GRADE A CONDITION
			
			if(marks>70)
			
				System.out.println("your grade is \n A");
			
			// GRADE A CONDITION FOR AGE RELAXATION	
			
			else if(marks>60&&age<15)
			
				System.out.println(" your grade is \n A");
			
			// GRADE B CONDITION		
			
			else	if(marks>60&&marks<70)
							 System.out.println(" your grade is \n B");	
						else if(marks>45&&marks<60&&age<15)
							 System.out.println(" your grade is \n B");
			
			// GRADE C CONDITION	
			
						else if(marks<61)
						System.out.println(" your grade is \n C");
		         else if(marks<45&&age<15)
			 System.out.println(" your grade is \n C");
		}		
		

	}



