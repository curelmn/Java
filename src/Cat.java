public class Cat extends Animal implements Eat,Sleep, Think,Talk,Fly {

    public Cat(String type, int age) {
        super(type, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    @Override
    public void talk() {
        System.out.println("猫喵喵叫");
    }

    @Override
    public void think() {
        System.out.println("猫思考抓鱼");
    }

    @Override
    public void fly() {
        System.out.println("猫不会飞");
    }
}
