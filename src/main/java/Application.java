public class Application {
    public static void main(String[] args){

        Trie trie = new Trie();
        trie.insert("A");
        trie.insert("to");
        trie.insert("tea");
        trie.insert("ted");
        trie.insert("ten");
        trie.insert("i");
        trie.insert("in");
        trie.insert("inn");

        System.out.println("as - " + trie.contains("as"));
        System.out.println("in - " + trie.contains("in"));
        trie.remove("in");
        System.out.println("in - " + trie.contains("in"));
        System.out.println("inn - " + trie.contains("inn"));
        System.out.println("te - " + trie.contains("te"));
    }
}
