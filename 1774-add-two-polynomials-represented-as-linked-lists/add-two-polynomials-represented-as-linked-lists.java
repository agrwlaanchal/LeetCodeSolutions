/**
 * Definition for polynomial singly-linked list.
 * class PolyNode {
 * int coefficient, power;
 * PolyNode next = null;
 * 
 * PolyNode() {}
 * PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
 * PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y;
 * this.next = next; }
 * }
 */

class Solution {
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {

        PolyNode head1 = poly1;
        PolyNode head2 = poly2;
        PolyNode res = null;
        PolyNode temp = null;

        while (head1 != null && head2 != null) {

            if (head1.power > head2.power) {
                if (res == null) {
                    if(head1.coefficient!=0){
                    res = new PolyNode(head1.coefficient, head1.power);
                    temp = res;
                    }
                } else {
                    if(head1.coefficient!=0){
                    temp.next = new PolyNode(head1.coefficient, head1.power);
                    temp = temp.next;
                    }
                }
                head1 = head1.next;
            } else if (head2.power > head1.power) {
                if (res == null) {
                    if(head2.coefficient!=0){
                    res = new PolyNode(head2.coefficient, head2.power);
                    temp = res;
                    }
                } else {
                    if(head2.coefficient!=0){
                    temp.next = new PolyNode(head2.coefficient, head2.power);
                    temp = temp.next;
                    }
                }
                head2 = head2.next;
            } else {
                if (res == null) {
                    if(head2.coefficient + head1.coefficient!=0){
                    res = new PolyNode(head2.coefficient + head1.coefficient, head2.power);
                    temp = res;
                    }
                } else {
                    if(head2.coefficient + head1.coefficient!=0){
                    temp.next = new PolyNode(head2.coefficient + head1.coefficient, head2.power);
                    temp = temp.next;
                    }
                }
                head1 = head1.next;
                head2 = head2.next;
            }

        }

        while (head1 != null) {
            if (res == null) {
                if(head1.coefficient!=0){
                res = new PolyNode(head1.coefficient, head1.power);
                temp = res;
                }
            } else {
                if(head1.coefficient!=0){
                temp.next = new PolyNode(head1.coefficient, head1.power);
                temp = temp.next;
                }
            }
            head1 = head1.next;
        }
        while (head2 != null) {
            if (res == null) {
                if(head2.coefficient!=0){
                res = new PolyNode(head2.coefficient, head2.power);
                temp = res;
                }
            } else {
                if(head2.coefficient!=0){
                temp.next = new PolyNode(head2.coefficient, head2.power);
                temp = temp.next;
                }
            }
            head2 = head2.next;
        }
        return res;

    }
}