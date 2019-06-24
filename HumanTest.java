public class HumanTest {
	public static void main(String[] args) {
		Human player1 = new Human();
        Human player2 = new Human();
    
		player1.setStrength(10);
		player2.setIntelligence(4);
        player1.attack(player2);
        
		System.out.println("Player2 Health: " + player2.getHealth());
		System.out.println("Player1 Strength: " + player1.getStrength());
		System.out.println("Player2 Intelligence: " + player2.getIntelligence());
		System.out.println("Player1 Health: " + player1.getHealth());
	}
}