package Java_LinkedList;

import java.util.*;

public class SocialMediaLinkedList {

    static class UserNode {
        int userId;
        String name;
        int age;
        ArrayList<Integer> friendIds;
        UserNode next;

        public UserNode(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
            this.next = null;
        }
    }

    private UserNode head = null;

    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null || userId1 == userId2) {
            System.out.println("Invalid user IDs.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
        if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);

        System.out.println("Friend connection added between " + userId1 + " and " + userId2);
    }

    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid user IDs.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between " + userId1 + " and " + userId2);
    }

    public void displayAllFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + " (ID: " + user.userId + "):");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends yet.");
            return;
        }

        for (int fid : user.friendIds) {
            UserNode friend = findUserById(fid);
            if (friend != null)
                System.out.println("→ ID: " + friend.userId + ", Name: " + friend.name + ", Age: " + friend.age);
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid user IDs.");
            return;
        }

        Set<Integer> mutual = new HashSet<>(user1.friendIds);
        mutual.retainAll(user2.friendIds);

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");

        if (mutual.isEmpty()) {
            System.out.println("No mutual friends.");
            return;
        }

        for (int fid : mutual) {
            UserNode friend = findUserById(fid);
            if (friend != null)
                System.out.println("→ ID: " + friend.userId + ", Name: " + friend.name);
        }
    }

    public void searchUserById(int userId) {
        UserNode user = findUserById(userId);
        if (user != null) {
            System.out.println("Found: ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
        } else {
            System.out.println("User not found.");
        }
    }

    public void searchUserByName(String name) {
        UserNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No user found with name: " + name);
    }

    public void countFriendsForEachUser() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + " (ID: " + temp.userId + ") has " + temp.friendIds.size() + " friend(s).");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
    	SocialMediaLinkedList snm = new SocialMediaLinkedList();

        snm.addUser(1, "Alice", 22);
        snm.addUser(2, "Bob", 24);
        snm.addUser(3, "Charlie", 21);
        snm.addUser(4, "Daisy", 25);

        snm.addFriendConnection(1, 2);
        snm.addFriendConnection(1, 3);
        snm.addFriendConnection(2, 3);
        snm.addFriendConnection(3, 4);

        snm.displayAllFriends(1);
        snm.displayAllFriends(3);

        snm.findMutualFriends(1, 3);

        snm.searchUserById(2);
        snm.searchUserByName("Daisy");

        snm.removeFriendConnection(1, 2);
        snm.displayAllFriends(1);

        snm.countFriendsForEachUser();
    }
}

