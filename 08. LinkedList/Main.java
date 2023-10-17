public class Main{
    public static class Node{
        int val;
        Node next;
    }

    void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }


    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int data){
            Node n = new Node();
            n.val = data;
            n.next = null;

            if(size == 0){
                head = n;
                tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }

            size++;
        }

        //write your code here
        int size(){

        }

        void addFirst(int data){

        }

        void removeFirst(){

        }

        void removeLast(){

        }

        int getFirst(){

        }

        int getLast(){

        }
        int getAt(int idx){
            //temp =  Node at idx 
            // return temp.val;
        }

        void addAt(int data, int idx){

        }
        void removeAt(int idx){

        }
        Node getAtNode(int idx){
            
        }
        
    }





    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.display(list.head);
    }
}