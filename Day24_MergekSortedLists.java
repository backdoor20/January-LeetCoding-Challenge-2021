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
        int len=lists.length;
        if(len<1)
            return null;
        if(len==1)
            return lists[0];
        int interval = 1;
        while(interval < len){
            for(int i = 0; i + interval < lists.length; i += 2 * interval){
                lists[i] = mergeLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];       
    }
    public ListNode mergeLists(ListNode list1,ListNode list2){
       ListNode head=new ListNode(0);
       ListNode h=head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                h.next=list2;
                h=h.next;
                list2=list2.next;
            }else{
                h.next=list1;
                h=h.next;
                list1=list1.next;
            }
        }
        if(list1==null){
            h.next=list2;
        }
        if(list2==null){
            h.next=list1;
        }
        return head.next;
    }
}