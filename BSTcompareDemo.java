
public class BSTcompareDemo {

	public static void main(String[] args) {
		Binarytree bt = new Binarytree();
		for(int i=0; i<10;i++) {
			bt.ADD((int)(Math.random()*50 +5));
		}
		bt.PRINT();
		
	}

}
