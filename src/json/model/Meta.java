package json.model;

import java.util.ArrayList;

public class Meta
{
    private int TransactionIndex;

    public int getTransactionIndex() { return this.TransactionIndex; }

    public void setTransactionIndex(int TransactionIndex) { this.TransactionIndex = TransactionIndex; }

    private ArrayList<AffectedNode> AffectedNodes;

    public ArrayList<AffectedNode> getAffectedNodes() { return this.AffectedNodes; }

    public void setAffectedNodes(ArrayList<AffectedNode> AffectedNodes) { this.AffectedNodes = AffectedNodes; }

    private String TransactionResult;

    public String getTransactionResult() { return this.TransactionResult; }

    public void setTransactionResult(String TransactionResult) { this.TransactionResult = TransactionResult; }

    private String delivered_amount;

    public String getDeliveredAmount() { return this.delivered_amount; }

    public void setDeliveredAmount(String delivered_amount) { this.delivered_amount = delivered_amount; }
}
