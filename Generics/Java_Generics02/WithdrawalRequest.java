package Java_Generics02;

import java.util.*;

class WithdrawalRequest {
    int accountNumber;
    double amount;

    WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

class BankingSystem {

    // AccountNumber -> Balance
    private HashMap<Integer, Double> accounts = new HashMap<>();

    // Balance -> List of AccountNumbers (to handle same balances)
    private TreeMap<Double, List<Integer>> balanceMap = new TreeMap<>();

    // Queue for withdrawals
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add new account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        balanceMap.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Request withdrawal
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    // Process withdrawals
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            double currentBalance = accounts.getOrDefault(request.accountNumber, -1.0);
            if (currentBalance == -1.0) {
                System.out.println("Account " + request.accountNumber + " does not exist.");
                continue;
            }
            if (currentBalance < request.amount) {
                System.out.println("Insufficient balance for Account " + request.accountNumber);
                continue;
            }

            // Update accounts map
            accounts.put(request.accountNumber, currentBalance - request.amount);

            // Update balanceMap (remove old balance)
            List<Integer> accList = balanceMap.get(currentBalance);
            accList.remove((Integer) request.accountNumber);
            if (accList.isEmpty()) balanceMap.remove(currentBalance);

            // Add updated balance
            double newBalance = currentBalance - request.amount;
            balanceMap.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(request.accountNumber);

            System.out.println("Processed withdrawal for Account " + request.accountNumber + ": Rs." + request.amount);
        }
    }

    // Show accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : balanceMap.entrySet()) {
            for (int acc : entry.getValue()) {
                System.out.println("Account " + acc + ": Rs." + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding some accounts
        bank.addAccount(1001, 5000);
        bank.addAccount(1002, 3000);
        bank.addAccount(1003, 7000);

        // Queue some withdrawals
        bank.requestWithdrawal(1002, 1000);
        bank.requestWithdrawal(1003, 7500); // should fail
        bank.requestWithdrawal(1001, 2500);

        // Process
        bank.processWithdrawals();

        // Display sorted balances
        bank.displayAccountsSortedByBalance();
    }
}
