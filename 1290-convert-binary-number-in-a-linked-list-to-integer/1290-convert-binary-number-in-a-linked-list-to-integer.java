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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[cnt];
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        int total=0;
        int exp=0;
        for(int j=cnt-1;j>=0;j--){
            int p=(int)Math.pow(2,exp);
            int product=arr[j]*p;
            total+=product;
            exp++;
        }
        return total;
    }
}