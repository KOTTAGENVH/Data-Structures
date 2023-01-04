public class Tree {

	private Node root;
	public void insert(int Empno, String name) {
		Node newNode = new Node();
		newNode.Empno=Empno;
		newNode.name=name;
		
		if(root==null) {
			root=newNode; //if tree is empty make the newnode as root
		}
		else {
			Node current=root;
			Node parent;
			while(true) {
				parent=current;
				if(Empno<current.Empno) {//left child assigning
					current=current.leftChild;
					if(current==null) {
						parent.leftChild=newNode;
						return;
					}
				}
				
				else {//right child assigning
					current=current.rightChild;
					if(current==null) {
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}
	
	private void inOrder(Node localRoot) {//left, root, right
		if(localRoot!=null) {
			inOrder(localRoot.rightChild);
			localRoot.displayNode();
			inOrder(localRoot.leftChild);
		}
	}
	
	public void TraverseinOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {//root, left, right
		if(localRoot!=null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
			
		}
	}
	public void TraversepreOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {//left, right, root
		if(localRoot!=null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	public void TraversepostOrder() {
		postOrder(root);
	}
	
	private Node findRescursive(Node localRoot, int empno) {
		if (localRoot==null) {
			return null;
		}
		else if(localRoot.Empno==empno) {
			System.out.println(localRoot.name);
			return localRoot;
		}
		else if(empno<localRoot.Empno) {
			return findRescursive(localRoot.leftChild,empno);
		}
		else {
			return findRescursive(localRoot.rightChild,empno);
		}
	}
	
	public Node callRecursive(int empno) {
		return findRescursive(root, empno);
	}
	public Node find(int empno) {
		Node current=root;
		while(current.Empno!=empno) {
			if(empno<current.Empno) {
				current=current.leftChild;
			}
			else {
				current=current.rightChild;
			}
			
			if(current==null) {
				System.out.println("Error not found");
				return null;
			}
			
			//found and print EmpNo
		}
		System.out.println("Employee Name : " + current.name);
		return current;
		
	}
	
	public void deleteAll() {
		root=null;
	}
}
