/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
     
        ListNode ptr1 = head1;
    ListNode ptr2 = head2;

    // If any one of head is null i.e
    // no Intersection Point
    if (ptr1 == null || ptr2 == null) {

        return null;
    }

    // Traverse through the lists until they
    // reach Intersection node
    while (ptr1 != ptr2) {

        ptr1 = ptr1.next;
        ptr2 = ptr2.next;

        // If at any node ptr1 meets ptr2, then it is
        // intersection node.Return intersection node.

        if (ptr1 == ptr2) {

            return ptr1;
        }
        /* Once both of them go through reassigning,
        they will be equidistant from the collision point.*/

        // When ptr1 reaches the end of a list, then
        // reassign it to the head2.
        if (ptr1 == null) {

            ptr1 = head2;
        }
        // When ptr2 reaches the end of a list, then
        // redirect it to the head1.
        if (ptr2 == null) {

            ptr2 = head1;
        }
    }

    return ptr1;
        
    }
}