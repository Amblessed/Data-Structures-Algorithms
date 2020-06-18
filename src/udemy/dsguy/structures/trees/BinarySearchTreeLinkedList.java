package udemy.dsguy.structures.trees;


import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTreeLinkedList<T extends Comparable<T>> {

	BinaryNode<T> root;

	public BinaryNode getRoot()
	{
		return root;
	}

	// Constructor
	BinarySearchTreeLinkedList() {
		root = null;
	}

	// Insert values in BST
	public void insert(T value)
	{
		root = insert(root, value);
	}

	// Helper Method
	private BinaryNode insert(BinaryNode currentNode, T value)
	{
		if (currentNode == null)
		{ // if root node is blank then insert new node there
			System.out.println("Successfully inserted " + value + " in BST");
			return createNewNode(value);
		}

		T valueReturned = (T) currentNode.getValue();
		int number = value.compareTo(valueReturned);

		if (number <= 0)
		{
			currentNode.setLeft(insert(currentNode.getLeft(), value));
		}
		else
		{
			currentNode.setRight(insert(currentNode.getRight(), value));
		}
		return currentNode;

		/*if (number <= 0)
		{
			currentNode.setLeft(insert(currentNode.getLeft(), value));
			return currentNode;
		}
		else
		{
			currentNode.setRight(insert(currentNode.getRight(), value));
			return currentNode;
		}*/
	}

	// creates a new blank new node
	public BinaryNode createNewNode(T value)
	{
		BinaryNode node = new BinaryNode(value);
		node.setValue(value);
		return node;
	}
	
	// Deleting a node from BST
	public void deleteNodeOfBST(T value)
	{
		System.out.println("\n\nDeleting " + value + " from BST...");
		deleteNodeOfBST(root,value);
	}
	
	// Helper Method for delete
	private BinaryNode deleteNodeOfBST(BinaryNode root, T value)
	{
		if (root == null)
		{
			System.out.println("Value not found in BST");
			return null;
		}

		T valueReturned = (T) root.getValue();
		int number = value.compareTo(valueReturned);

		if (number < 0)
		{
			root.setLeft(deleteNodeOfBST(root.getLeft(), value));
		}
		else if (number > 0)
		{
			root.setRight(deleteNodeOfBST(root.getRight(), value));
		}
		else
		{ // If currentNode is the node to be deleted
			if (root.getLeft() != null && root.getRight() != null)
			{ // if nodeToBeDeleted have both children
				BinaryNode temp = root;
				BinaryNode minNodeForRight = minimumElement(temp.getRight());// Finding minimum element from right subtree
				root.setValue(minNodeForRight.getValue()); // Replacing current node with minimum node from right subtree
				root.setRight(deleteNodeOfBST(root.getRight(), (T) minNodeForRight.getValue()));  // Deleting minimum node from right now
			}
			else if (root.getLeft() != null)
			{// if nodeToBeDeleted has only left child
				root = root.getLeft();
			}
			else if (root.getRight() != null)
			{// if nodeToBeDeleted has only right child
				root = root.getRight();
			}
			else // if nodeToBeDeleted do not have child (Leaf node)
				root = null;
		}
		return root;
	}// end of method

	// Get minimum element in binary search tree
	public static BinaryNode minimumElement(BinaryNode root)
	{
		if (root.getLeft() == null)
		{
			return root;
		}
		else
		{
			return minimumElement(root.getLeft());
		}
	}// end of method

	// Search a node in BST
	public void searchForValue(T value)
	{
		searchForValue(root, value);
	}

	// Search a node in BST
	BinaryNode searchForValue(BinaryNode node, T value)
	{

		if (node == null)
		{
			System.out.println("Value: " + value + " not found in BST.");
			return null;
		}

		T valueReturned = (T) node.getValue();
		int number = value.compareTo(valueReturned);

		if (number == 0)
		{
			System.out.println("Value: " + value + " found in BST.");
			return node;
		}
		else if (number < 0)
		{
			return searchForValue(node.getLeft(), value);
		}
		else
		{
			return searchForValue(node.getRight(), value);
		}
	}// end of method

	// Level order traversal of BST
	void levelOrderTraversal() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		System.out.println("\nPrinting Level order traversal of Tree...");
		if (root == null) {
			System.out.println("Tree does not exists !");
			return;
		}
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.getValue() + " ");
			if (presentNode.getLeft() != null)
				queue.add(presentNode.getLeft());
			if (presentNode.getRight() != null)
				queue.add(presentNode.getRight());
		}
	}// end of method

	// Delete entire BST
	public void deleteTree() {
		System.out.println("Deleting entire Tree...");
		root = null;
		System.out.println("Tree deleted successfully !");
	}// end of method
	
	
	
	void printTreeGraphically() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		
		int CurrentLevel = 1;
		boolean previousLevelWasAllNull = false;
		queue.add(root);
		level.add(1);
		
		System.out.println("\nPrinting Level order traversal of Tree...");
		if(root == null) {
			System.out.println("Tree does not exists !");
			return;
		}
		
		while (!queue.isEmpty()) {
			if(CurrentLevel == level.peek()) { //if we are in the same level
				if(queue.peek()==null) {
					queue.add(null);level.add(CurrentLevel+1);
				}else {
					queue.add(queue.peek().getLeft());level.add(CurrentLevel+1);
					queue.add(queue.peek().getRight());level.add(CurrentLevel+1);
					previousLevelWasAllNull = false;
				}
				System.out.print(queue.remove() + "  ");level.remove();
			}else { //level has changed
				System.out.println("\n");
				CurrentLevel++;
				if(previousLevelWasAllNull == true) {
					break;
				}
				previousLevelWasAllNull = true;
			}
		}//end of loop
	}//end of method
	
}// end of class