
public class Exercise4_3 {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
		      for (int times = 1; times <= 9 && times <= dan; times++)
		        System.out.println(String.valueOf(dan) + "X" + times + "=" + (dan * times)); 
		      System.out.println();
		    } 
	  }
}
