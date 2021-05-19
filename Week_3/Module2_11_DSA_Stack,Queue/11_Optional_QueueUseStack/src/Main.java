import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Record> maleQueue=new LinkedList<>();
        Queue<Record> femaleQue=new LinkedList<>();
        Record record1=new Record("ha",true,23);
        Record record2=new Record("hung",false,15);
        Record record3=new Record("hoa",true,13);
        Record record4=new Record("hue",true,30);
        Record record5=new Record("trung",false,20);
        Record record6=new Record("hong",true,18);
        List<Record> recordList=new ArrayList<>();
        recordList.add(record1);
        recordList.add(record2);
        recordList.add(record3);
        recordList.add(record4);
        recordList.add(record5);
        recordList.add(record6);
        Collections.sort(recordList);
//        recordList.add(record7);
        for (Record record:recordList) {
            System.out.println(record);
        }
        for (Record record:recordList) {
            if (record.isGender()) femaleQue.add(record);
            else maleQueue.add(record);
        }
        System.out.println(maleQueue);
        System.out.println(femaleQue);
        List<Record> outputRecord=new LinkedList<>();

        while (!femaleQue.isEmpty()){
            outputRecord.add(femaleQue.remove());
        }
        System.out.println(femaleQue);
        System.out.println(outputRecord);
        ListIterator<Record> listIterator=outputRecord.listIterator();
        int index=0;
        while ((!maleQueue.isEmpty())){
            Record maleRecord=maleQueue.remove();
            while (listIterator.hasNext()){
                if(listIterator.next().getDateOfBirth()> maleRecord.getDateOfBirth() && listIterator.next().isGender()){
                    index=listIterator.nextIndex()-1;
                    outputRecord.add(index,maleRecord);
                    break;
                }
            }
        }
        System.out.println(outputRecord);
    }
}
