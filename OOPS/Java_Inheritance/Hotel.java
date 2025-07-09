package Java_Inheritance;

interface Worker {
    void performDuties();
}

class Person1 {
    String name;
    int id;

    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person1 implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayInfo();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing the kitchen.\n");
    }
}

class Waiter extends Person1 implements Worker {
    String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Section: " + section);
        System.out.println("Duties: Taking orders and serving customers.\n");
    }
}

class Hotel {
    public static void main(String[] args) {
        Worker chef = new Chef("Ravi", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Anita", 202, "Outdoor Seating");

        chef.performDuties();
        waiter.performDuties();
    }
}
