package json.model;

public class ModifiedNode
{
    private String LedgerEntryType;

    public String getLedgerEntryType() { return this.LedgerEntryType; }

    public void setLedgerEntryType(String LedgerEntryType) { this.LedgerEntryType = LedgerEntryType; }

    private int PreviousTxnLgrSeq;

    public int getPreviousTxnLgrSeq() { return this.PreviousTxnLgrSeq; }

    public void setPreviousTxnLgrSeq(int PreviousTxnLgrSeq) { this.PreviousTxnLgrSeq = PreviousTxnLgrSeq; }

    private String PreviousTxnID;

    public String getPreviousTxnID() { return this.PreviousTxnID; }

    public void setPreviousTxnID(String PreviousTxnID) { this.PreviousTxnID = PreviousTxnID; }

    private String LedgerIndex;

    public String getLedgerIndex() { return this.LedgerIndex; }

    public void setLedgerIndex(String LedgerIndex) { this.LedgerIndex = LedgerIndex; }

    private PreviousFields PreviousFields;

    public PreviousFields getPreviousFields() { return this.PreviousFields; }

    public void setPreviousFields(PreviousFields PreviousFields) { this.PreviousFields = PreviousFields; }

    private FinalFields FinalFields;

    public FinalFields getFinalFields() { return this.FinalFields; }

    public void setFinalFields(FinalFields FinalFields) { this.FinalFields = FinalFields; }
}
