package LinkedList;

import java.util.concurrent.atomic.AtomicBoolean;
public class LinkedListPalindrome{
    public static class Palindrome{
        static class Node{
            int data;
            Node next;
        }
        static class Main{
            public static Node push(Node head,int data){
                Node node=new Node();
                node.data=data;
                node.next=head;
                return node;
            }
            public static Node reverse(Node head){
                Node result=null;
                Node current=head;
                while(current!=null){
                    Node next=current.next;
                    current.next=result;
                    result=current;
                    current=next;
                }
                head=result;
                return head;
            }
            public static boolean compare(Node a,Node b){
                if (a==null && b==null) {
                    return true;
                }
                return a!=null && b!=null&&
                        (a.data==b.data)&&
                        compare(a.next,b.next);
            }
            public static Node findMiddle(Node head,AtomicBoolean odd){
                Node prev=null;
                Node slow=head,fast=head;
                while(fast!=null && fast.next!=null){
                    prev=slow;
                    slow=slow.next;
                    fast=fast.next.next;
                }
                if(fast!=null){
                    odd.set(true);
                }
                prev.next=null;
                return slow;
            }
            public static boolean checkPalindrome(Node head){
                if(head==null || head.next==null){
                    return true;
                }
                AtomicBoolean odd=new AtomicBoolean(false);
                Node mid=findMiddle(head,odd);
                if (odd.get()){
                    mid = mid.next;
                }
                mid=reverse(mid);
                return compare(head, mid);
            }
        }
        public static void main(String[]args){
            LinkedListPalindrome list=new LinkedListPalindrome();
            int[] keys={34,57,78,95,99,95,78,57,34};
            Node head=null;
            for(int i=keys.length - 1; i >= 0; i--){
                head=Main.push(head,keys[i]);
            }
            if(Main.checkPalindrome(head)){
                System.out.println("a Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }
    }
}
