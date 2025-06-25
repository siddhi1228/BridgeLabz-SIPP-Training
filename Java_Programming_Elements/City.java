package immersion.Java_Programming_Elements;
import java.util.*;
public class City {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
        double fromToVia = sc.nextDouble();
        double viaToFinalCity = sc.nextDouble();
        int timeFromToVia = sc.nextInt();
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes");
    }
}
