import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        Car c1 = new Car(4000, 120, 20, new DryBrakingModel(), 5);
        Car c2 = new Car(3000, 150, 15, new DryBrakingModel(), 4);
        Truck t1 = new Truck(20000, 300, 100, new DryBrakingModel(), 200);
        Truck t2 = new Truck(25000, 450, 90, new DryBrakingModel(), 1500);

        Car c3 = new Car(4000, 120, 20, new WetBrakingModel(), 5);
        Car c4 = new Car(3000, 150, 15, new WetBrakingModel(), 4);
        Truck t3 = new Truck(20000, 300, 100, new WetBrakingModel(), 200);
        Truck t4 = new Truck(25000, 450, 90, new WetBrakingModel(), 1500);

        list1.add(c1);
        list1.add(t1);
        list1.add(c2);
        list1.add(t2);

        System.out.println(list1);
        list2.add(c3);
        list2.add(c4);
        list2.add(t3);
        list2.add(t4);
        System.out.println(list2);

        Collections.sort(list1, new BrakingComparator());
        System.out.println(list1);

        Collections.sort(list2, new BrakingComparator());
        System.out.println(list2);

        System.out.println(c1.getSpeedMph());
        System.out.println(t2.getSpeedMph());
    }//end of main
}//end of Test
