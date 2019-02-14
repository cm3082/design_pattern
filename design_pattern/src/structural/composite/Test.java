package structural.composite;

public class Test {

	public static void main(String[] args) {
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeA.add(nodeB);
		nodeB.add(nodeC);
		System.out.println("build the tree finished!");
		System.out.println("-------------------ַי¿צ----------------------");
		for (TreeNode headNode : nodeA.getChildren()) {
			System.out.println(headNode);
			for (TreeNode node : headNode.getChildren()) {
				System.out.println(node);
			}
		}

	}

}
