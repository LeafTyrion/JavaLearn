package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YeYaqiao
 * ArrayList 插入慢，根据索引查询快
 * 线程不安全
 */
public class MyArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();//创建 ArrayList

        list.add(1);//添加元素
        list.add(1, 2);//在指定的位置插入元素，不能超过当前元素的大小
        list.remove(Integer.valueOf(3));//移除指定的元素
        list.remove(0);//移除索引位置上的元素
        System.out.println(list.size());//获取元素的大小

        Iterator<Integer> iterator = list.iterator();//使用 iterator 遍历元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer value : list) {//使用增强型 for 循环遍历元素
            System.out.println(value);
        }
    }
}
