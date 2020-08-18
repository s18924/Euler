import java.util.*;

public class P_076 {
    public static void main(String[] args) {
        //printPossibleSums(100).forEach(System.out::println);
        List<List<Integer>> numberList = printPossibleSums(6);
        numberList.forEach(Collections::sort);

        List<List<Integer>> numberListNoRepeats = new LinkedList<>();

        for (List<Integer> integers : numberList) {
            if(!numberListNoRepeats.contains(integers)) {
                numberListNoRepeats.add(integers);
            }
        }
        System.out.println(numberListNoRepeats.size());

        numberListNoRepeats.forEach(Collections::reverse);
        numberListNoRepeats.forEach(System.out::println);

    }

    static private List<List<Integer>> printPossibleSums(int number) {
        List<List<Integer>> numberList = new LinkedList<>();

        numberList.add(new LinkedList<>());
        numberList.get(0).add(number - 1);
        numberList.get(0).add(1);

        int tmp = 1;

        while (!isNumberFactored(numberList.get(numberList.size() - 1))) {
           // System.out.println("Ile mam rozwiązań = " + numberList.size());
            //numberList.forEach(o-> System.out.println(">>" + o));
         //   System.out.println("_______________________");
          /*  if (tmp++ == 10)
                System.exit(1);
*/
            List<Integer> nextWayToFactor = new LinkedList<>(numberList.get(numberList.size() - 1));

         //   System.out.print("Podciąg :>");
            if (isNumberFactored(nextWayToFactor.subList(1, nextWayToFactor.size()))) {
            //    System.out.println("BEFORE " + nextWayToFactor);
                int notFactored = nextWayToFactor.get(0);
                nextWayToFactor = new LinkedList<>();
                nextWayToFactor.add(notFactored-1);
                nextWayToFactor.add(number-nextWayToFactor.get(0));
             //   System.out.println("AFTER " + nextWayToFactor + "\n");
                numberList.add(nextWayToFactor);
                continue;
            }

         //   System.out.println(", moving...");
            for (int i = 1; i < nextWayToFactor.size(); i++) {
                if (nextWayToFactor.get(i) > 1) {
                    int notFactored = nextWayToFactor.get(i);
                    nextWayToFactor.remove(i);
                    nextWayToFactor.add(notFactored - 1);
                    nextWayToFactor.add(1);
                    break;
                }
            }
         //   System.out.println("Adding new result: " + nextWayToFactor);
            numberList.add(nextWayToFactor);

        }


        return numberList;

    }

    private static boolean isNumberFactored(List<Integer> numberList) {

        boolean isFactored = true;
        for (Integer integer : numberList) {
            if (integer != 1) {
                isFactored = false;
                break;
            }
        }
      //  System.out.println(numberList + " " + isFactored);
        return isFactored;
    }
}
