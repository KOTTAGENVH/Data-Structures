public class QueueX {
  private int[] QueueArr;
  private int maxSize;
  private int rear;
  private int front;
  private int nItems;
  
  //constructor implementation
  public QueueX(int s) {
	  maxSize = s;
	  QueueArr = new int[maxSize];
	  front = 0;
	  rear = -1;
	  nItems = 0;
  }
  
  //insert method
  public void insert(int j) {
	  if(rear == maxSize - 1) {
		  //Queue is full
		  System.out.println("Queue is Full");
	  }
	  else {
		  QueueArr[++rear] = j;
		  nItems++;
	  }
  }
  
  //remove method
  public int remove() {
	  if(nItems == 0) {
		  System.out.println("Queue is Empty!!");
		  return -99;
	  }
	  else {
		  nItems--;
		  return QueueArr[front++];
	  }
  }
  
  //isEmpty method
  public boolean isEmpty() {
	  return(nItems == 0);
  }
  
  //isFull method
  public boolean isFull() {
	  return (rear == maxSize - 1);
  }


public int getSize() { 
if(nItems==0){
	System.out.println("Empty");
}else {
	return nItems;
}
return 0;
}
}
