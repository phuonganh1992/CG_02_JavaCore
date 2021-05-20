import java.util.ArrayList;
import java.util.List;

public class RecordManager {
    public List<Record> records;

    public RecordManager() {
        this.records = new ArrayList<>();
        Record record1=new Record("ha",true,23);
        Record record2=new Record("hung",false,13);
        Record record3=new Record("hoa",true,50);
        Record record4=new Record("hue",true,30);
        Record record5=new Record("trung",false,20);
        Record record6=new Record("hong", true,40);
        Record record7=new Record("nam", false,36);
        Record record8=new Record("phong", false,40);
        Record record9=new Record("chuong", false,28);
        Record record10=new Record("chau", true,37);
        records.add(record1);
        records.add(record2);
        records.add(record3);
        records.add(record4);
        records.add(record5);
        records.add(record6);
        records.add(record7);
        records.add(record8);
        records.add(record9);
        records.add(record10);
    }
}
