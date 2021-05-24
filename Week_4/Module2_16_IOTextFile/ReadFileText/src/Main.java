import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file=new File("foo.txt");
        File dir=new File("Books");
        dir.mkdir();
        if(dir.isDirectory()){
            String[] dirContents=dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }
        System.out.println(dir.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
        boolean isDelete=file.delete();
        System.out.println(isDelete);
//        boolean isDeleteDir= dir.delete();
//        System.out.println(isDeleteDir);

    }
}
