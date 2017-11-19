import java.io.FileNotFoundException;

/**
 * Created by Behrooz on 17/10/2017.
 */
public class DefaultMethodExample {

    public static void main(String[] args) {
        Vehicle vehicle= new Car();
        vehicle.print();

    }

    interface Vehicle {
        default void print() {
            System.out.println("I am a vehicle");
        }
    }

    interface FourWheeler {
        default void print() {
            System.out.println("IFour Wheeler");
        }

    }

    static class Car implements Vehicle, FourWheeler {
        public void print(){
            Vehicle.super.print();
            FourWheeler.super.print();
            System.out.println("I am a Fucking" + this.getClass() );
        }
    }
}
