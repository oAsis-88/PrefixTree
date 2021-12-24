import java.util.HashMap;
import java.util.Map;

class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    private boolean keyEndWorld;

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean isKeyEndWorld() {
        return keyEndWorld;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.keyEndWorld = endOfWord;
    }
}
