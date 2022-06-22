package j;
import java.util.*;

public class ForEachEx {
	public static void main(String[] args) {
		List<String>gamesList = new ArrayList<String>();
		gamesList.add("foot ball");
		gamesList.add("cricket");
		gamesList.add("basket ball");
		System.out.println("     passing lambda ex    ");
		gamesList.forEach(games->System.out.println(games));
	}

}
