package BST;

class Node {
	Node left, right;
	 int data;
	 Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
}
public class HeightOfTree {
	Node root;
	Node insert(Node root, int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		} else if(data<root.data) {
			root.left=insert(root.left, data);
		} else if(data>root.data) {
			root.right=insert(root.right, data);
		}
		return root;
	}
	
	int height(Node root) {
		if(root==null)
			return 0;
		else {
			int lDepth=height(root.left);
			int rDepth=height(root.right);
			if(lDepth>rDepth)
				return lDepth+1;
			else 
				return rDepth+1;
		}
	}

}

class HeightBst {
	public static void main(String[] args) {
		HeightOfTree a= new HeightOfTree();
		Node root=null;
		root=a.insert(root, 50);
		a.insert(root, 30);
		a.insert(root, 70);
		a.insert(root, 20);
		a.insert(root, 40);
		a.insert(root, 60);
		a.insert(root, 80);
		System.out.println(a.height(root));
		
	}

	}