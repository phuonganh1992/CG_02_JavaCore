import java.util.List;

public class RandomListFacade {
    void printRandomEvenList(){
        RandomList randomList=new RandomList();
        ListFilter listFilter=new ListFilter();
        ListPrinter listPrinter=new ListPrinter();

        List<Integer> numbers= randomList.generateList(20,0,100);
        System.out.println("----------------list-----------------------");
        listPrinter.printList(numbers);
        System.out.println();

        List<Integer> oddNumbers= listFilter.filterOdd(numbers);
        System.out.println("---------------list even-------------------");
        listPrinter.printList(oddNumbers);
    }
}
