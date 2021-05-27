import java.io.*;
public class DeleteDirectory {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\Admin\\Desktop\\parent\\haha");
        deleteFile(dir);
    }

    private static void deleteFile(File folder) {
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
        } else {
            folder.delete();
            System.out.println("File is delete: " + folder.getAbsolutePath());
        }
    }
}
