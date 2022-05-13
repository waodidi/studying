public class 位运算 {
    public static void print(int num){
        for(int i = 31; i >= 0; i--){
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");//与运算，全真才为真
        }
    }
    public static void main(String[] args) {
        int num = 4;
        print(num);
    }
}
