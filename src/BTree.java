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
        Integer[] keys = node.getKeys();
        BTreeNode[] children = node.getChildren();
        for (int i = 0; i < node.getN(); i++){
            if (keys[i] == key){
                return node;
            } else if (!node.isLeaf()) {
                if (keys[i] > key){
                    return search(children[i], key);
                } else if (key>= keys[i]) {
                    return search(children[i+1], key);
                }
            }else {
                //System.out.println("no don't found it :)");
                return null;
            }
        }
        return null;
    }
}
