package BST;

public class ImplementBst {
	class Node {
		int data;
		Node left, right;
		Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	Node root;
	ImplementBst() {
		root=null;
	}
	
	void insert(int data) {
		root=insertRec(root, data);
	}
	
	Node insertRec(Node root, int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left=insertRec(root.left, data);
		}
			else if(data>root.data) {
				root.right=insertRec(root.right, data);
			}
		return root;
	}
	
	void inOrder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}
}

class TestBst {
	public static void main(String[] args) {
		ImplementBst a=new ImplementBst();
		a.insert(50);
		a.insert(30);
		a.insert(20);
		a.insert(70);
		a.insert(60);
		a.insert(80);
		a.insert(40);
		a.inOrder();
	}
}
