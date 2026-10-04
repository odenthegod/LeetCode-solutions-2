/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        
        ListNode* dummy=new ListNode(0,head);
        ListNode* pred=dummy;
        while(head !=nullptr){
            if (head->next != nullptr && head->val == head->next->val) {
                while (head->next != nullptr && head->val == head->next->val) {
                    head = head->next;
                }
                pred->next = head->next; 
            } else {
                pred = pred->next;
            }
            head = head->next;
        }
        ListNode* newHead = dummy->next;
        delete dummy; 
        return newHead;
    }
};