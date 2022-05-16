import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Найдите наибольший общий делитель двух натуральных чисел.
class GCD {
    public static int compute(int x, int y) {
        if (x == y) {
            return x;
        } else {
            int n = 1;
            if (x < y) {
                for (int i = 2; i <= x; i++) {
                    if (x % i == 0 & y % i == 0) {
                        n = i;
                    }
                }
                return n;
            } else {
                for (int i = 2; i <= y; i++) {
                    if (x % i == 0 & y % i == 0) {
                        n = i;
                    }
                }
                return n;
            }
        }
    }
}


//Вам дан массив целых чисел, ваша задача будет состоять в том, чтобы подсчитать все пары в этом массиве и вернуть их количество.
class Solution {
    public static int duplicates(int[] array) {
       /* List<Integer> intList = new ArrayList<Integer>();
        for (int i : array)
        {
            intList.add(i);
        }
        int n = 0;
        for(int i=0; i<intList.size()-1; i++) {
            for(int j=i+1; j<=intList.size(); j++){
                if(intList.get(i)==intList.get(j)){
                    n++;
                    intList.remove(i);
                    intList.remove(j);
                    break;
                }
            }
        }
        return n;*/
        int n = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] == array[i + 1])
            {
                n++;
                i++;
            }
        }
        return n;
    }
}

        public class main {
            public static void main(String[] args) {
                System.out.println(GCD.compute(1,9));
                System.out.println(GCD.compute(12,60));
                int[] array = {1, 2, 5, 6, 5, 2};
                System.out.println(Solution.duplicates(array));
                int[] array1 = {0,0,0,0};
                System.out.println(Solution.duplicates(array1));
            }
        }