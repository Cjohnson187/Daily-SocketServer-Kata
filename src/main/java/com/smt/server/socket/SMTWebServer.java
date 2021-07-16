package com.smt.server.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.smt.util.PropertiesMan;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;


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
public class SMTWebServer implements Runnable{
	//vars
	private final PropertiesMan propMan = new PropertiesMan();
	private final Map<String, String> props = propMan.getProps();
	private Socket socket;
	
	/**
	 * constructor
	 * @param socket
	 */
	public SMTWebServer(Socket socket) {
		this.socket = socket;
	}
	
	
	/**
	 * Kicks off the threaded server
	 * @param args
	 */
	
	public static void main(String[] args) {
		log.info("Starting SMT HTTP Kata Server.");
		
		log.info("Server started on port 8080");
		while (true) {
			try (ServerSocket serverSocket = new ServerSocket(8080);){
				SMTWebServer server = new SMTWebServer(serverSocket.accept());
				
				// create thread but need fixed size thread pool
				
				Executor ex = Executors.newFixedThreadPool(4);
				ex.execute(server);
				
				
			} catch (IOException e) {
				log.info("Exception e = " + e);
				e.printStackTrace();
			}
		}
		
	}

	
	@Override
	public void run() {
		try {
			// rad input
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			
			ReqHandeler handeler = new ReqHandeler();
			handeler.handle(in);
			//BufferedReader reader = new BufferedReader(in);
			
			// headers
//			PrintWriter out = new PrintWriter(socket.getOutputStream());
			// request
//			BufferedOutputStream dataOut = new BufferedOutputStream(socket.getOutputStream());
//			String input = reader.readLine();
//			
//			
//			StringTokenizer parser = new StringTokenizer(input);
//			String method = parser.nextToken();
//			String fileRequested = parser.nextToken();
//			log.info("pre tokenization = " + input + "  method = "  + method + " file requested = " + fileRequested);
//			
					
		} catch (IOException e) {
			log.info("Exception e = " + e);
			e.printStackTrace();
		}
		   
		
	}
	
	
}
