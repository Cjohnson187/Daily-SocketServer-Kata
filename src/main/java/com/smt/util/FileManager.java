package com.smt.util;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
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
	private Map<String, File> map;
	String ROOT = "src/main/resources/";
	String fileDir;
	
	public static void main(String[] args) {
		FileManager man = new FileManager();
		for (Entry<String,File> f : man.map.entrySet()) {
			System.out.println("dir = " + f.getKey() + " | is file? " + f.getValue().isFile()  );
		}
	}
	
	public FileManager() {
		super();
		props = new PropertiesMan();
		this.fileDir = props.getProps().get("fileRoot");
		this.map = new TreeMap();
		File webRoot = new File(this.fileDir);
		build(webRoot);
	}
	
	public void build(File file) {
		//map.put(root, root);
		//System.out.println("file? = " + file.isDirectory() +   " | " + file.getAbsolutePath());
		if(file.isDirectory()) {
			
			for(File child: file.listFiles() ) {
				build(child);
			}
		} 
		else if(file.isFile()) {
			map.put(file.getPath(), file);
			//System.out.println("is file ! " + file.isFile());
		}
		
		
		
		
	}
	

	
	
	
	
}
