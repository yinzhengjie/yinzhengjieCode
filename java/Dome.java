/**
 *
 * @author :yinzhengjie
 * Blog:http://www.cnblogs.com/yinzhengjie
 * EMAIL:y1053419035@qq.com
 *
 * 定义两个列表，这两个列表的数据是有序的，请你将这两个列表的元素合并去重并排序。
 *
 * 解题思路：
 *      1>.将两个列表的数据合并为一个集合；
 *      2>.将得到新的集合使用treeset的特性自动实现去重并排序；
 *
 */
import java.util.ArrayList;
import java.util.TreeSet;


public class Demo {
    public static void main(String[] args) {
        ArrayList list_1 = new ArrayList();
        list_1.add(1);
        list_1.add(3);
        list_1.add(4);
        list_1.add(7);
        list_1.add(9);
        list_1.add(10);
        list_1.add(12);
        list_1.add(13);
        list_1.add(24);
        System.out.println(list_1);

        ArrayList list_2 = new ArrayList();
        list_2.add(2);
        list_2.add(3);
        list_2.add(5);
        list_2.add(7);
        list_2.add(8);
        list_2.add(9);
        list_2.add(13);
        list_2.add(15);
        list_2.add(24);
        list_2.add(39);
        System.out.println(list_2);

        ArrayList list_3 = new ArrayList();
        for (Object obj : list_1) {
            list_3.add(obj);
        }
        for (Object obj : list_2) {
            list_3.add(obj);
        }
        System.out.println(list_3);


        TreeSet ts = new TreeSet();

        for (Object obj : list_3) {
            ts.add(obj);
        }
        System.out.println(ts);
    }
}

