public class RubberDuck extends Duck {
    public RubberDuck(){
        this.setFlyType(new FlyNoWay());
        this.setQuackType(new Squeck());
    }
    @Override
    public void display(){
        System.out.println("На экране резиновая уточка");
    }
}
