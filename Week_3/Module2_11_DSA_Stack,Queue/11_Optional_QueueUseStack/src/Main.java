import javafx.util.converter.DateStringConverter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
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
                if(outputRecord.get(i).getDateOfBirth().compareTo(maleRecord.getDateOfBirth())>=0){
                    outputRecord.add(i,maleRecord);
                    break;
                }
            }
        }
        System.out.println("---------------------------Record after merging male & female--------------------------");
        for (Record record:outputRecord) {
            System.out.println(record);
        }

        Date a = new Date(2021-1900,12-1,1);
        Date b = new Date(2021,11,31);
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String dateString=formatter.format(a);
        System.out.println(a);
        System.out.println(dateString);

        LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);
        System.out.println("localdate = "+localDate2);
        LocalDate localDate=LocalDate.of(2021,9,30);
        System.out.println(localDate);

    }
}
