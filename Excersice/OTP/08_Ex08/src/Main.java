public class Main {
    public static void main(String[] args) {
        CardBookManager cardBookManager=new CardBookManager();
        Student student1=new Student("nam",19,"12A");
        Student student2=new Student("hoa",39,"12B");
        Student student3=new Student("hung",29,"12C");
        CardBook cardBook1=new CardBook("MS0001",1,2,"codeBook",student1);
        CardBook cardBook2=new CardBook("MS0003",1,2,"codeBook",student3);
        CardBook cardBook3=new CardBook("MS0002",1,2,"codeBook",student2);
        cardBookManager.add(cardBook1);
        cardBookManager.add(cardBook2);
        cardBookManager.add(cardBook3);
        System.out.println("Original CardBook: ");
        cardBookManager.display();
        System.out.println("CardBook with codeCard=MS0003 has information: ");
        System.out.println(cardBookManager.research("MS0003"));
        System.out.println("------------------------------------------------------------------------------");
        cardBookManager.sortByCodeCard();
        System.out.println("CardBook after sorting: ");
        cardBookManager.display();
        cardBookManager.delete("MS0003");
        System.out.println("CardBook after delete: ");
        cardBookManager.display();
    }
}
