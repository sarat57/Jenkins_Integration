package Webservices;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONObject;

public class HttpClientservices {

    public static void main(String[] args) throws ClientProtocolException, IOException   {
       
    	HttpClientservices services =new HttpClientservices();
    			
    	services.getCall();
    }
    
    
    public void getCall() throws ClientProtocolException, IOException
    {
    	 DefaultHttpClient httpClient = new DefaultHttpClient();
     	HttpGet getRequest = new HttpGet("http://dummy.restapiexample.com/api/v1/employees");
         getRequest.addHeader("accept", "application/xml");
         HttpResponse response = httpClient.execute(getRequest);
        System.out.println(response.getStatusLine().getStatusCode());
         HttpEntity httpEntity = response.getEntity();
         String apiOutput = EntityUtils.toString(httpEntity);
         System.out.println(apiOutput);
        String value = JsonPath.read(apiOutput, "$.data[0].employee_name").toString();
        System.out.println(value);
         
    }
    
    public void postCall() throws ClientProtocolException, IOException
    {
    	 DefaultHttpClient httpClient = new DefaultHttpClient();
     	HttpPost postRequest = new HttpPost("http://dummy.restapiexample.com/api/v1/create");
     	StringEntity parms = new StringEntity("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}");
     	postRequest.addHeader("accept", "application/json");
     	postRequest.addHeader("Content-Type", "application/json");
     	postRequest.setEntity(parms);
        HttpResponse response = httpClient.execute(postRequest);
        System.out.println(response.getStatusLine().getStatusCode());
         HttpEntity httpEntity = response.getEntity();
         String apiOutput = EntityUtils.toString(httpEntity);
         System.out.println(apiOutput);
    }
    
    public void deleteCall() throws ClientProtocolException, IOException
    {
    	DefaultHttpClient httpClient = new DefaultHttpClient();
     	HttpDelete getRequest = new HttpDelete("http://dummy.restapiexample.com/api/v1/delete/20");
         getRequest.addHeader("accept", "application/xml");
         HttpResponse response = httpClient.execute(getRequest);
        System.out.println(response.getStatusLine().getStatusCode());
         HttpEntity httpEntity = response.getEntity();
         String apiOutput = EntityUtils.toString(httpEntity);
         System.out.println(apiOutput);
    }
   
    public void soapservice() throws UnsupportedOperationException, SOAPException, IOException
    {
    	
    	SOAPConnectionFactory soapConnectionFactory =  SOAPConnectionFactory.newInstance();
    	SOAPConnection connection = soapConnectionFactory.createConnection();
    	java.net.URL endpoint = new URL("");
    	InputStream is =FileUtils.openInputStream(new File(""));
    	SOAPMessage message = MessageFactory.newInstance().createMessage(null, is);
    	SOAPMessage response = connection.call(message, endpoint);
    	System.out.println(response.toString());	
    }
}