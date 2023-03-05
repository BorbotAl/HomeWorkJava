// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package homework1;

import java.util.Arrays;

public class task03 {
    public static void main(String[] args) {
        ChangeElements();
    }
    public static void ChangeElements(){
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int countOfVal = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                int temp = nums[nums.length - 1 - countOfVal];
                nums[nums.length - 1 - countOfVal] = nums[i];
                nums[i] = temp;
                countOfVal++;
                }
            }
        System.out.println(Arrays.toString(nums));
        }
    }

