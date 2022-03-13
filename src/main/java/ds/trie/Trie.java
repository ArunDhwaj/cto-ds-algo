package ds.trie;

public class Trie
{
    TrieNode root, tempNode;

    public Trie()
    {
        root = new TrieNode();
    }

    public void insert(String word)
    {
        tempNode = root;

        for(char c : word.toCharArray())
        {
            if(tempNode.children[c-'a'] == null)
            {
                tempNode.children[c-'a'] = new TrieNode();
            }
            tempNode = tempNode.children[c-'a'];
        }
        tempNode.isEndOfWord = true;

    }

    public boolean search(String word)
    {
        return isMatch(word, root, 0, true);
    }

    private boolean isMatch( String s, TrieNode node, int index, boolean isFullMatch )
    {
        if (node == null)
            return false;

        if (index == s.length())
            return !isFullMatch || node.isEndOfWord;

        return isMatch(s, node.children[s.charAt(index) - 'a'], index + 1, isFullMatch);
    }

    public boolean startsWith(String prefix)
    {
        return isMatch(prefix, root, 0, false);
    }

}
