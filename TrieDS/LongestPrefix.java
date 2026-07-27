public class LongestPrefix {
    public static class Node {
        Node []children = new Node[26];
        boolean eow = false;

    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static String ans = ""; 
    public static void searchLargestPrefixString(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch = (char)('a'+i);
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                searchLargestPrefixString(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        return;
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        searchLargestPrefixString(root,new StringBuilder(""));
        System.out.println(ans);
    }
}
