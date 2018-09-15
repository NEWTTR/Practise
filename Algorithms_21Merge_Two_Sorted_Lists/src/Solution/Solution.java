package Solution;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
        	l1.next = mergeTwoLists(l1.next,l2);
        	return l1;
        } else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
        }
		/*ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        ListNode p1 = l1, p2 = l2;
        while(p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                node.next = p2;
                node = node.next;
                p2 = p2.next;
            } else {
                node.next = p1;
                node = node.next;
                p1 = p1.next;
            }
        }
        node.next = (p1 == null ? p2 : p1);
        return dummy.next;*/
		
    }
}
