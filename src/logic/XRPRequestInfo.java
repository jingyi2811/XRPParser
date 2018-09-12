package logic;

public class XRPRequestInfo {

    private String accountName;
    private String limit;
    private String url = "https://data.ripple.com/v2";
    private String methodName1 = "accounts";

    public XRPRequestInfo(String accountName){
        this.accountName = accountName;
        this.limit = null;
    }
    public XRPRequestInfo(String accountName, String limit){
        this.accountName = accountName;
        this.limit = limit;
    }

    public String getUrl(){
        return getUrlHeader() + getUrlFooter();
    }

    private String getUrlHeader(){
        return url + "/" + methodName1 + "/"  + accountName + "/" + "transactions" + "?";
    }

    private String getUrlFooter(){
        if(limit == null){
            return "type=Payment&result=tesSUCCESS";
        } else {
            return "type=Payment&result=tesSUCCESS&limit=" + limit;
        }
    }
}