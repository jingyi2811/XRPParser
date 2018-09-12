package logic;

import json.model.Transaction;
import json.model.TransactionBulkJSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class XRPJSONObjectTransactions {

    JSONArray arr;

    public XRPJSONObjectTransactions(JSONArray arr){
        this.arr = arr;
    }
    public ArrayList<TransactionBulkJSONObject> getTransactions() throws Exception{

        ArrayList<TransactionBulkJSONObject> transactionDateList = new ArrayList<>();

        for(int i=0; i < arr.size(); i++){

            JSONObject rootObject = (JSONObject)arr.get(i);

            Object hash = rootObject.get("hash");
            Object date = rootObject.get("date");
            JSONObject transaction = (JSONObject) rootObject.get("tx");

            TransactionBulkJSONObject transactionBulkJSONObject = new TransactionBulkJSONObject();

            transactionBulkJSONObject.setHash(hash);
            transactionBulkJSONObject.setDate(date);
            transactionBulkJSONObject.setTransactionJSONObject(transaction);

            transactionDateList.add(transactionBulkJSONObject);
        }

        return transactionDateList;
    }
}
