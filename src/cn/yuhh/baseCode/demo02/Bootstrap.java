package cn.yuhh.baseCode.demo02;

import java.util.ArrayList;

public class Bootstrap {
    public static void main(String[] args) {
        //有一个群主，他有100元
        Manger manger = new Manger("群主",100);
        //有三个抢红包的人
        Member one = new Member("用户a",0);
        Member two = new Member("用户b",0);
        Member three = new Member("用户c", 0);

        manger.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=====================");

        //群主发20元红包给他们3个
        ArrayList<Integer> red = manger.send(20, 3);
        //3个人抢
        one.receiveRed(red);
        two.receiveRed(red);
        three.receiveRed(red);

        //抢的结果
        System.out.println("抢红包的结果：");
        manger.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=====================");
    }
}
