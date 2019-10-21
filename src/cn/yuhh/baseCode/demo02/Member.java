package cn.yuhh.baseCode.demo02;

import java.util.ArrayList;
import java.util.Random;

//普通用户
public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    //收红包
    public void receiveRed(ArrayList<Integer> redList) {
        //随机取得红包
        int index = new Random().nextInt(redList.size());
        //取出红包
        Integer delta = redList.remove(index);
        super.setMoney(delta);
    }
}
