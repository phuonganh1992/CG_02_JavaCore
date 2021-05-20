import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Record> maleQueue=new LinkedList<>();
        Queue<Record> femaleQue=new LinkedList<>();

        RecordManager recordManager=new RecordManager();

        Collections.sort(recordManager.records);

        for (Record record:recordManager.records) {
            System.out.println(record);
        }

//        System.out.println(recordList);
//
//        for (Record record:recordList) {
//            if (record.isGender()) femaleQue.add(record);
//            else maleQueue.add(record);
//        }
//
//        List<Record> outputRecord=new LinkedList<>();
//
//        while (!femaleQue.isEmpty()){
//            outputRecord.add(femaleQue.remove());
//        }
//
//        while ((!maleQueue.isEmpty())){
//            Record maleRecord=maleQueue.remove();
//            for(int i=0;i<outputRecord.size();i++){
//                if(outputRecord.get(i).getDateOfBirth()> maleRecord.getDateOfBirth() ){
//
//                    outputRecord.add(i,maleRecord);
//                    break;
//                }
//            }
//        }
//        for (Record record:outputRecord) {
//            System.out.println(record);
//        }
//        System.out.println(outputRecord);
    }
}
