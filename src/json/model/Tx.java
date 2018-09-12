package json.model;

import java.util.Date;

public class Tx
{
    private String TransactionType;

    public String getTransactionType() { return this.TransactionType; }

    public void setTransactionType(String TransactionType) { this.TransactionType = TransactionType; }

    private long Flags;

    public long getFlags() { return this.Flags; }

    public void setFlags(long Flags) { this.Flags = Flags; }

    private int Sequence;

    public int getSequence() { return this.Sequence; }

    public void setSequence(int Sequence) { this.Sequence = Sequence; }

    private int LastLedgerSequence;

    public int getLastLedgerSequence() { return this.LastLedgerSequence; }

    public void setLastLedgerSequence(int LastLedgerSequence) { this.LastLedgerSequence = LastLedgerSequence; }

    private String Amount;

    public String getAmount() { return this.Amount; }

    public void setAmount(String Amount) { this.Amount = Amount; }

    private String Fee;

    public String getFee() { return this.Fee; }

    public void setFee(String Fee) { this.Fee = Fee; }

    private String SigningPubKey;

    public String getSigningPubKey() { return this.SigningPubKey; }

    public void setSigningPubKey(String SigningPubKey) { this.SigningPubKey = SigningPubKey; }

    private String TxnSignature;

    public String getTxnSignature() { return this.TxnSignature; }

    public void setTxnSignature(String TxnSignature) { this.TxnSignature = TxnSignature; }

    private String Account;

    public String getAccount() { return this.Account; }

    public void setAccount(String Account) { this.Account = Account; }

    private String Destination;

    public String getDestination() { return this.Destination; }

    public void setDestination(String Destination) { this.Destination = Destination; }

    private String date;

    public String getDate() { return this.date; }

    public void setDate(String date) { this.date = date; }

    private String hash;

    public String getHash() { return this.hash; }

    public void setHash(String hash) { this.hash = hash; }


}
