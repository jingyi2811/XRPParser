package json.model;

public class CreatedNode
{
    private String LedgerEntryType;

    public String getLedgerEntryType() { return this.LedgerEntryType; }

    public void setLedgerEntryType(String LedgerEntryType) { this.LedgerEntryType = LedgerEntryType; }

    private String LedgerIndex;

    public String getLedgerIndex() { return this.LedgerIndex; }

    public void setLedgerIndex(String LedgerIndex) { this.LedgerIndex = LedgerIndex; }

    private NewFields NewFields;

    public NewFields getNewFields() { return this.NewFields; }

    public void setNewFields(NewFields NewFields) { this.NewFields = NewFields; }
}
