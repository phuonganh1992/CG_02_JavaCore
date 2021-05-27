import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
//        Demo demo = new Demo();
        File dir = new File("C:\\Users\\Admin\\Desktop\\parent\\haha");
//        System.out.println(dir.exists());
//        FileReader fileReader=new FileReader(dir);
        deleteFile(dir);

    }

    private static void deleteFile(File folder) {
//        String[] fileList = folder.list();
//        System.out.println(fileList[0]);
//        System.out.println(fileList[1]);
//        File filedeletetest=new File(folder, fileList[0]);
//        System.out.println(filedeletetest);
        if (folder.isDirectory()) {
            if (folder.list().length == 0) {
                folder.delete();
                System.out.println("Directory is deleted: " + folder.getAbsolutePath());
            } else {
                String[] fileList = folder.list();
                for (String temp : fileList) {
                    File fileDelete = new File(folder, temp);
                    deleteFile(fileDelete);
                }
                if (fileList.length == 0) {
                    folder.delete();
                    System.out.println("Directory is deleted: " + folder.getAbsolutePath());
                }
            }
        }else {
            folder.delete();
            System.out.println("File is delete: " + folder.getAbsolutePath());
        }
    }
}
