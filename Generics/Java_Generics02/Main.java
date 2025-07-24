package Java_Generics02;

import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String holderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String holderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getCoverageType() { return coverageType; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        return policyNumber.equals(((Policy) o).policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate + " | " + coverageType + " | $" + premiumAmount;
    }
}

class PolicyManager {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();
    Map<String, Integer> policyCountMap = new HashMap<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);

        policyCountMap.put(policy.getPolicyNumber(), policyCountMap.getOrDefault(policy.getPolicyNumber(), 0) + 1);
    }

    public void displayAllUniquePolicies() {
        System.out.println("All Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);
    }

    public void displayPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate deadline = today.plusDays(30);

        System.out.println("\nPolicies Expiring Within 30 Days:");
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(deadline)) {
                System.out.println(p);
            }
        }
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    public void displayDuplicatePolicies() {
        System.out.println("\nDuplicate Policies (by Policy Number):");
        policyCountMap.forEach((k, v) -> {
            if (v > 1) System.out.println("Policy Number: " + k + " | Count: " + v);
        });
    }

    public void comparePerformance() {
        int n = 10000;
        List<Policy> testPolicies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testPolicies.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Auto", 500 + i));
        }

        measureSetPerformance("HashSet", new HashSet<>(), testPolicies);
        measureSetPerformance("LinkedHashSet", new LinkedHashSet<>(), testPolicies);
        measureSetPerformance("TreeSet", new TreeSet<>(), testPolicies);
    }

    private void measureSetPerformance(String name, Set<Policy> set, List<Policy> data) {
        long startAdd = System.nanoTime();
        for (Policy p : data) set.add(p);
        long endAdd = System.nanoTime();

        long startSearch = System.nanoTime();
        set.contains(data.get(data.size() / 2));
        long endSearch = System.nanoTime();

        long startRemove = System.nanoTime();
        set.remove(data.get(data.size() / 2));
        long endRemove = System.nanoTime();

        System.out.println("\n" + name + " Performance:");
        System.out.println("Add Time: " + (endAdd - startAdd) / 1e6 + " ms");
        System.out.println("Search Time: " + (endSearch - startSearch) + " ns");
        System.out.println("Remove Time: " + (endRemove - startRemove) + " ns");
    }
}


public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 1200));
        manager.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 900));
        manager.addPolicy(new Policy("P103", "Charlie", LocalDate.now().plusDays(5), "Home", 1500));
        manager.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 1200)); // duplicate

        manager.displayAllUniquePolicies();
        manager.displayPoliciesExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.displayDuplicatePolicies();

        manager.comparePerformance();
    }
}
