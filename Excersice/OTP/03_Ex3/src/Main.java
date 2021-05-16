import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Enrollment enrollment=new Enrollment();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    switch (chooseType()){
                        case "a":
                            System.out.println("Enter information candidate ");
                            Candidate candidateA=new CandidateA();
                            candidateA.input();
                            enrollment.add(candidateA);
                            break;
                        case "b":
                            System.out.println("Enter information candidate ");
                            Candidate candidateB=new CandidateB();
                            candidateB.input();
                            enrollment.add(candidateB);
                            break;
                        case "c":
                            System.out.println("Enter information candidate ");
                            Candidate candidateC=new CandidateC();
                            candidateC.input();
                            enrollment.add(candidateC);
                            break;
                    }
                    break;
                case 2:
                    enrollment.display();
                    break;
                case 3:
                    System.out.print("Enter id of candidate: ");
                    sc.nextLine();
                    String id=sc.nextLine();
                    Candidate findCandidate=enrollment.find(id);
                    System.out.println("The result of search: ");
                    System.out.println(findCandidate);

                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }while (choice>=1 && choice<=4);


    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new candidate");
        System.out.println("2. Display candidate");
        System.out.println("3. Find candidate");
        System.out.println("4. Exit");
    }
    static String chooseType(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: candidate A");
        System.out.println("Enter b: candidate B");
        System.out.println("Enter c: candidate C");
        System.out.print("Enter your type: ");
        return sc.nextLine();
    }

}
