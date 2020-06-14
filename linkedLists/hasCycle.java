/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null){
            return false;     
        }
        
        ArrayList<ListNode> list = new ArrayList();
        list.add(head);
        while(head.next != null){
            if (list.contains(head.next)){
                return true;
            } else {
                head = head.next;
                list.add(head);
            }
        }
        return false;
    }
}