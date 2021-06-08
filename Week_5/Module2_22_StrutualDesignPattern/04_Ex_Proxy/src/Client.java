import java.io.File;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy=new FileDownloaderProxy("https://icdn.dantri.com.vn/thumb_w/660/2021/06/08/vu-han-1623123074847.jpg",new File("vu.jpeg"));
        fileDownloaderProxy.download();
    }
}
