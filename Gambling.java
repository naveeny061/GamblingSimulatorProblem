import java.util.Random;

public class Gambling {

	public int MakeABet() {
		Random random = new Random();
		int result = random.nextInt(2);
		if (result == 1) {
			// System.out.println("Win");
			return result;
		} else {
			// System.out.println("Loose");
			return result - 1;
		}
	}

	public String Calculative_Gambler() {
		int totalStack = 100;
		int maxStackForDay = totalStack + totalStack / 2;
		int minStackForDay = totalStack / 2;
		while (true) {
			int resultBet = MakeABet();
			totalStack += resultBet;
			if (totalStack == maxStackForDay || totalStack == minStackForDay)
				break;
		}
		System.out.println("total stack=" + totalStack);
		if (totalStack == maxStackForDay)
			return "win";
		else
			return "loose";
	}

	public void DaysPlaying() {
		int days = 0;
		int win = 0;
		int loose = 0;
		String result;
		while (days < 20) {
			result = Calculative_Gambler();
			if (result == "win")
				win++;
			else
				loose++;
			days++;
		}
		System.out.println("total win=" + win);
		System.out.println("total loose=" + loose);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Problem");
		int startStake = 100;
		int bet = 1;
		Gambling gamble = new Gambling();
		// gamble.MakeABet();
		// gamble.Calculative_Gambler();
		gamble.DaysPlaying();
	}
}
