package com.smt.server.socket;

import java.util.Map;

import com.smt.util.PropertiesMan;

// Lombok 1.x
import lombok.extern.log4j.Log4j2;

/****************************************************************************
 * <b>Title</b>: SMTWebServer.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> Socket Server Kata
 * This class is the main entry point into your server
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
@Log4j2
public class SMTWebServer {
	/**
	 * Kicks off the threaded server
	 * @param args
	 */
	public static void main(String[] args) {
		//log.info("Do Something Here");
		System.out.println("starting");
		PropertiesMan propMan = new PropertiesMan();
		Map<String, String> props = propMan.getProps();
		for (var val: props.entrySet() ) {
			System.out.println("val = " + val.getKey() + " , " + val.getValue() );
		}
	}
}
