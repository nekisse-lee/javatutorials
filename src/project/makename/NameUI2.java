package project.makename;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameUI2
{
    private Scanner scanner;

    Map<String, NameMaker2> makeMap2;

    public NameUI2()
    {
        scanner = new Scanner(System.in);

        makeMap2 = new HashMap<>();

        makeMap2.put("1", new IndianNameMaker2());
        makeMap2.put("2", new AnimalNameMaker2());
        makeMap2.put("3", new MyNameMaker());
    }

    public void makeName() {

        System.out.println("1. Indian, 2......");
        NameMaker2 maker = makeMap2.get(scanner.nextLine().substring(0));

        System.out.println("First data : ");
        String first = maker.getFirst(scanner.nextLine().substring(3));

        System.out.println("Middle data : ");
        String middle = maker.getMiddle(scanner.nextLine());

        System.out.println("Last data : ");
        String last = maker.getLast(scanner.nextLine());

        System.out.println(first+middle+last);

    }

    public static void main(String[] args)
    {
        new NameUI2().makeName();
    }

}
