class ElectronicEngine  implements Engine{

    @Override
    public void on() {
        System.out.println("Turning on electronic engine");
    }

    @Override
    public void powerOn(int power) {
        System.out.println("Power :"+power);

    }

}
