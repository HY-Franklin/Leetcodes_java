import java.util.List;

//https://leetcode.com/tag/linked-list/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  class ListRoot{
    ListRoot(ListNode head){
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
    }
  }

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head; ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next.next;
        }

        return slow;
    }
}


public class Linked_List_PC {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListRoot r=new ListRoot(head);
    }
}
