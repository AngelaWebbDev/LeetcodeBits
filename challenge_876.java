/* DESCRIPTION:
 * Given the head of a singly linked list, return the middle node of the linked list.
* If there are two middle nodes, return the second middle node.
 */

/* NOTES:
 * beats 79.85% for memory (39.7mb)
 * 
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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while(end!=null && end.next!=null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
