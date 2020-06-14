class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true; 
        }
        List<Integer> list = new ArrayList();
        List<Integer> reversedList = new ArrayList();
        ListNode curr = head;
        list.add(curr.val);
        reversedList.add(curr.val);
        while(curr.next != null){
            list.add(curr.next.val);
            reversedList.add(curr.next.val);
            curr = curr.next;
        }
        Collections.reverse(reversedList);
        if (list.equals(reversedList)){
            return true;
        } else return false;
    }
}