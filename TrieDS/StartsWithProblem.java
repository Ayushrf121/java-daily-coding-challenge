public class StartsWithProblem{
    public static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curNode = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curNode.children[idx]==null){
                curNode.children[idx] = new Node();
            }
            curNode = curNode.children[idx];
        }
        curNode.eow = true;
        return;
    }
    public static boolean startsWith(String prefix){
        Node currNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(currNode.children[idx] == null){
                return false;
            }
            currNode = currNode.children[idx];
        }
        return true;
    }
    public static void main(String[] args){
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "apple";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}