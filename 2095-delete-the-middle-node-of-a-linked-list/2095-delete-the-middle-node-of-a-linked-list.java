/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int k=countNodes(temp);
        ListNode flag=head;
        if(k==1)
            return null;
        k=k/2;
        while(k/2!=0){
            flag=flag.next;
            k--;
        }
        
        flag.next=flag.next.next;
        return head;
    }
    public static int countNodes(ListNode head){
        int m=0;
        while(head!=null){
            m++;
            head=head.next;
        }
        return m;
    }
}