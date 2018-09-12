package logic;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class XRPJSONObjectAll {

    private String urlStr;

    public XRPJSONObjectAll(String urlStr){
        this.urlStr = urlStr;
        System.out.println("API url = " + urlStr);
    }

    public JSONObject getJSONObject() throws Exception{

        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();

        String jsonStr = "";

        if(responseCode >= 200 && responseCode <300){

            Scanner sc = new Scanner(url.openStream());

            while(sc.hasNext()){
                jsonStr += sc.nextLine();
            }

            sc.close();

        } else {
            throw new Exception(" Invalid Response = " + responseCode);
        }

        JSONParser parse = new JSONParser();
        return (JSONObject)parse.parse(jsonStr);
    }

}
