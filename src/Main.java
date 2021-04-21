import com.company.Car;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car(100,"Audi","A123");


        Car c2 = new Car(10,"Mercedes","M123");


        c2.drive();
        System.out.println(c2.fuelAmount);




    }
}
