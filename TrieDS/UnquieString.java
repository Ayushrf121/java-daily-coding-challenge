public class UnquieString {
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
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ababa"; // ans = 10
        // suffix -> insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
