/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: Mr.Ye
 * @Data: 2018-11-19 16:05
 * @Version: 1.0
 **/
public class Test {
    // 排序代码
    public static void sort(int[] a) {

    }

    // 比较
    private static boolean compare(int v, int w) {
        if (v <= w)
            return true;
        else
            return false;
    }

    // 交换
    private static void Swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // 输出
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 调用方法
        System.out.print("初始输出：");
        // 1、调用show()方法
        System.out.println("------------------------------");
        // 2、调用sort(a)方法
        System.out.print("最终输出：");
        // 3、调用show(a)方法

        int[] a = {1,3,5,7,9,0,2,4,6,8};
        System.out.print("初始输出：");
        show(a);
        System.out.println("------------------------------");
        sort(a);
        System.out.print("最终输出：");
        show(a);
    }
}