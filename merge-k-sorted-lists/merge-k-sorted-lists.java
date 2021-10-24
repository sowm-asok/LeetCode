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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode resultIter = null;
        PriorityQueue<Integer> pq = new  PriorityQueue<Integer>();
        for(int i = 0; i < lists.length; i++) {
            ListNode l = lists[i];
            while(l != null) {
                pq.add(l.val);
                l = l.next;
            }
        }
        
        // System.out.println(pq.size());
        
        while(pq.size()>0) {
            int val = pq.remove();
            if(resultIter == null)
            {
                result = new ListNode(val);
                resultIter = result;
            }
            else {
                resultIter.next = new ListNode(val);
                resultIter = resultIter.next;
            }
        }
        return result;
    }
}