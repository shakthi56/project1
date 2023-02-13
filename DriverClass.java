package LibraryManagementSystem;

import java.util.Scanner;

public class DriverClass {	

	public static void main(String[] args) {
		Library obj=new Library(); // creating object for Library class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number from the below options");
		System.out.print("1.Add the books"+ '\n'+"2.Display all books" +'\n'+ "3.Search a book"+'\n'+"4.Update book" +'\n'+"5.Exit" );
		int choice;

		do {
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				obj.add(scan); // method call -> add()
				break;
			case 2:
				//System.out.println("BOOKID"+" BOOKNAME "+" AUTHORNAME "+" EDITION "+" JOURNAL "+" NUMBER  OF COPIES");
				obj.display();
				break;
			case 3:
				obj.search(scan);
				break;
			case 4:
				obj.update(scan);
				break;
			case 5:
				System.out.println("Thank you for visiting");
				break;

			}
		}
		while(choice!=5);
	}

}

	    
	
