public class main {
    public static void main(String[] args) {
        Node tree = new Node();


        tree.addNode("hello");
        tree.addNode("tom");
        System.out.println(tree.getRoot());


tree.preOrderPrint(tree.getRoot().getData());


    }
}
