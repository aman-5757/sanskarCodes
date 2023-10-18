public class Main{
    
    
    public static class Node{
        int val;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;
        
        void display(Node head){
            
            Node curr = head;
            //System.out.println(head);
            //System.out.println(tail);
            while(curr != null){
                System.out.print(curr.val + " ");
                //System.out.println(curr.next);
                curr = curr.next;
            }
            System.out.println();
            /*System.out.println("Next Values!");
            System.out.println(head.next);
            System.out.println(tail.next);
            System.out.println("Data Values!");
            System.out.println(head.val);
            System.out.println(tail.val);*/
        }

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
            return size;
        }

        void addFirst(int data){
            Node n = new Node();//add if size == 0
            n.val = data;
            n.next = head;
            head = n;
            size++;
        }

        void removeFirst(){
            head = head.next;
            size--;
        }

        void removeLast(){
            int i = 1;
            Node curr = head;
            
            while(i != size-1){//<=??
                curr = curr.next;
                i++;
            }
            tail = curr;
            tail.next = null;
            size--;
        }

        int getFirst(){
            
            int ans = head.val;
            return ans;
            
        }

        int getLast(){
            
            int ans = tail.val;
            return ans;

        }
        /*int getAt(int idx){
            //temp =  Node at idx 
            // return temp.val;
        }

        void addAt(int data, int idx){

        }
        void removeAt(int idx){

        }
        Node getAtNode(int idx){
            
        }*/
        
    }





    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(15);
        list.addFirst(25);
        //list.removeFirst();
        //list.removeLast();
        list.display(list.head);
        int first = list.getFirst();
        int last = list.getLast();
        int size = list.size();
        // System.out.println("****");
        list.addFirst(35);
        list.display(list.head);
        // System.out.println("First element of the Linked List: " + first);
        // System.out.println("Last element of the Linked List: " + last);
        // System.out.println("Size of Linked List: " + size);
    }
}