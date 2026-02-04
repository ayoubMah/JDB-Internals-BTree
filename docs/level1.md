## Instructions for Level 1

Your task is to set up the basic Java classes. We want to be able to **search** the tree, even if it only has one node for now.

---

### 1. Create a class `BTreeNode`

It should include:

- An array (or `List`) of `Integer` keys
- An array (or `List`) of `BTreeNode` children
- A boolean flag `isLeaf` to distinguish node types
- A variable `n` to track how many keys are currently in the node

---

### 2. Create a class `BTree`

This class should:

- Hold the root node
- Store the degree `T` (used to define the minimum degree of the B-tree)

---

### 3. Implement the `search(BTreeNode node, int key)` method

The search logic should follow these steps:

1. Inside a node, find the first key **≥** the search key
2. If the key is found, return the node
3. If the key is not found and the node is a leaf, the key is not in the tree
4. If the key is not found and the node is an internal node, descend into the appropriate child and repeat the process

---

> Goal of Level 1:  
> Build the **skeleton** of a B-tree and make sure searching works correctly before moving on to insertion and splitting.
