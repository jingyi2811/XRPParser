package json.model;

import java.util.ArrayList;

public class RootObject
{
    private String result;

    public String getResult() { return this.result; }

    public void setResult(String result) { this.result = result; }

    private int count;

    public int getCount() { return this.count; }

    public void setCount(int count) { this.count = count; }

    private String marker;

    public String getMarker() { return this.marker; }

    public void setMarker(String marker) { this.marker = marker; }

    private ArrayList<Transaction> transactions;

    public ArrayList<Transaction> getTransactions() { return this.transactions; }

    public void setTransactions(ArrayList<Transaction> transactions) { this.transactions = transactions; }
}
