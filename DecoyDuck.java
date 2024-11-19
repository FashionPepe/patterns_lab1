public class DecoyDuck extends Duck{
    public DecoyDuck(){
        this.setFlyType(new FlyNoWay());
        this.setQuackType(new NoQuack());
    }
    @Override
    public void display(){
        System.out.println("На экране чучело утки");
    }
}
