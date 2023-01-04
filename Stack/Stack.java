public class Stack {
  private int top;
  private char[] stackArray;;
  private int maxSize;
  
  public Stack(int maxSize) {
	  this.top = -1;
	  this.stackArray = new char[maxSize];
	  this.maxSize = maxSize;
  }
  
  public boolean isEmpty() {
	  return(top == -1);
  }
  
  public boolean isFull() {
	  return (top == (maxSize -1));
  }
  
  public void push(char ch) {
	  if(!isFull()) {
		  stackArray[++top] = ch;
	  }else
		  System.out.println("Stack is Full");
  }
  
  public char pop() {
	  if(!isEmpty()) {
		  return stackArray[top--];
	  }
	  else
		  System.out.println("Stack is empty");
	  return 0;
  }
  
  public char peek() {
	  if(!isEmpty()) {
		  return stackArray[top];
	  }else
		  System.out.println("Stack is empty");
	  return 0;
  }
}
