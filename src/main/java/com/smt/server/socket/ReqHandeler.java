package com.smt.server.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

import com.siliconmtn.data.text.StringUtil;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import lombok.extern.log4j.Log4j2;

/****************************************************************************
 * <b>Title</b>: ReqHandler.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Chris Johnson
 * @version 1.0
 * @since Jul 14, 2021
 * @updates:
 ****************************************************************************/
@Log4j2
public class ReqHandeler{

	public ReqHandeler() {
		super();
	}
	

	public String handle(InputStreamReader inputStream) throws IOException {
		String reqParam = null;
		try (BufferedReader reader = new BufferedReader(inputStream);) {
			StringBuilder input = new StringBuilder(reader.readLine());
			StringTokenizer parser = new StringTokenizer(input.toString());
			String tok = "";
			while ( !StringUtil.isEmpty((tok = parser.nextToken())) )
				log.info("token = "+ tok);
			String method = parser.nextToken();
			String fileRequested = parser.nextToken();
			log.info("pre tokenization = " + input + "  method = "  + method + " file requested = " + fileRequested);
			if("GET".equals(method)) {
				reqParam = handleGet(method);
			} else if("POST".equals(method)){
				reqParam = handlePost(method);
			} 
			handleResponse(method);
		} catch (Exception e) {
			log.info("Exception e = " + e);
		}
		
		return "";
		
	}
	
	public String handleGet(String  get) {
		//String reUri = exchange.getRequestURI().toString();//.split("\\?")[1];
//		log.info("req uri Get= " + reUri);
//		return reUri.split("\\?")[1];
		return "";
	}
	
	
	public String handlePost(String post) {
	
		
		return "";
	}
	
	/**
	 * Send back response from file/uri
	 * @param exchange
	 * @return
	 */
	public String handleResponse(String res ) {
	;
		StringBuilder html = new StringBuilder();
		log.info("in handle response");
		
		
		return "";
	}
	
	

}
