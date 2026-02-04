public class BTreeNode {
    Integer [] keys;
    BTreeNode [] children;
    boolean isLeaf;
    int n; // number of keys in the node

    public BTreeNode(int T, boolean isLeaf){ // T is the Minimum degree
        this.keys = new Integer [2*T - 1]; // every node can have at most 2*T - 1 keys
        this.children = new BTreeNode[2*T]; // a node can have at most 2*T children
        this.isLeaf = isLeaf;
        this.n = 0;
    }

}
