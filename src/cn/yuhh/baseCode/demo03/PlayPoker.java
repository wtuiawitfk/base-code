package cn.yuhh.baseCode.demo03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主实现
 * 1、制作牌
 * 2、洗牌
 * 3、发牌
 * 4、看牌
 */
public class PlayPoker {
    public static void main(String[] args) {
        //1、制作牌
        ArrayList<String> poker = new ArrayList<>();
        //花色
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        //牌的序号
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先加大小王
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String num : nums) {
                poker.add(color + num);
            }
        }

        //System.out.println(poker);

        /***
         * 2、洗牌
         */
        Collections.shuffle(poker);
        //System.out.println(poker);

        /**
         * 3、发牌
         * 使用集合的索引%3的余数，确定发给谁，剩下三张给底牌
         */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                //发牌给底牌
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                //发给第一个
                player01.add(poker.get(i));
            }else if (i % 3 == 1) {
                //发给第一个
                player02.add(poker.get(i));
            }else if (i % 3 == 2) {
                //发给第一个
                player03.add(poker.get(i));
            }
        }

        /**
         * 4.看牌
         */
        System.out.println("余洪浩的牌："+player01);
        System.out.println("郭庭辉的牌："+player02);
        System.out.println("余相宜的牌："+player03);
        System.out.println("底牌："+dipai);
    }
}
