
public class StackMain {
 public static void main(String[] args) {
	 Stack theStack = new Stack(10);
	 theStack.push('S');
	 theStack.push('T');
	 theStack.push('A');
	 theStack.push('C');
	 theStack.push('K');
	 
	 System.out.println(theStack.peek());
	 
	 while(!theStack.isEmpty()) {
		 char ch2 = theStack.pop();
		 System.out.println("top:" +ch2);
	 }
 }
}
