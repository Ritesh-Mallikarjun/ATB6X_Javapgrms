package ATB_6X_May.Collections;

public class Lab097 {
    public static void main(String[] args) {
        Thread t= new Thread();
        System.out.println(t.getName()+" - "+t.getThreadGroup());
        System.out.println(t.currentThread().getState());
        System.out.println(t.currentThread().getPriority());
        System.out.println(Thread.activeCount());
        System.out.println("The state of thread t before invoking the method start() on it - "+t.getState());
        t.start();
        System.out.println("The state of thread t after invoking the method start() on it - " + t.getState());
        t.run();
        System.out.println("The state of thread t after invoking the method run() on it - " + t.getState());
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
        System.out.println(t.isVirtual());
        System.out.println(t.threadId());
        System.out.println(t.toString());

    }
}
