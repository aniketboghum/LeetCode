package LeetCode;

public class ReorderList_medium {
    public static ListNode reorderList(ListNode head)
    {
        int length = ListNode.getLengthOfList(head);

        ListNode firstHalf  = new ListNode();
        ListNode revSecondHalf = null;
        ListNode currentNode = firstHalf;

        int i = 0;
        while (i<=length/2 && head!=null)
        {
            ListNode temp = new ListNode();
            temp.val = head.val;
            currentNode.next = temp;
            currentNode = temp;

            head = head.next;
            i++;
        }

        firstHalf = firstHalf.next;
        revSecondHalf =  ListNode.getReversedList(head);


        head = new ListNode(1, null);
        currentNode = head;
        i = 1;

        while (firstHalf != null && revSecondHalf != null)
        {
            if (i%2 == 1)
            {
                currentNode.next = firstHalf;
                firstHalf   = firstHalf.next;
            }
            else
            {
                currentNode.next   = revSecondHalf;
                revSecondHalf = revSecondHalf.next;
            }
            currentNode = currentNode.next;

            i++;
        }

        currentNode.next = firstHalf == null ? revSecondHalf : firstHalf;
        return head.next;
    }

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        ListNode head = ListNode.generateList(a);

        ListNode.displayList(reorderList(head));
    }
}
