public class Car implements Vehicle {
    public void changeGear(int a) {
        System.out.println("The car changed gear to: " + a);
    }
    public void speedUp(int a) {
        System.out.println("The car speeded up to " + a);
    }
    public void applyBrakes(int a) {
        System.out.println("The car didn't apply brakes " + a);
    }
}
