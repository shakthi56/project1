package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Library {
	private String bookName;
	private String authorName;
	private long edition;
	private int noOfCopies;
	private String journal;
	private int bookId;
	List<Library> Librarylist=new ArrayList<Library>();
	Scanner scan=new Scanner(System.in);

	Library() {

	}

	// parameterized constructor
	Library(int bookId,String bookName,String journal,String authorName,long edition,int noOfCopies) {
		this.bookId=bookId;
		this.bookName=bookName; 
		this.journal=journal;
		this.authorName=authorName;
		this.edition=edition;
		this.noOfCopies=noOfCopies;
	}


	// Public getter and setter methods for the above mentioned attributes
	public int getbookId() {
		return bookId;
	}
	public void setbookId(int bookId) {
		this.bookId=bookId;
	}


	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}


	public String getauthorName() {
		return authorName;
	}
	public void setauthorName(String authorName) {
		this.authorName=authorName;
	}


	public long getedition() {
		return edition;
	}
	public void setedition(int edition) {
		this.edition=edition;
	}


	public int getnoOfCopies() {
		return noOfCopies;
	}
	public void setnoOfCopies(byte noOfCopies) {
		this.noOfCopies=noOfCopies;
	}


	public String getjournal() {
		return journal;
	}
	public void setjournal(String journal) {
		this.journal=journal;
	}

	// toString() is built-in-method of Object Class in Java ---> to return values
	public String toString() {
		return bookId + "   "+ bookName +"   "+ journal +"   "+authorName+"   "+edition+"   "+noOfCopies; 
	}

	// method to add objects to list
	void add(Scanner scan) {
		System.out.print("Enter the BookId");
		int bookId=scan.nextInt();

		System.out.print("Enter the Book Name");
		String bookName=scan.next();

		System.out.print("Enter the Journal");
		String journal=scan.next();

		System.out.print("Enter the Author Name");
		String authorName=scan.next();

		System.out.print("Enter the Edition");
		long edition=scan.nextLong();

		System.out.print("Enter the Number Of copies");
		int noOfCopies=scan.nextInt();

		Librarylist.add(new Library(bookId,bookName,journal,authorName,edition,noOfCopies));
	}

	// method to display the list of values
	public void display() {
		for(Library value: Librarylist) 
			System.out.println(value);
	}

	// method to search a book
	public void search(Scanner scan) {
		boolean flag=false;
		System.out.println("Enter the BookID you want to search");
		int BookId1=scan.nextInt();
		Iterator<Library> obj1=Librarylist.iterator();
		while(obj1.hasNext()) {
			Library obj = obj1.next();
			if(obj.getbookId()==BookId1) {
				flag=true;
				System.out.print("Book found");
				break;
			}
		}
		if(flag==false) {
			System.out.print("Book not Found");
		}

	}


	// method to update the details of book
	public void update(Scanner scan) {
		boolean flag1=false;

		System.out.println("Enter the BookId to which you need to update");
		int BookId2=scan.nextInt();
		Iterator<Library> obj2=Librarylist.iterator();
		int ctr=-1;
		while(obj2.hasNext()) {
			ctr++;
			Library obj=obj2.next();
			if(obj.getbookId() == BookId2) {
				flag1=true;
				System.out.println("Book Found");
				System.out.print("Enter the updated number of copies");
				int noOfCopies=scan.nextInt();
				System.out.print("Enter the BookId");
				int bookId=scan.nextInt();
				System.out.print("Enter the BookName");
				String bookName=scan.next();
				System.out.print("Enter the Authorname");
				String authorName=scan.next();
				System.out.print("Enter the Edition");
				int edition=scan.nextInt();
				System.out.print("Enter the Journal");
				String journal=scan.next();

				Librarylist.set(ctr,new Library(bookId,bookName,journal,authorName,edition,noOfCopies));
				break;
			}
			if(flag1==false) {
				System.out.println("BookId not found");
			}
		}

	}}




















