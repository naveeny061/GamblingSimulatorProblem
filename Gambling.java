import java.util.Random;

public class Gambling {
	public int MakeABet() {
	Random random=new Random();
	int result= random.nextInt(2);
	if(result==1) { 
		System.out.println("Win");
		return result;
	}
	else {
		System.out.println("Loose");
		return result-1;
	}
			
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Problem");
		int startStake =100;
		int bet=1;
		Gambling gamble =new Gambling();
		int betResult=gamble.MakeABet();
		int newStack=betResult+startStake;
		System.out.println(newStack);
	}
}
