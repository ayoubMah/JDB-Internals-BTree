public class BTree {
    BTreeNode root;
    int T;

    public BTree(int T){
        this.root = new BTreeNode(T, true);// why true, cuz initially root is leaf with 0 keys
    }

    /**
     * Logic described in: docs/level1.md
     */
    public BTreeNode search(BTreeNode node, int key){
        Integer[] keys = node.keys;
        BTreeNode[] children = node.children;
        for (int i = 0; i < node.n; i++){
            if (keys[i] >= key){
                if (i < node.n && keys[i]== key) return node;
                else if (node.isLeaf) return null;
                else return search(children[i], key);
            }
        }
        return null;
    }
}
