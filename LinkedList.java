import java.util.*;
public class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static Node head;
    public static Node head2;
    public static Node head1;
    public static void main(String[] args){
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head2 = new Node(60);
        head2.next = new Node(70);
        head2.next.next = new Node(80);
         head2=head.next.next.next;
        // head2.next.next.next = new Node(40);
        // head2.next.next.next.next = new Node(50);
       
        //printLinkedList();
        //countingNodes();
        //System.out.println(search());
        // addFirst(100);
        // printLinkedList();
        // addLast(200);
        // printLinkedList();
        // addAtGivenPosition(400);
        // printLinkedList();
        // deleteFirst();
        // printLinkedList();
        // deleteLast();
        // printLinkedList();
        // deleteAtGivenPos(3);
        // printLinkedList();
        // reverseLinkedList();
        // printLinkedList();
        // deleteKFromLast(3);
        // printLinkedList();
        // head=sortColorsInLL();
        // printLinkedList();
        //int LinkedList();
        // createLoopInLL();
        // printLinkedList();
        // loopDetection();
        // printLinkedList();
        // System.out.println(isPalindromeLL());
        // printLinkedList();
        // head=rotate(3);
        // printLinkedList();
        // head1=head;
        // int i=insertionOfLL(head1,head2);
        // System.out.println(i);
    }
    public static void printLinkedList(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void countingNodes(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    public static boolean search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element to be searched:");
        int ele=sc.nextInt();
        Node temp = head;
        while(temp!=null){
            if(temp.data == ele) return true;
            temp = temp.next;
        }
        return false;
    }
     public static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
     public static void addAtGivenPosition(int data){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the particular position:");
        int target=sc.nextInt();
        if(target<0){
            System.out.println("the given target is below 0");
            return;
        }
        if(target == 0 ){
            addFirst(data);
        }
        else{
            int count = 0;
            Node temp = head;
            while(count!=target-1){
                count++;
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }
    public static void deleteFirst(){
        head = head.next; 
    }
    public static void deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
    }
    public static void deleteAtGivenPos(int target){
        if(target<0){
            System.out.println("you are given target as 0");
            return;
        }
        if(target == 0 ){
            deleteFirst();
            return;
        }
            int count = 0;
            Node temp = head;
            while(count!=target-1){
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
    
    }
      public static void reverseLinkedList(){
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head = prev;
    }
    public static void deleteKFromLast(int k){
        Node fast=head;
    while(k!=0&&fast!=null){
        fast=fast.next;
        k--;
    }
    if(k!=0){
        System.out.println("Invalid length");
        return;
    }
    if(fast==null){
        head=head.next;
        return;
    }
    Node slow=head;
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    }
    public static Node evenOddLL(){
        Node temp=head;
        Node evenHead=new Node(-1);
        Node oddHead=new Node(-1);
        Node even=evenHead;
        Node odd=oddHead;
        int index=0;
        while(temp!=null){
            if(index%2==0){
                even.next=temp;
                even=even.next;
            }
            else{
                odd.next=temp;
                odd=odd.next;
            }
            index++;
            temp=temp.next;
        }
        odd.next=evenHead.next;
        return oddHead.next;
        
    }
    public static Node sortColorsInLL(){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next=new Node(2);
        printLinkedList();
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            if(temp.data==2){
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
            two.next=null;
       if (oneHead.next==null){
        zero.next=twoHead.next;
       }
       else{
        zero.next=oneHead.next;
       }
       one.next=twoHead.next;
    }
    return zeroHead.next;
    }
    public static void createLoopInLL(){
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp=head;
    }
    public static void loopDetection(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
    public static boolean isPalindromeLL(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr =slow;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node temp=head;
        while(temp!=null && prev!=null){
            if(temp.data!=prev.data)return false;
            temp=temp.next;
            prev=prev.next;
        }
        return true;
    }
    public static Node rotate(int k){
        if(head==null||k==0)return head;
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        count++;
        if(k%count==0)return head;
        k=k%count;
        temp.next=head;
        Node prev=null;
        for(int i=0;i<count-k+1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        head=temp;
        return head;
    }
    public static int insertionOfLL(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int count1=0,count2=0;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==null){
                if(count1==1)return -1;
                temp1=head2;
                count1++;
            }
            if(temp2==null){
                if(count2==1)return -1;
                    temp2=head1;
                    count2++;
            }
        }
        if(temp1==null||temp2==null)return -1;
        return temp1.data;
    }
        public static Node addTwoLinkedlists(Node l1, Node l2) {
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        Node head = new Node(-1);
        Node newHead = head;
        while (temp1 != null || temp2 != null) {
            int sum = 0;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            newHead.next = newNode;
            newHead = newNode;
        }
        Node newNode = new Node(carry);
        if (carry != 0) {
            newHead.next = newNode;
        }
        return head.next;
    }
}