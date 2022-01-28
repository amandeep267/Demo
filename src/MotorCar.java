 class MotorCar implements Car
{

        private Engine engine;
        MotorCar(Engine engine)
        {
            this.engine=engine;
        }
        public void turnOnEngine()
    {
        engine.on();
    }

        public void accelerate()
    {
        engine.powerOn(1000);
    }

}

