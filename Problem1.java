import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<Double>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i=0; i<10; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for(Double num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<Double> list) {
        Collections.sort(list);
    }
}
