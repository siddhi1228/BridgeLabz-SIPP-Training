package Java_LinkedList;

public class RoundRobinLinkedList {

    static class ProcessNode {
        int pid;
        int burstTime;
        int remainingTime;
        int priority;
        int waitingTime;
        int turnaroundTime;
        ProcessNode next;

        public ProcessNode(int pid, int burstTime, int priority) {
            this.pid = pid;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.waitingTime = 0;
            this.turnaroundTime = 0;
            this.next = null;
        }
    }

    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int time = 0;

    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void removeProcess(int pid) {
        if (head == null) return;
        ProcessNode temp = head, prev = tail;
        do {
            if (temp.pid == pid) {
                if (temp == head) {
                    if (head == tail) {
                        head = tail = null;
                        return;
                    }
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void simulateScheduling(int quantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        
        boolean allDone;
        time = 0;

        while (true) {
            allDone = true;
            ProcessNode temp = head;
            System.out.println("=== Round Start ===");

            do {
                if (temp.remainingTime > 0) {
                    allDone = false;
                    int execTime = Math.min(quantum, temp.remainingTime);
                    time += execTime;
                    temp.remainingTime -= execTime;

                    ProcessNode inner = head;
                    do {
                        if (inner != temp && inner.remainingTime > 0)
                            inner.waitingTime += execTime;
                        inner = inner.next;
                    } while (inner != head);

                    if (temp.remainingTime == 0) {
                        temp.turnaroundTime = time;
                        removeProcess(temp.pid);
                    }

                    displayProcesses();
                }
                temp = temp.next;
            } while (temp != head);

            if (allDone) break;
        }
        calculateAvgTimes();
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Process Queue:");
        do {
            System.out.println("PID: " + temp.pid + ", BT: " + temp.burstTime + ", Remaining: " + temp.remainingTime + ", Waiting: " + temp.waitingTime + ", TAT: " + (temp.turnaroundTime == 0 ? "-" : temp.turnaroundTime));
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void calculateAvgTimes() {
        int totalWT = 0, totalTAT = 0, count = 0;
        ProcessNode temp = head;
        do {
            if (temp == null) break;
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time: " + (count == 0 ? 0 : (double) totalWT / count));
        System.out.println("Average Turnaround Time: " + (count == 0 ? 0 : (double) totalTAT / count));
    }

    public static void main(String[] args) {
    	RoundRobinLinkedList scheduler = new RoundRobinLinkedList();

        scheduler.addProcess(1, 8, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 1);

        scheduler.displayProcesses();
        scheduler.simulateScheduling(3);
    }
}

