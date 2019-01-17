import com.qmulux.development.MyThread;
import com.qmulux.development.MyUtilTool;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyUtilTool myUtilTool=new MyUtilTool();
        myUtilTool.SayHello();

        MyThread myThread=new MyThread();
        myThread.run();

        while(true);
    }
}
