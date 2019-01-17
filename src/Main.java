import com.qmulux.development.MyThread;
import com.qmulux.development.MyThreadRunnable;
import com.qmulux.development.MyUtilTool;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyUtilTool myUtilTool=new MyUtilTool();
        myUtilTool.SayHello();

//        MyThreadRunnable myThreadRunnable=new MyThreadRunnable();
//        myThreadRunnable.run();
//        //myThreadRunnable.start();
//
//        MyThread myThread=new MyThread();
//        myThread.start();

        while(true);
    }
}
