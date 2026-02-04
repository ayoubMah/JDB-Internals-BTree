public class BTreeNode {
    private Integer [] keys;
    private BTreeNode [] children;
    private boolean isLeaf;
    private int n; // number of keys in the node

    public BTreeNode(int T, boolean isLeaf){ // T is the Minimum degree
        this.keys = new Integer [2*T - 1]; // every node can have at most 2*T - 1 keys
        this.children = new BTreeNode[2*T]; // a node can have at most 2*T children
        this.isLeaf = isLeaf;
        this.n = 0;
    }

    public Integer[] getKeys() {
        return keys;
    }

    public void setKeys(Integer[] keys) {
        this.keys = keys;
    }

    public BTreeNode[] getChildren() {
        return children;
    }

    public void setChildren(BTreeNode[] children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
