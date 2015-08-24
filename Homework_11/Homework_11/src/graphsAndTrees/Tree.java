package graphsAndTrees;

//import java.util.ArrayList;
//
//public class Tree<T> {
//
//	public static class TreeNode<T> {
//		private T value;
//		private boolean hasParent;
//		private ArrayList<TreeNode<T>> children;
//
//		public TreeNode(T value) {
//			if (value == null) {
//				throw new IllegalArgumentException("Cannot insert null value!");
//			}
//			this.value = value;
//			this.children = new ArrayList<TreeNode<T>>();
//		}
//
//		public T getValue() {
//			return this.value;
//		}
//
//		public void setValue(T value) {
//			this.value = value;
//		}
//
//		public void addChild(TreeNode<T> child) {
//			if (child == null) {
//				throw new IllegalArgumentException("Cannot insert null value!");
//			}
//
//			if (child.hasParent) {
//				throw new IllegalArgumentException("The node already has a parent!");
//			}
//
//			child.hasParent = true;
//			this.children.add(child);
//		}
//
//		public TreeNode<T> getChild(int index) {
//			return this.children.get(index);
//		}
//
//		public int getChildrenCount() {
//			return this.children.size();
//		}
//	}
//
//	private TreeNode<T> root;
//
//	public Tree(T value) {
//		if (value == null) {
//			throw new IllegalArgumentException("Cannot insert null value!");
//		}
//
//		this.root = new TreeNode<T>(value);
//	}
//
//	public Tree(T value, Tree<T>... children) {
//		this(value);
//
//		for (Tree<T> child : children) {
//			this.root.addChild(child.root);
//		}
//	}
//
//	public TreeNode<T> getRoot() {
//		return this.root;
//	}
//
//	public ArrayList<TreeNode<T>> getChildNodes() {
//		if (this.root != null) {
//			return this.root.children;
//		}
//		return new ArrayList<TreeNode<T>>();
//	}
//
//	private void printDFS(TreeNode<T> root, String spaces) {
//		if (this.root == null) {
//			return;
//		}
//
//		System.out.println(spaces + root.getValue());
//
//		TreeNode<T> child = null;
//		for (int i = 0; i < root.getChildrenCount(); i++) {
//			child = root.getChild(i);
//			printDFS(child, spaces + "   ");
//		}
//	}
//
//	public void printDFS() {
//		this.printDFS(this.root, new String());
//	}
//
//	public static void main(String[] args) {
//
//		Tree<Integer> tree = new Tree<Integer>(7,
//				new Tree<Integer>(19, new Tree<Integer>(1), new Tree<Integer>(12), new Tree<Integer>(31)),
//				new Tree<Integer>(21), new Tree<Integer>(14, new Tree<Integer>(23), new Tree<Integer>(6)));
//
//		tree.printDFS();
//	}
//}

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

	List<Tree<T>> children = new ArrayList<Tree<T>>();
	Tree<T> parent = null;
	T data = null;

	public Tree(T data) {
		this.data = data;
	}

	public Tree(T data, Tree<T> parent) {
		this.data = data;
		this.parent = parent;
	}

	public List<Tree<T>> getChildren() {
		return children;
	}

	public void setParent(Tree<T> parent) {
		parent.addChild(this);
		this.parent = parent;
	}

	public void addChild(T data) {
		Tree<T> child = new Tree<T>(data);
		child.setParent(this);
		this.children.add(child);
	}

	public void addChild(Tree<T> child) {
		child.setParent(this);
		this.children.add(child);
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isRoot() {
		return (this.parent == null);
	}

	public boolean isLeaf() {
		if (this.children.size() == 0)
			return true;
		else
			return false;
	}

	public static int depth(Tree<String> temp) {
		int depth = 1;
		while (temp.parent != null && temp != null) {
			depth++;
			temp = temp.parent;
		}
		return depth;
	}

	public static void main(String[] args) {

		Tree<String> root = new Tree<String>("first");
		Tree<String> child1 = new Tree<String>("second", root);
		Tree<String> child2 = new Tree<String>("second2", root);
		Tree<String> grandChild2 = new Tree<String>("third2", child1);
		Tree<String> grandChild1 = new Tree<String>("third", child1);
		Tree<String> grandGrandChild1 = new Tree<String>("third2", grandChild1);
		System.out.println("Root depth: " + depth(root));
		System.out.println("Child1 depth: " + depth(child1));
		System.out.println("Child2 depth: " + depth(child2));
		System.out.println("Grandchild1 depth: " + depth(grandChild1));
		System.out.println("Grandchild2 depth: " + depth(grandChild2));
		System.out.println("GrandGrandchild1 depth: " + depth(grandGrandChild1));
	}
}