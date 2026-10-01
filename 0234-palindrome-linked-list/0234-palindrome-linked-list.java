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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> ans = new Stack<>();
        ListNode curr=head;
        while (curr != null) {
            ans.push(curr.val);
            curr = curr.next;
        }
        while (head != null) {
            if (ans.peek() != head.val) {
                return false;

            }
            ans.pop();
            head = head.next;
        }

        return true;

    }
}