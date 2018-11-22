/**
 * @ClassName: BinTree
 * @Description: TODO
 * @Author: Mr.Ye
 * @Data: 2018-11-22 18:25
 * @Version: 1.0
 **/

class BinTreeNode {
    private Node root; // 根节点

    private class Node {
        private Node left; // 左孩子
        private Node right; // 右孩子
        private Integer data; // 值

        public Node(Integer data) {
            this(null, null, data);
        }

        public Node(Node left, Node right, Integer data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
    //-----------------------------------------------------------
}


public class BinTree {
}
