
public class node {
     int data;
     node next;



    public node (int data,node next) {
    this.data=data;
    this.next=next;

    }

    public node() {

    }

    public void setData(int data) {
        this.data=data;
    }
    public void setNext(node node){
        this.next=node;
    }
    public void setPrev(node node){
        this.next=node;
    }
    public node getNext() {
        return next;
    }


    public int getData() {
        return data;
    }
}














