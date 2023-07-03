package b00_base.arithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

// 算法基础
public class arithmeticbase {
    // 数组
    @Test()
    public void arrayTest() {
        int m = 5, n = 10;

        int[] nums = new int[n];

        boolean[][] visited = new boolean[m][n];
    }

    // 字符串
    @Test()
    public void stringTest() {
        String s1 = "hello world";

        char c = s1.charAt(2);
        System.out.println(c);

        char[] chars = s1.toCharArray();

        chars[1] = 'a';

        String s2 = new String(chars);

        System.out.println(s2);

        if (s1.equals(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        // 字符串拼接
        String s3 = s1 + "!";

        System.out.println(s3);
    }

    // 字符串拼接
    @Test
    public void stringJoint() {
        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'f'; c++) {
            sb.append(c);
        }

        sb.append('g').append("hij").append(123);

        String res = sb.toString();

        System.out.println(res);
    }

    // 动态数组
    @Test
    public void dynamicArray() {
        ArrayList<String> nums = new ArrayList<>();

        ArrayList<Integer> strings = new ArrayList<>();

        // // 判断数组是否为空
        // boolean isEmpty()

        // // 返回数组的元素个数
        // int size()

        // // 返回索引 index 的元素
        // E get(int index)

        // // 在数组尾部添加元素 e
        // boolean add(E e)
    }

    // 双向链表
    @Test
    public void doubleLinkedList() {
        // 初始化一个存储 int 类型的双链表
        LinkedList<Integer> nums = new LinkedList<>();

        // 初始化一个存储 String 类型的双链表
        LinkedList<String> strings = new LinkedList<>();

        // 判断链表是否为空
        // boolean isEmpty()

        // // 返回链表的元素个数
        // int size()

        // // 判断链表中是否存在元素 o
        // boolean contains(Object o)

        // // 在链表尾部添加元素 e
        // boolean add(E e)

        // // 在链表尾部添加元素 e
        // void addLast(E e)

        // // 在链表头部添加元素 e
        // void addFirst(E e)

        // // 删除链表头部第一个元素
        // E removeFirst()

        // // 删除链表尾部最后一个元素
        // E removeLast()
    }

    // 哈希表
    @Test
    public void hashMapTest() {
        // 整数映射到字符串的哈希表
        HashMap<Integer, String> map = new HashMap<>();

        // 字符串映射到数组的哈希表
        HashMap<String, int[]> map2 = new HashMap<>();

        // 判断哈希表中是否存在键 key
        // boolean containsKey(Object key)

        // // 获得键 key 对应的值，若 key 不存在，则返回 null
        // V get(Object key)

        // // 将 key, value 键值对存入哈希表
        // V put(K key, V value)

        // // 如果 key 存在，删除 key 并返回对应的值
        // V remove(Object key)
    }

    // 哈希集合
    @Test
    public void hashsetTest() {
        // 新建一个存储 String 的哈希集合
        Set<String> set = new HashSet<>();

        // 如果 e 不存在，则添加 e 到哈希集合
        // boolean add(E e)

        // // 判断元素 o 是否存在于哈希集合中
        // boolean contains(Object o)

        // // 如果元素 o 存在，在删除元素 o
        // boolean remove(Object o)
    }
}
