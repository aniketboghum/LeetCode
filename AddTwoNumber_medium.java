package LeetCode;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class AddTwoNumber_medium {
    public  static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add;
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null)
        {
            int l1val = l1 == null ? 0 : l1.val;
            int l2val = l2 == null ? 0 : l2.val;

            int addition = l1val + l2val + carry;
            carry = 0;
            if (addition >= 10)
            {
                carry = addition / 10;
                addition %= 10;
            }
            if (head == null)
            {
                add = new ListNode(addition, null);
                head = add;
                tail = head;
            }
            else
            {
                tail.next = new ListNode(addition, null);
                tail = tail.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry > 0) tail.next = new ListNode(carry, null);
        tail = tail.next;
        return head;
    }

    public static void main(String[] args) {
        int[] a = {9,9,9,9,9,9,9};
        int[] b = {9,9,9,9};

//        int[] a = {2, 4, 3};
//        int[] b = {5, 6, 4};
        ListNode l1 = ListNode.GenerateList(a);
        ListNode l2 = ListNode.GenerateList(b);
        ListNode.displayList(addTwoNumbers(l1, l2));
    }
}
