import java.util.Random;
import java.util.Scanner;
public class SecretNumber {
	public static void main (String[]args){


		int guess_num=0;
		Random r= new Random();
		int x= 1+r.nextInt(100);

		Scanner sc = new Scanner(System.in);
		
		while ( guess_num!=x){

			
			System.out.print("Guess a number between 1 and 100:");

			guess_num = sc.nextInt();
			
			
			if (x==guess_num){

				System.out.println("You're Right!");


			}
			
			else if (x<guess_num && x<=100){
				
				System.out.println("You guess a bit high. Guess again!");
				
			}
			
			else if (x>guess_num && x>=1){
				
				System.out.println("You guess a bit low. Guess again!");
				
			}
			else{
				System.out.println("You're out of range Guess again!");
				
				
			}



		}


		System.out.println(guess_num);

		

		System.out.println(x);

		
		
		
		}






	}

