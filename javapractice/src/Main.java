public class Main {
    public void fullThrottle();{
        System.out.println("The car is moving very fast");
    }
    public void speed(int maxSpeed);{
        System.out.println("The max speed is  "+maxSpeed);
    }
    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(120);
    }
}
