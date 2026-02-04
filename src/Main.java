public class Main {
    public static void main(String[] args) {
        // create a B-Tree with T = 3
        BTree tree = new BTree(3);

        // MANUALLY simulate an insertion into the root for testing search
        // In Level 2, this will be handled by tree.insert(10)
        tree.root.getKeys()[0] = 10;
        tree.root.getKeys()[1] = 20;
        tree.root.getKeys()[2] = 30;
        tree.root.setN(3);

        // Test the search logic
        int[] testKeys = {10, 25, 30, 100};

        for (int k : testKeys) {
            if (tree.search(tree.root, k) != null) {
                System.out.println("Key " + k + " found!");
            } else {
                System.out.println("Key " + k + " NOT found.");
            }
        }
    }
}