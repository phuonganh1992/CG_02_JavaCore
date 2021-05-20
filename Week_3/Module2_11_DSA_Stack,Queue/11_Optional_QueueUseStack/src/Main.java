import java.util.*;

public class Main {
    public static void main(String[] args) {
        RecordManager recordManager=new RecordManager();
        Queue<Record> maleQueue=new LinkedList<>();
        Queue<Record> femaleQue=new LinkedList<>();
        List<Record> outputRecord=new LinkedList<>();
        System.out.println("------------------Record after sorting date of birth");
        Collections.sort(recordManager.records);

        for (Record record:recordManager.records) {
            System.out.println(record);
        }

        for (Record record:recordManager.records) {
            if (record.isGender()) femaleQue.add(record);
            else maleQueue.add(record);
        }

        while (!femaleQue.isEmpty()){
            outputRecord.add(femaleQue.remove());
        }

        while ((!maleQueue.isEmpty())){
            Record maleRecord=maleQueue.remove();
            for(int i=0;i<outputRecord.size();i++){
                if(outputRecord.get(i).getDateOfBirth()> maleRecord.getDateOfBirth() ){
                    outputRecord.add(i,maleRecord);
                    break;
                }
            }
        }
        System.out.println("---------------------------Record after merging male & female--------------------------");
        for (Record record:outputRecord) {
            System.out.println(record);
        }
//        System.out.println(outputRecord);
    }
}
