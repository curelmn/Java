public class Car {
    private String driverName;
    private String driverSex;
    private String brand;
    private String carNum;
    private int carMaxCount;
    private Passenger[] passList;
    private int currentCount;
    public void setDriverName(String driverName){
        this.driverName=driverName;
    }
    public String getDriverName(){
        return driverName;
    }
    public  void setDriverSex(String driverSex){
        this.driverSex=driverSex;
    }
    public String getDriverSex(){
        return driverSex;
    }
    public void  setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void  setCarNum(String carNum){
        this.carNum=carNum;
    }
    public  String getCarNum(){
        return  carNum;
    }
    public void  setCarMaxCount(int carMaxCount){
        this.carMaxCount=carMaxCount;
    }
    public int getCarMaxCount(){
        return  carMaxCount;
    }
    public void setCurrentCount(int  currentCount){
        this.currentCount=currentCount;
    }
    public int getCurrentCount(){
        return  currentCount;
    }
    public void setPassList(Passenger[] passList){
        this.passList=passList;
    }
    public Passenger[] getPassList(){
        return  passList;
    }
     //构造方法（无参）
    public Car(){
        System.out.println("无参："+"汽车");
    }
    //有参
    public Car(String brand){
        System.out.println("有参:"+brand+"汽车");
    }
    //有参
    public Car(String brand,int carMaxCount){
        this.setBrand(brand);
        this.setCarMaxCount(carMaxCount);
        passList=new Passenger[carMaxCount];
    }
    //上车
    public void  upPass(Passenger[] upPassList){
        for(int i=0;i<upPassList.length;i++){
            upOnePass(upPassList[i]);
        }
    }
    public void upOnePass(Passenger pass){
        if(currentCount==carMaxCount){
            System.out.println("车已满");
        }else{
            currentCount++;
            for(int j=0;j<passList.length;j++){
                if(passList[j]==null){
                    passList[j]=pass;
                    System.out.println(pass.getPassName()+"已经上车");
                    break;
                }
            }
        }
    }
    //下车
    public void downOnePass(Passenger pass){
        for(int i=0;i<passList.length;i++){
            if(passList[i]!=null){
                if(passList[i].equals(pass)){
                    passList[i]=null;
                    System.out.println(pass.getPassName()+"已下车");
                    break;
                }
            }
        }
    }
    public void downPass(Passenger[] downPassList){
        for(int i=0;i<downPassList.length;i++){
            downOnePass(downPassList[i]);
        }
    }
    public void print(){
        System.out.println("属性：");
        System.out.println("driverName:"+getDriverName());
        System.out.println("driverSex:"+getDriverSex());
        System.out.println("brand:"+getBrand());
        System.out.println("carNum:"+getCarNum());
        System.out.println("carMaxCount:"+getCarMaxCount());
    }
    public static class Passenger{
        private  String passName;
        private  String passSex;
        private int age;
        public void setPassName(String passName){
            this.passName=passName;
        }
        public String getPassName(){
            return passName;
        }
        public void setPassSex(String passSex){
            this.passSex=passSex;
        }
        public  String getPassSex(){
            return passSex;
        }
        public void  setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return  age;
        }
        public Passenger(String passName,String passSex,int age){
            setPassName(passName);
            setPassSex(passSex);
            setAge(age);
        }
    }
}
