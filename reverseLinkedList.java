/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class reverseLinkedList {

    // recurrsion TC: O(n) SC: O(1)
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverse;
    }

}

// //Iterative solution TC: O(n) SC: O(1)
// public ListNode reverseList(ListNode head) {
// if(head == null|| head.next == null) return head;
// ListNode prev = null;
// ListNode current = head;
// ListNode fast = current.next;

// while(fast != null){
// current.next = prev;
// prev = current;
// current = fast;
// fast = fast.next;
// }
// current.next = prev;
// return current;

// }