package studio7;

public class die {
	
	
	
	public static int roll(int sides) {
		
		int valueRolled = (int)(Math.random()*sides + 1); 
		return valueRolled;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You rolled: " + roll(12));
	}

}
