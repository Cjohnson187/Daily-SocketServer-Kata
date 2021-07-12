package data;

import java.io.File;

/****************************************************************************
 * <b>Title</b>: TrieNode.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> Trie Node class
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Chris Johnson
 * @version 1.0
 * @since Jul 12, 2021
 * @updates:
 ****************************************************************************/
public class TrieNode {
	
	private boolean isEndOfWord;
	private File file;
	private String test;
	private TrieNode[] children;
	
	// Alphabet size (# of symbols)
	static final int ALPHABET_SIZE = 26;
	
	/**
	 * New TrieNode construct
	 * @param dir
	 */
	public TrieNode(String dir) {
		super();
		this.children = new TrieNode[ALPHABET_SIZE];
		this.file = new File(dir);
		
		this.isEndOfWord = false;
        for (int i = 0; i < ALPHABET_SIZE; i++)
            children[i] = null;
	}
	/**
	 * test constructor
	 * @param isTest
	 * @param dir
	 */
	public TrieNode(boolean isTest, String dir) {
		super();
		this.test = dir;
		
		isEndOfWord = false;
        for (int i = 0; i < ALPHABET_SIZE; i++)
            children[i] = null;
	}

	public boolean isEndOfWord() {
		return isEndOfWord;
	}

	public void setEndOfWord(boolean isEndOfWord) {
		this.isEndOfWord = isEndOfWord;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public TrieNode[] getChildren() {
		return children;
	}
	public TrieNode getChild(int i) {
		return children[i];
	}

	public void setChildren(TrieNode[] children) {
		this.children = children;
	}
	
	public void setChild(int i, TrieNode node) {
		this.children[i] = node;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	
	
	

}
