import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        NumbersCheck numbersCheck = new NumbersCheck();
//        boolean good = numbersCheck.verify(a,b,c);
//        if (good) {
//            System.out.println("Unul din numere este suma celorlalte");
//        } else {
//            System.out.println("Nu sunt bune :)");
//        }



//
//        Person p = new Person();
//        p.name = "Bogdan";
//        p.age = 29;
//
//        Person p2 = new Person();
//        p2.name = "Bogdan";
//        p2.age = 29;
//
//        System.out.println(p);

        List<String> names = new ArrayList<String>();
        names.add("Maria");
        names.add("Maria");
        names.add("Gabi");
        names.add("Andreea");

        System.out.println(names);

        HashMap<String, Integer> counters = new HashMap<String, Integer>();
        for (String x: names) {
            if (counters.get(x)==null) {
                counters.put(x, 1);
            }
            else {
                int c = counters.get(x);
                c++;
                counters.put(x,c);
            }
        }
        System.out.println(counters);
    }
}
