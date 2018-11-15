package exercise1;

import exercise1.SingularlyLinkedList;


public class boxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingularlyLinkedList<String> boxers= new SingularlyLinkedList <String>();
		
		boxers.addFirst("Turija");
		boxers.addFirst("Del Rosario");
		boxers.addFirst("Fuego");
		boxers.addFirst("Gonzal");
		boxers.addFirst("Velaro");
		
		
		
		System.out.println("size : " + boxers.size());
		
	}

}
 