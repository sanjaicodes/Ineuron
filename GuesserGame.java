package Assignment2;

import java.util.Scanner;

class Guesser{
	int gusserno ;
	
	@SuppressWarnings("resource")
	int guessNumber() {
		Scanner sc = new Scanner(System.in);
		gusserno = sc.nextInt();
		return gusserno;
	}
}

class Player{
	int playerno;
	
	@SuppressWarnings("resource")
	int guessNumber() {
		Scanner sc = new Scanner(System.in);
		playerno = sc.nextInt();
		return playerno;
	}
}

class Umpare{
	
	int noOfPlayers;
	int start,end;
	
	@SuppressWarnings("resource")
	void matchInformation() {		
		System.out.print("How many player play this match : ");
		Scanner sc = new Scanner(System.in);
		noOfPlayers = sc.nextInt();
		System.out.print("Please provide start and end number : ");
		start = sc.nextInt();
		end = sc.nextInt();	
	}
	
	int numFromGuesser;
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		System.out.print("Guesser kindly guess the number : ");
		int temp = g.guessNumber();
		if(temp<start || temp>end) {
			System.out.print("Hey Guesser kindly guess the number between "+start+" --  "+end+" : ");
			temp = g.guessNumber();
			if(temp<start || temp>end) {
				System.out.println("INVALIDE VALUE");
				System.exit(0);
			}
		}
		else
			numFromGuesser = temp;
		
	}
	
	int numFromPlayer[] = new int[100];
	
	public void collectNumFromPlayer()
	{
		for(int i=0;i<noOfPlayers;i++) {
			Player p = new Player();
			System.out.print("Player "+ (i+1) +" kindly guess the number : ");
			int temp = p.guessNumber();
			if(temp<start || temp>end) {
				System.out.println("WARNING 1 Player "+ (i+1) +" kindly guess the number between "+start+" -- "+end+" ");
				System.out.print("Are Else you are Terminate from this Game : ");
				temp = p.guessNumber();
				if(temp>=start && temp<=end)
				{
					numFromPlayer[i] = temp;
				}
				else
				{
					System.out.println("Due To INVALIDE VALUE Player "+ (i+1) +" You Are Terminated");
					int t = --noOfPlayers;
					System.out.println("Sorry... Match is Restarted");
					System.out.println("Only "+t+" in this Match");
					collectNumFromGuesser();
					collectNumFromPlayer();
					break;
				}
					
			}
			else
				numFromPlayer[i] = temp;	
		}
		

	}
	
	void compare() {
		
		int count = 0;
		for(int i=0;i<noOfPlayers;i++) {
			if(numFromGuesser == numFromPlayer[i]) {
				System.out.println("***** Player "+ (i+1) +" your guess is correct *****");
				count++;
			}
		}
		if(count>1) {
			System.out.println(count+" Players qualified for next round ");
			noOfPlayers = count ;
			System.out.println("NEXT ROUND IS STARTED ");
			collectNumFromGuesser();
			collectNumFromPlayer();
			compare();
		}
		else if(count == 0)
			System.out.println("Match Draw All of Your number not Match to Gusser number");
		else
			System.out.println("Match Sussfully Finished");
	
	}
		
}

public class GuesserGame {

	public static void main(String[] args) {
		
		Umpare obj = new Umpare();
		obj.matchInformation();
		obj.collectNumFromGuesser();
		obj.collectNumFromPlayer();
		obj.compare();
	}

}
