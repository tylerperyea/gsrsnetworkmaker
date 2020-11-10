package gov.hhs.fda.ohi.gsrsnetworkmaker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

import com.jayway.jsonpath.JsonPath;

public class NetworkMaker 
{
    public static void main(String[] args) throws Exception{
    	
    	//You can hardcode this to be a file path if you'd like
    	String gsrsDumpFileName = args[0];
    	
    	try(InputStream fis=new FileInputStream(new File(gsrsDumpFileName))){
			 try(InputStream in = new GZIPInputStream(fis)) {
				 new BufferedReader(new InputStreamReader(in,
				          StandardCharsets.UTF_8)).lines()
				 .forEach(p->{
					 String json1=p.split("\t")[2];
					 String uuid=JsonPath.read(json1,"$.uuid");
					 String unii=JsonPath.read(json1,"$.approvalID");
					 String displayName=JsonPath.read(json1,"$.names[?(@.displayName)].name");
					 
					 //TODO: get relationships from JSON, do other things
					 // etc
					 
				 });
			 }
		}
    }
}
