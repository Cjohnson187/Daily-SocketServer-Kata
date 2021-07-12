package data;


/****************************************************************************
 * <b>Title</b>: Trie.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> Trie class
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Chris Johnson
 * @version 1.0
 * @since Jul 12, 2021
 * @updates:
 ****************************************************************************/
//Java implementation of search and insert operations
//on Trie
public class Trie {
	
	private TrieNode root;
	private final int ALPHABET_SIZE = 26;
	
	public Trie() {
		super();
		this.root = new TrieNode("/");
	}
	
	
	public void insert(String key) {
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = this.root;
      
        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            
            if (pCrawl.getChild(index) == null)
                pCrawl.setChild(index,  new TrieNode(""));
      
            pCrawl = pCrawl.getChild(index);
        }
      
        // mark last node as leaf
        pCrawl.setEndOfWord(true);
    }
      
	 // Returns true if key presents in trie, else false
    public String search(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = this.root;
      
        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.getChild(index) == null)
                return pCrawl.getTest();
      
            pCrawl = pCrawl.getChild(index);
        }
      
        return (pCrawl.getTest());
    }
 }
