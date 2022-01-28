class FlamePatternCar extends MotorCar{
    private String pattern;

    FlamePatternCar(Engine engine) {
        super(engine);
    }

   public String  getPattern()
    {
        return this.pattern;
    }
 public  void setPattern(String pattern)
    {
        this.pattern=pattern;
    }

}
