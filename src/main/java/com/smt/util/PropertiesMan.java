package com.smt.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * propertiesMan
 */
public class PropertiesMan {

    private static final String PROPERTIES_LOCATION="src/main/resources/Config/app.properties";

    private Properties properties;
    private Map<String, String> vals;


    public PropertiesMan () {
        super();
        this.vals = new HashMap<>();
        properties = new Properties();
        getProps();
    }
    
    public Map<String, String> getProps() {
        try (FileInputStream fis = new FileInputStream(PROPERTIES_LOCATION)){
	        properties.load(fis);
            for(String key: properties.stringPropertyNames()){
                vals.put(key, properties.getProperty(key));
            }
            return vals;

	    } catch (Exception e){
            System.out.println("Exception E in prop ,amager - " + e);
        }
        return vals;
    }


    

}