# B-Tree
I'll divide the implementation of the B-Tree to 5 levels:

## The Big Picture: Our Roadmap:
| Level   | Focus             | Key Concepts                                                                 |
|---------|-------------------|------------------------------------------------------------------------------|
| Level 1 | The Skeleton      | Node structure, Degree (M), and Search                                        |
| Level 2 | The Growth        | Basic Insertion and the "Leaf Split" logic                                    |
| Level 3 | The Propagation   | Recursive splits (Internal nodes and Root splitting)                          |
| Level 4 | The Shrinking     | Deletion and Underflow (Leaf level)                                           |
| Level 5 | The Full Cycle    | Complex Deletion (Merging and Borrowing/Rebalancing)                          |


