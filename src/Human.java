public class Human extends Animal implements Eat,Sleep,Think,Talk,Fly{
    public Human(String type, int age) {
        super(type, age);
    }

    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void fly() {
        System.out.println("人坐飞机");
    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");
    }

    @Override
    public void talk() {
        System.out.println("人说话");
    }

    @Override
    public void think() {
        System.out.println("人在思考");
    }
}
