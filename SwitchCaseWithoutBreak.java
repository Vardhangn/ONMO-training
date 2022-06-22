package j;

public class SwitchCaseWithoutBreak {
	public static void main(String[] args) {
		int day = 6;
		String dayType = null;
		String dayString;
		
		switch(day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "tuesday";
			break;
		case 3:
			dayString = "wednesday";
			break;
		case 4:
			dayString = "thursday";
			break;
		case 5:
			dayString = "friday";
			break;
		case 6:
			dayString = "saturday";
			break;
		case 7:
			dayString = "sunday";
			break;
		default:
			dayString = "invalid";
		}
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType = "weekday";
			break;
		case 6:
		case 7:
			dayType = "weekend";
			break;
			
		}
		System.out.println(dayString+ "  is a  " +dayType);
	}

}
