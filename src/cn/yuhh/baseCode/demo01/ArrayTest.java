package cn.yuhh.baseCode.demo01;

import java.util.Arrays;

/***
 * 将一个字符数组排序倒序输出
 */
public class ArrayTest {
    public static void main(String[] args) {
        String str = "aksdjfjasdlfj45klsjdf";
        //把字符串变成字条数组
        char[] chars = str.toCharArray();
        //排序
        Arrays.sort(chars);
        //倒序输出
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
