import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Tree t1=new Tree();
	t1.insert(149, "Anusha");
	t1.insert(150, "Kosala");
	t1.insert(160, "Dinusha");
	t1.insert(130, "Malith");
	t1.insert(155, "Kamal");
	
	System.out.println("\nInOrder(left, root, right) \n");
	t1.TraverseinOrder();
	
	System.out.println("\nPreOrder(root, left, right) \n");
	t1.TraversepreOrder();
	
	System.out.println("\nPostOrder(left, right, root) \n");
	t1.TraversepostOrder();
	
	int value;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println();
	System.out.println("Enter Employee number  : ");
	value=sc.nextInt();
	t1.find(value);
	
	System.out.println();
	t1.deleteAll();
	
	System.out.println("\n After Delete Method Calling");
	t1.callRecursive(130);
	
	System.out.println("\n InOrder(left, root, right)");
	t1.TraverseinOrder();
	
	System.out.println("\n PreOrder(root, lrft, right)");
	t1.TraversepreOrder();
	
	System.out.println("\nPostOrder(left, righ, root) ");
	t1.TraversepostOrder();
	Node n1=new Node();
	System.out.println();
	n1.displayNode();
}

}
