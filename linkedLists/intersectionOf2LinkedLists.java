/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr = headB;
        if (headA!= null){
            while(curr!= null){
                if (headA == curr){
                    return headA;
                } else {
                    
                
                curr = curr.next;
                }
            }
            return getIntersectionNode(headA.next, headB);
        }   
        return null;
   
    }

}