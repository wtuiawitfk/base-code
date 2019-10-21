package cn.yuhh.baseCode.demo02;

//普通人
public class User {
    String name;    //名字
    int money;  //钱
    public User(){}


    public void show() {
        System.out.println("我的名字叫：" + name + "，我有" + money + "元钱！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
