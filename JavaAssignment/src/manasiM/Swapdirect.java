package manasiM;

public class Swapdirect {
	void display(int x, int y) {
		System.out.println("Befor Swap  X is :" + x + " and Y is :" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap  X is :" + x + " and Y is :" + y);
	}

	public static void main(String[] args) {

		new Swapdirect().display(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}

}
