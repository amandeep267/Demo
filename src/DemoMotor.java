//class voilating solid principles
public class DemoMotor
{ private String pattern;
 MotorEngine engine;
    DemoMotor()
    {
        engine=new MotorEngine();
    }
    public void turnOnEngine()
    {
        engine.on();
    }

    public void accelerate()
    {
        engine.powerOn(1000);
    }
    void ecoMode()
    {
        System.out.println("eco Mode");
    }
    void snowMode()
    {
        System.out.println("snow Mode");
    }
    public String  getPattern()
    {
        return this.pattern;
    }
    public  void setPattern(String pattern)
    {
        this.pattern=pattern;
    }
    public void airBags() {
        System.out.println("This car has air bags");
    }





}

