package greatlearning.gradedproject2.question2;


public class question2_main {
	public static void main(String[] args) {

		Question2 tree = new Question2();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.UpdatingTree(tree.node);
		tree.IteratingTree(tree.newHead);
	}
}
