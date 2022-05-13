public class 二分查找 {
    public static void pri(int []num){
        for(int i = 0; i < num.length; i++){
            System.out.println(i);
        }
    }

    //法一：左闭右闭(对于二分查找的左闭右闭,记得在while循环中是得有等号)
    public static int twoFind01(int []num, int target){
        int l = 0, r = num.length - 1;
        while (l <= r) {
            int mid = l + ((r - l)>>1);
            System.out.println(mid);
            if(num[mid] == target) {
                return mid;
            }else if(num[mid] < target) {
                l = mid + 1;// target 在右区间，所以[middle + 1, right]
            }else {
                r = mid - 1;// target 在左区间，所以[left, middle - 1]
            }
        }
        return -1;
    }

    //法二：左闭右开
    public static int twoFind02(int []num, int target) {
        int l =0, r = num.length;
        while(l < r ){
            int mid = l + ((r - l)>>1);
            if(num[mid] == target) {
                return mid;
            }else if(num[mid] < target) {
                l = mid + 1;// target 在右区间，所以[mid + 1, right)
            }else{
                r = mid;// target 在左区间，所以[left, middle)
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,5,1,9,15,6};
//        法一：左闭右闭
//        int x = 0;
//        x = twoFind01(num,9);
//        System.out.println(x);

//         法二：左闭右开
          int y = 0;
          y = twoFind02(num,9);
          System.out.println(y);
    }
}
