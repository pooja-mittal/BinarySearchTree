package BST;

class Node {
	int data;
	Node left, right;
	Node (int data) {
		this.data=data;
		left=right=null;
	}
}
public class minBst {
	
	
	Node root;
	Node insert(Node root, int data) {
		if(root==null)
			return new Node(data);
	 else if(data<root.data) {
		root.left=insert(root.left,data);
	}
		else if(data>root.data) 
			root.right=insert(root.right, data);
		return root;
	}
		int minValue(Node root) {
			Node current=root;
			while(current.left!=null) {
				current=current.left;
			}
			return current.data;
		}
}

class TestminBst1 {
	public static void main(String[] args) {
		minBst a=new minBst();
		Node root=null;
		root=a.insert(root, 50);
		a.insert(root,30);
		a.insert(root,20);
		a.insert(root,70);
		a.insert(root,60);
		a.insert(root,80);
		a.insert(root,40);
		System.out.println(a.minValue(root));
		//a.inOrder();
	}
}
