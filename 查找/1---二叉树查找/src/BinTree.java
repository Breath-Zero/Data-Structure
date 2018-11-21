/**
 * @ClassName: BinTree
 * @Description: TODO
 * @Author: Mr.Ye
 * @Data: 2018-11-21 15:23
 * @Version: 1.0
 **/

class BinTreeNode{
    private Node root; // 根节点

    private class Node{
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


    // 插入
    public void insert(Integer obj){
        root = insert(root, obj);
    }

    // 判空
    public boolean isEmpty(){
        return root==null;
    }

    // 置空
    public void makeEmpty(){
        root = null;
    }

    // 判断一个值在树种是否存在

    // 查找最小值

    // 查找最大值

    // 树的遍历

    public void printTree(){
        System.out.println("先序遍历：");
        printTree(root);
        System.out.println();
    }
    public void printTree1(){
        System.out.println("中序遍历：");
        printTree1(root);
        System.out.println();
    }
    public void printTree2(){
        System.out.println("后序遍历：");
        printTree2(root);
        System.out.println();
    }

    // 树的销毁

    //-----------------------------------------------------------

    private Node insert(Node root, Integer obj){ // 插入
        if (root == null){
            return new Node(obj);
        }
        int num = obj.compareTo(root.data);
        if (num < 0){
            root.left = insert(root.left, obj);
        }else if (num > 0){
            root.right = insert(root.right, obj);
        }
        return root;
    }

    private void printTree(Node root){ // 先序遍历
        if (root != null){
            System.out.print(root.data + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    private void printTree1(Node root){ // 中序遍历
        if (root != null){
            printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);
        }
    }

    private void printTree2(Node root){ // 后序遍历
        if (root != null){
            printTree(root.left);
            printTree(root.right);
            System.out.print(root.data + " ");
        }
    }

}


public class BinTree {
    public static void main(String[] args) {
        BinTreeNode bt = new BinTreeNode();
        int[] result = new int[]{6,4,5,2,8,9,7};

        for (int i = 0; i < result.length; i++){
            bt.insert(result[i]);
        }

        bt.printTree(); // 先序遍历
        bt.printTree1(); // 中序遍历
        bt.printTree2(); // 后序遍历
    }
}
