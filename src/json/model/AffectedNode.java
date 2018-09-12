package json.model;

public class AffectedNode
{
    private ModifiedNode ModifiedNode;

    public ModifiedNode getModifiedNode() { return this.ModifiedNode; }

    public void setModifiedNode(ModifiedNode ModifiedNode) { this.ModifiedNode = ModifiedNode; }

    private CreatedNode CreatedNode;

    public CreatedNode getCreatedNode() { return this.CreatedNode; }

    public void setCreatedNode(CreatedNode CreatedNode) { this.CreatedNode = CreatedNode; }
}
