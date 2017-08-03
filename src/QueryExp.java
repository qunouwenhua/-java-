import net.sf.json.JSONObject;

public class QueryExp {
	
	public static void main(String[] args) {  
		String  requestStr="{\"NO1\":[\"44\",\"55\",\"66\"],\"NO2\":{\"NO1\":\"第一个\"}}";  
        JSONObject jsonObject = JSONObject.fromObject(requestStr);   
        System.out.println(jsonObject.getString("NO1"));  
    }  
}
