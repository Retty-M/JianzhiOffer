package JZOffer;

/**
 * Created by retty on 16/5/2.
 * 打印1到最大的n位数
 * 使用字符串代替数字,可表示大数
 */
public class Question12 {

    public static void printToMaxOfNDigits(int n) {
        if (n <= 0) return;
        char[] sArr = new char[n];
        for (int i = n-1; i >=0 ; i--) {
            sArr[i] = '1';
            int index = n-1;
            while (sArr[index] != ':') {
                System.out.println(String.valueOf(sArr, i, n-i));
                sArr[index]++;
                while (sArr[index] == ':') {
                    sArr[index--] = '0';
                    if (index < i) break;
                    else sArr[index]++;
                }
                if (index < i) break;
                else index = n - 1;
            }
        }
    }

    public static void main(String[] args) {
        printToMaxOfNDigits(4);
    }

}
