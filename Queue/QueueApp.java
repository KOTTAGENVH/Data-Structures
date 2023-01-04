public static void main(String[] args) {
	
                QueueX mainQueue = new QueueX(5);
                
                Scanner sc = new Scanner(System.in);
                int inputStr;
                for(int i=0; i<5; i++) {
                	System.out.println("Enter Transaction ID : ");
                	inputStr = sc.nextInt();
                	mainQueue.insert(inputStr);
                }

	//Object creation of Even Queue and Odd Queue from the Queue X class
	QueueX evenQueue = new QueueX(5);
	QueueX oddQueue = new QueueX(5);
	
	int value;
	
	while(!mainQueue.isEmpty()) {
		value = mainQueue.remove();
		if(value % 2 == 0) {
			evenQueue.insert(value);
		}
		else {
			oddQueue.insert(value);
		}
	
	}
	int x =	oddQueue.getSize();
	System.out.println(x);
		System.out.println("PC1:");

	while(!evenQueue.isEmpty()) {
		System.out.println("Transaction "+evenQueue.remove());
	}
	
	System.out.println("PC2:");
	   
	while(!oddQueue.isEmpty()) {
		System.out.println("Transaction "+oddQueue.remove());
	}

		
}
}
