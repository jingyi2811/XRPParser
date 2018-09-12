package logic;

import json.model.TransactionBulkJSONObject;
import json.model.Tx;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class XRPJSONObjectOutput {

    public static ArrayList<Tx> convert(ArrayList<TransactionBulkJSONObject> transactionDateJSONObjectList){

        ArrayList<Tx> txList = new ArrayList<>();

        for (int i = 0; i < transactionDateJSONObjectList.size(); i++) {

            TransactionBulkJSONObject transactionBulkJSONObject = transactionDateJSONObjectList.get(i);

            Object hash = transactionBulkJSONObject.getHash();
            Object dateObj = transactionBulkJSONObject.getDate();
            JSONObject transactionJSONObject = transactionBulkJSONObject.getTransactionJSONObject();

            Tx tx = new Tx();

            tx.setHash((String) hash);
            tx.setDate((String) dateObj);

            String transactionType = (String) transactionJSONObject.get("TransactionType");
            String amount = (String) transactionJSONObject.get("Amount");
            String account = (String) transactionJSONObject.get("Account");
            String destination = (String) transactionJSONObject.get("Destination");

            tx.setTransactionType(transactionType);
            tx.setAmount(amount);
            tx.setAccount(account);
            tx.setDestination(destination);

            txList.add(tx);
        }

        return txList;
    }
}
