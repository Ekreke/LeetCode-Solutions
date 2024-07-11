package addTwoNumbers;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/07/10/13:40
 * @Description:
 */

//

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int digital1 = (l1 !=  null) ? l1.val : 0;
            int digital2 = (l2 != null) ? l2.val : 0;
            int sum = digital1 + digital2 + carry;
            carry = sum / 10;
            int num = sum % 10;
            ListNode newNode  = new ListNode(num);
            tail.next = newNode;
            tail = tail.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummyNode.next;
    }
}
