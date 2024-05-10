//helper class for Linked List questions
package LeetCode;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val; this.next = next;
    }

    public static ListNode generateList(int[] a){
        ListNode head = null;
        ListNode tail = null;

        for (int j : a) {
            if (head == null) {
                head = new ListNode(j, null);
                tail = head;
                continue;
            }

            tail.next = new ListNode(j, null);
            tail = tail.next;
        }
        return head;
    }

    public static void displayList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static int getLengthOfList(ListNode head){
        int count = 0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
}
