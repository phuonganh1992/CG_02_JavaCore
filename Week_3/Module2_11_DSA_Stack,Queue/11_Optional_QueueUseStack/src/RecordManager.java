import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordManager {
    public List<Record> records;

    public RecordManager() {
        this.records = new ArrayList<>();
        Record record1=new Record("ha",true,new Date(1992,31,7));
        Record record2=new Record("hung",false,new Date(1995,3,18));
        Record record3=new Record("hoa",true,new Date(1999,10,16));
        Record record4=new Record("hue",true,new Date(1989,7,25));
        Record record5=new Record("trung",false,new Date(1989,5,29));
        Record record6=new Record("hong", true,new Date(1997,3,10));
        Record record7=new Record("nam", false,new Date(1984,3,18));
        Record record8=new Record("phong", false,new Date(1989,7,25));
        Record record9=new Record("chuong", false,new Date(1999,1,1));
        Record record10=new Record("chau", true,new Date(1999,2,18));
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
