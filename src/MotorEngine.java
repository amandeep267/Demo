 class MotorEngine implements Engine{
    MotorEngine ()
    {

    }
    public void on()
    {
        System.out.println("Motor Engine on");

    }

    public void powerOn(int power)
    {
        System.out.println("power on to "+power);
    }
}
