public class LinkedListProject {
 node head;
 node tail;
 int nodeCount = 0;// Counter for nodes


 /*
 Adds new node to Tail
 Precondition: Node not null
 Post Condition Node added to list
  */
 public void insert_tail(int data) {
  nodeCount++;
  if (head == null) {
   head = new node(data, null);
   head = tail;
  } else {
   node node = new node(data, tail);
   this.tail.next = node;//fix or double check this
   this.tail = node;
  }
 }

 /*
 Adds new node to head
 Precondition: Node not null
 Post Condition Node added to list
  */
 public void insert_head(int data) {
  nodeCount++;
  if (head == null) {
   head = new node(data, null);
   tail = head;
  } else {
   node node = new node(data, head);
   this.head = head.next;
   head = node;


  }
 }

 /*
 Removes the node at the head
 Precondition: the list head is not null
 Post Condition: the head.next becomes new head, prev head disconnected
  */
 public int removeHead() {
  int result = 0;
  try {
   if (head != null)
    nodeCount--;
   result = head.getData();
   if (head.next != null)
    // head.getNext()= null;
    head = head.next;

  } catch (NullPointerException i) {
   System.out.println("Nothing else to remove");


  }
  return result;
 }




 /*
 Removes the node at the tail
 Precondition: the list head is not null
 Post Condition: loop through the list, get the pointer before the tail and make it the tail
  */
 public int removeTail() {
  int result = 0;
  try{
  node ptr1=head;
  node ptr=head.next;

  if (head != null) {
   nodeCount--;
   result = tail.getData();
   while (ptr.next != null) {
    ptr1 = ptr;
    ptr = ptr.next;
   }
   ptr1.next = null;
   tail = ptr1;
  }
  } catch (NullPointerException e) {
   System.out.println("Nothing to remove");
  }
  return result;
 }

/*
Prints the data in the list
Precondition: Nodes in the list
Post Condition:Items in list printed out
 */
 public void printList() {
  if (head == null) {
   System.out.println("Nothing to Print");
  } else {
   node node = new node();
   for ( node= head; node != null;  node = node.getNext()){
    System.out.println(node.getData());

  }
  }
 }
/*
Searches the list for a target - decided to try a while loop to iterate for practice
Precondition:Uses the node count as a stopping case for the while loop, takes in the target
Post Condition: Searches and Returns the amount of times the target appears in list
*/
 public int isThere(int nodeCount,int target) {
  int result=0;
  if (head == null) {
   return result;
  } else {
   while (nodeCount != 0) {
    if (target==head.getData()){
     result++;
    }
    head = head.next;
    nodeCount--;
   }
   System.out.println(target+" Appeared "+result+ " Time(s)");
  }
  return result;
 }
}




/*

public int removeFront() {
        int result = null;
        if (head != null) {
            nodeCount--;
            result = head.getData;
            if (head.next != null) {
                head.getNext = null;
                head = head.next;
            } else {
                head = null;
                tail = null;
            }
        }
        return result;


        if (head != null)
    nodeCount--;
    result = head.getData();
    head = head.next;

 */