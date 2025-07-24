package Java_Generics02;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCountMap;           // Candidate -> Votes (HashMap)
    private LinkedHashMap<Integer, String> voteOrderMap; // Vote# -> Candidate (to maintain order of voting)
    private int voteNumber;

    public VotingSystem() {
        voteCountMap = new HashMap<>();
        voteOrderMap = new LinkedHashMap<>();
        voteNumber = 1;
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(voteNumber++, candidate);
        System.out.println("Vote casted for: " + candidate);
    }

    // Show vote count in order of voting (LinkedHashMap)
    public void displayVoteOrder() {
        System.out.println("\n🗳️ Vote Order:");
        for (Map.Entry<Integer, String> entry : voteOrderMap.entrySet()) {
            System.out.println("Vote #" + entry.getKey() + " → " + entry.getValue());
        }
    }

    // Show results sorted by candidate name (TreeMap)
    public void displaySortedResults() {
        System.out.println("\n📊 Voting Results (Sorted by Candidate Name):");
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteCountMap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vote(s)");
        }
    }

    // Show raw HashMap (unsorted, just for checking)
    public void displayRawHashMap() {
        System.out.println("\n Raw HashMap (Candidate → Votes):");
        System.out.println(voteCountMap);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");

        votingSystem.displayVoteOrder();
        votingSystem.displaySortedResults();
        votingSystem.displayRawHashMap();
    }
}
