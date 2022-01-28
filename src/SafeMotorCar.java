class SafeMotorCar extends MotorCar implements Safety{

    SafeMotorCar(Engine engine) {
        super(engine);
    }

    @Override
    public void airBags() {
        System.out.println("This car has air basg");

    }
}
