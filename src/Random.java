 import java.util.*;
public class Random extends Player{

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int generateRoshambo() {
		Random rand = new Random();
		int random = rand.nextInt(3)+1;
		switch (random) {
		case 1:System.out.println("T1");
			return 1;
		case 2:System.out.println("T2");
			return 2;
		case 3:System.out.println("T3");
			return 3;
			default:
				return 0;		
		
	}
 }}

