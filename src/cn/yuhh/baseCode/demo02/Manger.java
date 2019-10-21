package cn.yuhh.baseCode.demo02;

import java.util.ArrayList;
//群主
public class Manger extends User {
    public Manger(String name, int money) {
        super(name, money);
    }

    public Manger() {
    }

    //发红包

    /***
     *
     * @param totalMoney:总共要发多少钱的红包
     * @param count：要发多少个红包
     * @return
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>(); //装分好的红包
        //要发的钱不能超过已有的钱
        if (super.getMoney() < totalMoney) {
            System.out.println("余额不足");
        }

        //分红包
        int avg = totalMoney / count;
        int con = totalMoney % count;   //余数

        //装红包
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        redList.add(avg + con);
        //群主的钱要减少
        super.setMoney(this.money - totalMoney);
        return redList;
    }
}
