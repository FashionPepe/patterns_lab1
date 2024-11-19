public class Duck{
    private FlyBehaviour flyType;
    private QuackBehaviour quackType;

    public Duck(){
        this.setFlyType(new FlyWithWings());
        this.setQuackType(new Quack());
    }

    public void swim(){
        System.out.println("Я плыву");
    }
    public void display(){
        System.out.println("Я отображена на экране");
    }
    public void performFly(){
        flyType.fly();
    }
    public void performQuack(){
        quackType.quack();
    }

    public void setFlyType(FlyBehaviour flyType) {
        this.flyType = flyType;
    }
    public void setQuackType(QuackBehaviour quackType) {
        this.quackType = quackType;
    }

}