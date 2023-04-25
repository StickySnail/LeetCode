import java.util.Arrays;

class Solution {
    static public int lastStoneWeight(int[] stones) {
        int[] newStoneArr = stones.clone();

        for (; ; ) {
            //Sort Array so the last 2 numbers can be the biggest two
            Arrays.sort(newStoneArr);
            
            //escape condition
            if (newStoneArr.length <= 1)
                return newStoneArr.length == 1 ? newStoneArr[0] : 0;


            int x = newStoneArr[newStoneArr.length - 2];
            int y = newStoneArr[newStoneArr.length - 1];

            int[] tmp;
            if (x == y) {
                tmp = new int[newStoneArr.length - 2];
                for (int i = 0; i < tmp.length; i++)
                    tmp[i] = newStoneArr[i];
            } else {
                tmp = new int[newStoneArr.length - 1];
                for (int i = 0; i < tmp.length; i++)
                    tmp[i] = newStoneArr[i];
                tmp[tmp.length - 1] = y - x;
            }
            newStoneArr = tmp.clone();

        }
    }
}