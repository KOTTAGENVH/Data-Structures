public class LinkedList {
 private Link first;
 
 public LinkedList() {
	 first = null;
 }
 
 public boolean isEmpty() {
	 return(first == null);
 }
 
 //insert first method
 public void insertFirst(String name,double avg ) {
	 
	 Link newLink = new Link(name, avg);//create new Link
	 newLink.next = first;//link new link to existing link
	 first = newLink;//assign new link as the first value
 }
 
 //Delete first method
 public Link deleteFirst() {
	 Link temp = first; //save the reference of the first to temp
	 first = first.next; //change the first reference to next available link
	 return temp;	 
 }
    public void displayList() {
    	Link current = first;//in order to start from the begining
    	while(current!=null) {
    		current.displayDetails(); //display links
    		current = current.next;
    	}
    }
    public Link deleteLink(String name) {
    	Link current = first;                           
    	Link previous = first;
    	
    	if(current == null)//check the list is empty or not
    		{
    		return null;
    }
    	while(!current.name.equals(name)) {
    		previous = current;
    		current = current.next;
    		
    		if(current == null) {
    			return null;//if does not have any element to be deleted
    		}
    	}
    	if(current == first) {
    		first = first.next;
    	}else {
    		previous.next=current.next;
    	}
    	return current;
 
}
}
