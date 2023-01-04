public class Linklistmain {

	public static void main(String[] args) {
		LinkedList studentList = new LinkedList();
		
		studentList.insertFirst("Prashni", 69.5);
		studentList.insertFirst("Aravindi", 78.0);
		studentList.insertFirst("Nipuna", 53.5);
        
		studentList.displayList();
		studentList.deleteLink("Aravindi");
		System.out.println();
		System.out.println("-----Deleted------");
		System.out.println();
		
		studentList.displayList();//display remaining link in the linked List
	}

}
