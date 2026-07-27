// Prefix Problem
// Find shortest unique prefix for every word in a given list.
// Assume no word is prefix of another.

// arr[ ] = {"zebra", "dog", "duck", "dove"}
// ans = {"z", "dog", "du", "dov")

// eVery word in a eiven list.

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    static class Node {
        Node[] children = new Node[26];
        int freq;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            this.freq = 1;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
    }

    public static String findPrefix(String word) {
        StringBuilder prefix = new StringBuilder();
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            prefix.append(word.charAt(level));
            curr = curr.children[idx];
            if (curr.freq == 1) {
                return prefix.toString();
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        List<String> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            li.add(findPrefix(arr[i]));
        }
        System.out.println(li);
    }
}
