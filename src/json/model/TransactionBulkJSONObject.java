package json.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TransactionBulkJSONObject {

    private Object hash;
    private Object date;
    private JSONObject transactionJSONObject;

    public Object getHash() {
        return hash;
    }

    public void setHash(Object hash) {
        this.hash = hash;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public JSONObject getTransactionJSONObject() {
        return transactionJSONObject;
    }

    public void setTransactionJSONObject(JSONObject transactionJSONObject) {
        this.transactionJSONObject = transactionJSONObject;
    }
}