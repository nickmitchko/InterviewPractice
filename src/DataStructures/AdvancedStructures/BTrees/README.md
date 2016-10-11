# B-Trees

A B-Tree—or balanced search tree—is a search tree that is designed to work well on disks and direct access storage drives. They are like RB-Trees but are designed to minimize IO operations.

**Definition:** A B-Tree of order M (M ∈ ℝ > 0) is a tree that either is an external k-node or comprises internal k-nodes having the following properties: every path from the root to an external node must be the same length (balance); and k must be between 2 and M-1 at the root and between M/2 and M-1 at every other node.