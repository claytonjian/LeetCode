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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list = new ListNode((l1.val + l2.val) % 10);
        ListNode head = list;
        carry = (l1.val + l2.val) / 10;
        while(l1.next != null || l2.next != null){
            if(l1.next == null){
                l1.next = new ListNode(0);
            }
            if(l2.next == null){
                l2.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
            list.next = new ListNode(((l1.val + l2.val) + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            list = list.next;
        }
        if(carry == 1){
            list.next = new ListNode(1);
        }
        return head;
    }
}