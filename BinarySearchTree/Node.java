public class Node {
    private String data;
    private Node left;
    private Node right;
    private Node root;


    public  Node(){

    }

    public Node(String data){
        this.data=data;
    }

    public Node getRoot() {
        return root;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void setLeft(Node left) {
        this.left = left;

    }

    public void setRight(Node right) {
        this.right = right;
    }


public void preOrderPrint(String data){
    System.out.println(data);
    if(left!=null)
    left.preOrderPrint(data);
    if(right!=null)
    right.preOrderPrint(data);

}

public void inOrderPrint(String data){
    if(left!=null)
        left.inOrderPrint(data);
    System.out.println(data);
    if(right!=null)
        right.inOrderPrint(data);
}

public boolean findNode(String data){
        int count=0;
        boolean isTargetFound = false;
        if(left==null){
            return false;
        }
        if (left!=null)
            if(left.data.equals(data))
                isTargetFound=true;
                count+=1;
       if (right!=null)
          right.findNode(data);

    return isTargetFound ;
}

public void addNode(String data){
        if(root==null){
            root = new Node(data);
            return;
        }
        Node temp;
        if(root.data.compareToIgnoreCase(data)>0)
            if (root.left!=null){
                root.left.addNode(data);


            }
        else {
                temp=new Node(data);

                root.setLeft(temp);
        }


        if(root.data.compareToIgnoreCase(data)<0)
            if (root.right!=null){
                root.right.addNode(data);


         }
        else {
                temp=new Node(data);

                root.setRight(temp);
        }





}

public boolean isLeaf(){
        return (left==null)&&(right==null);
}



public boolean deleteNode(String data){
        if(root == null){
            return false;
        }

        if (root.data.equals(data)){
            return true;
        }

        if(root.left!=null){
            root.left.deleteNode(data);
        }
    if(root.right!=null){
        root.right.deleteNode(data);

    }

    return false;
}

}

