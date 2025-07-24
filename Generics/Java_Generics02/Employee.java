package Java_Generics02;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR"),
            new Employee("David", "Finance")
        );

        Map<String, List<Employee>> grouped = groupByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee emp : employees) {
            map.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        return map;
    }
}

