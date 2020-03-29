package problem01;

public class BinaryTreeMain {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.insert(500);
		bt.insert(400);
		bt.insert(350);
		bt.insert(300);
		bt.insert(375);
		bt.insert(450);
		bt.insert(475);
		bt.insert(485);
		bt.insert(600);
		bt.insert(555);
		bt.insert(545);
		bt.insert(560);
		bt.insert(565);
		bt.insert(700);
		bt.printLeftNode(bt.getRoot());
		}
}
