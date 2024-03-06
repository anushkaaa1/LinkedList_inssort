public class linkedlinssort {
    Node head,tail;

    public linkedlinssort(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int value){
        Node newnode = new Node(value);
        if(head==null)
            tail = head = newnode;
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null)
            System.out.println("list is empty");
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void insertsorted(int value){
        Node newnode = new Node(value);
        if(head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            Node ptemp = null;
            while (temp!=null) {
                if(temp.data>newnode.data){
                    if(temp!=head){
                        newnode.next = temp;
                        ptemp.next = newnode;
                    }
                    else{
                        newnode.next = head;
                        head = newnode;
                    }
                    break;
                }
                else{
                    ptemp = temp;
                    temp = temp.next;
                }
            }
            if(temp==null){
                ptemp.next = newnode;
                tail = newnode;
            }
        }
    }
    public static void main(String args[]){
        linkedlinssort l = new linkedlinssort();
        l.create(1);
        l.create(4);
        l.create(8);
        l.print(l.head);
        l.insertsorted(0);
        System.out.println();
        l.print(l.head);
    }
}
