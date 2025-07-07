package Java_LinkedList;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskLinkedList {
	    private TaskNode head = null;
	    private TaskNode tail = null;
	    private TaskNode current = null; // Pointer to keep track of the current task

	    // Add at beginning
	    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
	        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
	        if (head == null) {
	            head = tail = newNode;
	            newNode.next = newNode;
	            current = head;
	        } else {
	            newNode.next = head;
	            tail.next = newNode;
	            head = newNode;
	        }
	    }

	    // Add at end
	    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
	        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
	        if (head == null) {
	            head = tail = newNode;
	            newNode.next = newNode;
	            current = head;
	        } else {
	            tail.next = newNode;
	            newNode.next = head;
	            tail = newNode;
	        }
	    }

	    // Add at specific position (1-based index)
	    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
	        if (position <= 1 || head == null) {
	            addAtBeginning(taskId, taskName, priority, dueDate);
	            return;
	        }

	        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
	        TaskNode temp = head;
	        int count = 1;

	        while (count < position - 1 && temp.next != head) {
	            temp = temp.next;
	            count++;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;

	        if (temp == tail) {
	            tail = newNode;
	        }
	    }

	    // Remove by Task ID
	    public void removeByTaskId(int taskId) {
	        if (head == null) {
	            System.out.println("No tasks to remove.");
	            return;
	        }

	        TaskNode temp = head;
	        TaskNode prev = tail;
	        do {
	            if (temp.taskId == taskId) {
	                if (temp == head) {
	                    head = head.next;
	                    tail.next = head;
	                } else if (temp == tail) {
	                    tail = prev;
	                    tail.next = head;
	                } else {
	                    prev.next = temp.next;
	                }

	                if (current == temp) {
	                    current = temp.next;
	                }

	                System.out.println("Task with ID " + taskId + " removed.");
	                return;
	            }

	            prev = temp;
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("Task ID not found.");
	    }

	    // View current task and move to next
	    public void viewAndMoveToNextTask() {
	        if (current == null) {
	            System.out.println("No tasks to show.");
	            return;
	        }
	        printTask(current);
	        current = current.next;
	    }

	    // Display all tasks from head
	    public void displayAllTasks() {
	        if (head == null) {
	            System.out.println("No tasks in the list.");
	            return;
	        }
	        TaskNode temp = head;
	        System.out.println("All Tasks:");
	        do {
	            printTask(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // Search by Priority
	    public void searchByPriority(int priority) {
	        if (head == null) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        TaskNode temp = head;
	        boolean found = false;

	        do {
	            if (temp.priority == priority) {
	                printTask(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println("No tasks found with Priority: " + priority);
	        }
	    }

	    private void printTask(TaskNode task) {
	        System.out.println("Task ID: " + task.taskId + ", Name: " + task.taskName + ", Priority: " + task.priority + ", Due: " + task.dueDate);
	    }
	}

class TaskManagement {
    public static void main(String[] args) {
        TaskLinkedList scheduler = new TaskLinkedList();

        scheduler.addAtEnd(101, "Buy groceries", 2, "2025-07-08");
        scheduler.addAtBeginning(102, "Finish project", 1, "2025-07-07");
        scheduler.addAtPosition(2, 103, "Call mom", 3, "2025-07-09");

        scheduler.displayAllTasks();

        System.out.println("\nCurrent Task:");
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        scheduler.searchByPriority(1);
        scheduler.removeByTaskId(102);

        System.out.println("\nAll Tasks After Removal:");
        scheduler.displayAllTasks();
    }
}

