# Daily-SocketServer-Kata

This Kata entails building a Web/App Server to handle HTTP Requests.  Instead of 
building unit tests, we will be evaluating this Kata on the following criteria:

---

<ul>
	<li>Ability to handle multiple concurrent requests</li>
	<li>Ability to properly return HTML, CSS, Java Script, images, etc ...</li>
	<li>Support of a default file if no file specified</li>
	<li>Configuration driven server (ports, Default Web Root, etc ..)</li>
	<li>Complete parsing of all Request Headers</li>
	<li>Response will include, at a minimum, the following headers </li>
	<ul>
		<li>Response Codes (200, 404, 500)</li>
		<li>Date and Time</li>
		<li>Content Type</li>
		<li>Content Length</li>
		<li>Language/Locale</li>
		<li>Cache Control</li>
		<li>Gzip Encoding of the content returned to the Server</li>
	</ul>
	<li>Complete Parsing of all Query String Parameters</li>
</ul>

---

The code for this kata should be abstracted for reusability and extensibility.  Please
take some time to design what you are going to build.  Adding all of the above features
will detract from performance.  You need to keep performance vs Design in mind.  You should
also pay attention to how to manage and handle the threads and how to efficiently 
utilize them.

### Files Included
All of the HTMl, CSS, JS and Images are located in the src/main/resources/WebRoot folder.  Any
additional files will be added to this folder.  This is the default folder for all of the
web accessible files.  You may change this folder, however, keep in mind that once you
package this up as a jar file (see the *Testing Your Server* section below) your paths 
need to continue to work on my machine.

# Testing your Server

Once you have finished coding your server, it needs to be exported into a runnable jar file.  
The gradle configuration will take care of this for you.  From the command line 
(from the root of your project) run the following command:

`./gradlew`

This will export a runnable jar file into the root/build/libs folder.  Send this file to 
me so your server can be tested.  To test locally, navigate to the libs folder and run the following command:

`java -jar SocketServer-Kata-0.0.1-SNAPSHOT.jar`

This is set to automatically run the main method in the com.smt.server.socket.SMTWebServer class

--------***********************************************--------
Noun- 
	Socket
		Server socket
		socket
	file
	directory
	connection
	response 
	request

verb-
	get file
 	connect
	listen
	respond


// Make Server
	// listen for request
	// parse request
	// return file
	// loop

 