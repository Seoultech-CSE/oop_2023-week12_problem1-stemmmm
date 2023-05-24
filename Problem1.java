import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i=0; i<10; i++) {
            String num = input.next();
            list.add(num);
        }

        sort(list);

        for(String num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<String> list) {
        list.sort((a, b) -> Double.compare(Double.parseDouble(a), Double.parseDouble(b)));
    }
}
