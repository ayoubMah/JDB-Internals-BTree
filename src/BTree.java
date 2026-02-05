public class BTree {
    BTreeNode root;
    int T;

    public BTree(int T) {
        this.root = new BTreeNode(T, true);// why true, cuz initially root is leaf with 0 keys
    }

    /**
     * Logic described in: docs/level1.md
     */
    public BTreeNode search(BTreeNode node, int key) {
        Integer[] keys = node.keys;
        BTreeNode[] children = node.children;
        int i = 0;
        for (int j = 0; j < node.n; j++) {
            if (keys[i] >= key) break;
            i++;
        }
        if (i < node.n && keys[i] == key) return node;
        else if (node.isLeaf) return null;
        else return search(children[i], key);
    }
}
