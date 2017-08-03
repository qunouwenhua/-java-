package test;

import net.sf.json.JSONObject;

public class QueryExp {
	
	public static void main(String[] args) throws Exception {  
		String  requestStr="{\"access_token\":\"MoSu_b2aV8-iYau52meGQEZfYVfrOH5ejeEyRRzUu2YHKw94RKK3QeCLcZGXTTqJ\",\"expires_in\":7200}";  
        JSONObject jsonObject = JSONObject.fromObject(requestStr);   
        System.out.println(jsonObject.getString("access_token"));  
    }  
	
}
