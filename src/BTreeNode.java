import java.util.List;

public class BTreeNode {
    private List<Integer> keys;
    private List<BTreeNode> children;
    private boolean isLeaf;
    private int n; // number of keys in the node
}
