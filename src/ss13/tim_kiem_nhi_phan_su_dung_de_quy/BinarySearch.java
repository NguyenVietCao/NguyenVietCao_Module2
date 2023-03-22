package ss13.tim_kiem_nhi_phan_su_dung_de_quy;

public class BinarySearch {
    public static void main(String[] args) {
         int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
         int left = 0;
         int right = list.length-1;
        System.out.print(binarySearch(list,left,right,11));
    }

    /* codes below here */
    public static int binarySearch(int[] array, int left, int right, int value) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }else if (array[middle] > value){
                right = middle-1;
            }else {
                left = middle+1;
            }
            if (left<=right){
               return binarySearch(array,left,right,value);
            }
        return  -1;
    }

}
