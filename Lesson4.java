public class Lesson4 {
    public static void main(String[] args) {
        one();
        two();
    }
    static void one(){
        int nums[] = new int[]{28, 29, 30, 29, 31};
        int len;
        len = nums.length;
        int sum = 0;
        for ( int i = 0; i<nums.length; i++) {
            sum += nums[i] ;
        }
        int middle = sum/len;
        System.out.println(middle);

    }
    static void two(){
            int array[] = new int[]{5, 6, 7, 1, 9, 8, 8};
            int len = array.length;
            int sum = 0;
            int min = array[0];
            int min2 = array[0];
            int minIndex = -1;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            for (int i=0; i<array.length; i++){
                if (array[i] < min){
                    min = array[i];
                    minIndex = i;
                }
            }
            for (int num : array) {
                if (num < min2 && min < num) {
                    min2 = num;
                }
            }
            int middle = sum / len;
            if (min2 - min >= 3)
                array[minIndex] = middle;
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }



        }
    }


