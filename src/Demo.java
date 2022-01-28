public class Demo {
    public static void main(String arg[])
    {
        Car car=new MotorCar(new MotorEngine());
        car.turnOnEngine();
        car.accelerate();

        CarMode mode=new CarMode();
        mode.ecoMode();
        Car car1=new FlamePatternCar(new MotorEngine());
        ((FlamePatternCar) car1).setPattern("CoolFlamePattern");
        ;

    }
}
