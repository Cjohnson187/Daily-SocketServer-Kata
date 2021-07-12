package com.smt.util;

import java.io.File;
import java.util.TreeMap;

import data.Trie;
import data.TrieNode;
import lombok.Data;

/****************************************************************************
 * <b>Title</b>: FileManager.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Chris Johnson
 * @version 1.0
 * @since Jul 12, 2021
 * @updates:
 ****************************************************************************/
public @Data class FileManager {
	//private 
	private Trie trie;
	private TrieNode root; 
	
	// actual vals
	private PropertiesMan props;
	private TreeMap map;
	String ROOT = "/Daily-SocketServer-Kata/src/main/resources";
	String fileDir;
	
	public FileManager() {
		super();
		props = new PropertiesMan();
		this.fileDir =  ROOT + props.getProps().get("WEB_ROOT");
		this.map = new TreeMap();
		File webRoot = new File(this.fileDir);
		build(webRoot);
	}
	
	public void build(File root) {
		//map.put(root, root);
		File webRoot = new File(this.fileDir);
		for(File f: webRoot.listFiles()) {
			System.out.println("list files = "  + f.getAbsolutePath());
			if( f.listFiles().length > 0)  {
				//build();
			}
		}
	}
	

	
	
	
	
}
