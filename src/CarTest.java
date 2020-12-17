public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();
        Car car1=new Car("奥迪");
        Car car=new Car("宾利",5);
        car.setDriverName("张三");
        car.setDriverSex("男");
        car.setCarNum("陕A0802");

        Car.Passenger pass1=new Car.Passenger("李四","男",34);
        Car.Passenger pass2=new Car.Passenger("王五","男",20);
        Car.Passenger pass3=new Car.Passenger("丽丽","女",22);

        car.upOnePass(pass1);
        car.upOnePass(pass2);
        car.upOnePass(pass3);
        System.out.println("当前人数"+car.getCurrentCount());
        car.downOnePass(pass1);
        car.downOnePass(pass3);
        System.out.println("当前人数"+car.getCurrentCount());

        car.print();
    }
}
