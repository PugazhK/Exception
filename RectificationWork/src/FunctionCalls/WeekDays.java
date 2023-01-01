package FunctionCalls;

public class WeekDays {
	public String findDay(int a) {
		int dayOrder = a;
		switch(dayOrder) {
		case 1: return "sunday" ; 
		case 2: return "Monday" ; 
		case 3: return "tuesday" ; 
		case 4: return "wednesday" ; 
		case 5: return "Thursday" ; 
		case 6: return "Friday" ; 
		case 7: return "Saturday" ; 
		default: return "Invalid";
		}
	}
	
	public void find(int b) {
		int day = b;
		switch(day) {
		case 1: System.out.println("sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("tuesday");break;
		}
	}
	
	public static void main(String[] args) {
		WeekDays wd = new WeekDays();
		System.out.println(wd.findDay(4));
		wd.find(2);
	}
}
