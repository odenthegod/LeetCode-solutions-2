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
    int getDecimalValue(ListNode* head) {
        int cnt=0;
        ListNode* temp=head;
        while(temp!=NULL){
            cnt++;
            temp=temp->next;
        }
        int* arr=new int[cnt];
        temp=head;
        int i=0;
        while(temp!=NULL){
            arr[i++]=temp->val;
            temp=temp->next;
        }
        int total=0;
        int exp=0;
        for(int i=cnt-1;i>=0;i--){
            int p=pow(2,exp);
            int product=arr[i]*p;
            total+=product;
            exp++;
        }
        return total;
    }
};