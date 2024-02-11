/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

            int left=1;
            int right=n;
            

        while(left<=right){
            int gnumber = left+ (right-left)/2; 

            int num = guess(gnumber);
                if(num==0){
                    return gnumber;
                }else if(num<1){
                    right=gnumber-1;
                }else{
                    left=gnumber+1;
                }
        }
            return -1;
    }
}