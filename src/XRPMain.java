import db.Connector;
import db.Sqlparser;
import json.model.TransactionBulkJSONObject;
import json.model.Tx;
import logic.XRPJSONObjectOutput;
import logic.XRPJSONObjectTransactions;
import logic.XRPRequestInfo;
import logic.XRPJSONObjectAll;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class XRPMain {

    public static void main(String argv[]) throws Exception{

        Connector connector = null;

        // Change these api variables.
        String accountOrDestination = "rJAhpN3SMztnaA8vddZC1RPJkcCt55uDgS";
        //String limit = "2";

        // Change these db variables.
        String databaseURL = "jdbc:mysql://localhost:3306/clr2u_trade_vcoin";
        String user = "root";
        String password = "admin";

        //accounts/rJAhpN3SMztnaA8vddZC1RPJkcCt55uDgS/transactions?type=Payment&result=tesSUCCESS&limit=1
        XRPRequestInfo info = new XRPRequestInfo(accountOrDestination);
        XRPJSONObjectAll jsonObject = new XRPJSONObjectAll(info.getUrl());

        JSONArray transactionsArray = (JSONArray) jsonObject.getJSONObject().get("transactions");
        XRPJSONObjectTransactions xrpjsonObjectTransactions = new XRPJSONObjectTransactions(transactionsArray);

        ArrayList<TransactionBulkJSONObject> transactionDateJSONObjectList = xrpjsonObjectTransactions.getTransactions();
        ArrayList<Tx> txList = XRPJSONObjectOutput.convert(transactionDateJSONObjectList);

//        System.out.println("Total transaction =" + txList.size());
        connector = new Connector(databaseURL, user, password);

            try {

                for (int i = 0; i < txList.size(); i++) {

                    connector.createStatement();

                    Tx tx = txList.get(i);

                    String[] parameter = {tx.getDate(), tx.getHash(), tx.getTransactionType(), tx.getAmount(), tx.getAccount(), tx.getDestination()};
                    String sql = Sqlparser.getSqlString("blockchain", parameter);

                    connector.exceuteUpdate(sql);

                    System.out.println(" insert record no = " + i);

                }

            } catch (Exception e){
                e.printStackTrace();
            } finally {
                connector.close();
            }
    }
}