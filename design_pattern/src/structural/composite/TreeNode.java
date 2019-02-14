package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String name;
	private List<TreeNode> children = new ArrayList<>();

	public TreeNode(String name) {
		this.name = name;
	}

	// ��Ӻ��ӽڵ�
	public void add(TreeNode node) {
		children.add(node);
	}

	// ɾ�����ӽڵ�
	public void remove(TreeNode node) {
		children.remove(node);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {

		return "TreeNode [name=" + name + "]";
	}

}
