package json.model;

import java.util.Date;

public class Transaction
{
    private String hash;

    public String getHash() { return this.hash; }

    public void setHash(String hash) { this.hash = hash; }

    private int ledger_index;

    public int getLedgerIndex() { return this.ledger_index; }

    public void setLedgerIndex(int ledger_index) { this.ledger_index = ledger_index; }

    private Date date;

    public Date getDate() { return this.date; }

    public void setDate(Date date) { this.date = date; }

    private Tx tx;

    public Tx getTx() { return this.tx; }

    public void setTx(Tx tx) { this.tx = tx; }

    private Meta meta;

    public Meta getMeta() { return this.meta; }

    public void setMeta(Meta meta) { this.meta = meta; }
}

