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
    void reorderList(ListNode* head) {
        ListNode* slow=head;
        ListNode* fast=head;
        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        
        ListNode* curr=slow->next;
        slow->next=NULL;
        ListNode* prev=nullptr;
        while(curr!=NULL){
            ListNode* next_node=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next_node;
            //prev is like head of new node
        }
        ListNode* first=head;
        ListNode* second=prev;
        while(second!=NULL){
            ListNode* tmp1 = first->next;
            ListNode* tmp2 = second->next;
            first->next=second;
            second->next=tmp1;
            first=tmp1;
            second=tmp2;
        }
    }
};