package Java_LinkedList;

class Node {
	int rollno;
	String name;
	int age;
	char grade;
	Node next;
	
	public Node(int rollno, String name,int age, char grade)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.next=null;
	}
}

public class StudentLinkedList
{
	private Node head;
	
	public void addBegin(int rollno, String name,int age, char grade)
	{
		Node newNode = new Node(rollno, name, age, grade);
		newNode.next=head;
		head=newNode;
	}
	
	public void addEnd(int rollno, String name,int age, char grade)
	{
		Node newNode = new Node(rollno, name, age, grade);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next=newNode;
	}
	
	public void addPosition(int position, int rollno, String name,int age, char grade)
	{
		if(position <=1)
		{
			addBegin(rollno,name,age,grade);
			return;
		}
		Node newNode = new Node(rollno, name, age, grade);
		Node temp = head;
		 for (int i = 1; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }
	        if (temp == null) {
	            System.out.println("Position is out of bounds.");
	            return;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	}
	
	public void delete(int rollno)
	{
		if(head == null)
		{
			System.out.println("Empty List");
			return;
		}
		if(head.rollno == rollno)
		{
			head = head.next;
			System.out.println("Deleted");
			return;
		}
		Node temp = head;
		while(temp.next != null && temp.next.rollno != rollno)
		{
			temp=temp.next;
		}
		if(temp.next == null)
		{
			 System.out.println("Student not found.");
	         return;
		}
		temp.next = temp.next.next;
		System.out.println("Deleted student with Roll No: " + rollno);
	}
	
	public void search(int rollno) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollno + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll No " + rollno + " not found.");
    }
	
	public void update(int rollno, char newgrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                temp.grade = newgrade;
                System.out.println("Updated grade for Roll No " + rollno + " to " + newgrade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll No " + rollno + " not found.");
    }
	
	public void display() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        Node temp = head;
        System.out.println("Student Records:");
        while (temp != null) 
        {
            System.out.println("Roll No: " + temp.rollno + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
     }
}

class StudentManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addEnd(1, "Aisha", 20, 'B');
        list.addBegin(2, "Ravi", 21, 'A');
        list.addPosition(2, 3, "Simran", 19, 'C');

        list.display();

        list.search(3);

        list.update(3, 'B');

        list.delete(2);
        list.display();
    }
}
