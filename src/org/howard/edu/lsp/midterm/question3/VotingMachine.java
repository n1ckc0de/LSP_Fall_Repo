import java.util.HashMap;

public class VotingMachine {
    private HashMap<String, Integer> candidates;

    // Constructor to initialize the candidates map
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Method to add a candidate
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initialize votes to 0
        }
    }

    // Method to cast a vote for a candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment the vote count
        }
    }

    // Method to print out the number of votes each candidate has received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Voting Results:\n");
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}
