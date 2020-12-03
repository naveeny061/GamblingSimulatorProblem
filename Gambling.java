import java.util.Random;

public class Gambling {

	public int MakeABet() {
		Random random = new Random();
		int result = random.nextInt(2);
		if (result == 1) {
			//System.out.println("Win");
			return result;
		} else {
			//System.out.println("Loose");
			return result - 1;
		}
	}
	public void Calculative_Gambler() {
		int totalStack = 100;
		while (true) {
			int resultBet = MakeABet();
			totalStack+=resultBet;
			if (totalStack == 150 || totalStack == 50) 
				break;
			
		}
		System.out.println(totalStack);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Problem");
		int startStake = 100;
		int bet = 1;
		Gambling gamble = new Gambling();
		int betResult = gamble.MakeABet();
		int newStack = betResult + startStake;
		//System.out.println(newStack);
		gamble.Calculative_Gambler();
	}
}
