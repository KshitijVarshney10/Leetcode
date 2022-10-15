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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) 
            return null;
        ListNode temp=new ListNode(0); 
        temp.next=head;                      //adding 0 in beginning of listNode
        ListNode previous=temp;
        ListNode current=head;
        while(current!=null){
            while(current.next!=null && current.val==current.next.val){
                current=current.next;
            }
            if(previous.next==current){
                previous=previous.next;
            }
            else{
                previous.next=current.next;
            }
            current=current.next;
        }
        return temp.next;
    }
}