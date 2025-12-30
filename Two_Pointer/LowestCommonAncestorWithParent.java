
// class Node {
//     int val;
//     Node left;
//     Node right;
//     Node parent;

//     Node(int val) {
//         this.val = val;
//     }
// }

import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class LowestCommonAncestorWithParent {
    // -------- METHOD 1: HashSet Approach --------
    public static Node lcaUsingSet(Node p, Node q) {
        Set<Node> set = new HashSet<>();

        while (p != null) {
            set.add(p);
            p = p.parent;
        }

        while (q != null) {
            if (set.contains(q)) {
                return q;
            }
            q = q.parent;
        }
        return null;
    }

    // -------- METHOD 2: Two Pointer (Optimal) --------
    public static Node lcaTwoPointer(Node p, Node q) {
        Node p1 = p;
        Node q1 = q;

        while (p1 != q1) {
            p1 = (p1 == null) ? q : p1.parent;
            q1 = (q1 == null) ? p : q1.parent;
        }
        return p1;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        // Build Tree
        Node root = new Node(3);
        Node n5 = new Node(5);
        Node n1 = new Node(1);
        Node n6 = new Node(6);
        Node n2 = new Node(2);
        Node n0 = new Node(0);
        Node n8 = new Node(8);

        root.left = n5;
        root.right = n1;
        n5.parent = root;
        n1.parent = root;

        n5.left = n6;
        n6.parent = n5;

        n5.right = n2;
        n2.parent = n5;

        n1.left = n0;
        n0.parent = n1;

        n1.right = n8;
        n8.parent = n1;

        // Test nodes
        Node p = n6;
        Node q = n2;

        // Method 1
        Node ans1 = lcaUsingSet(p, q);
        System.out.println("LCA using HashSet: " + ans1.val);

        // Method 2
        Node ans2 = lcaTwoPointer(p, q);
        System.out.println("LCA using Two Pointer: " + ans2.val);
    }
}
