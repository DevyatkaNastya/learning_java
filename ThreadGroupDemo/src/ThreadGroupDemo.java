public class ThreadGroupDemo {
    public static void main (String args[]) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        System.out.println("\nOutput list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("interrupted group A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);

        for(int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Start Group A");

        for(int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myresume();
        }

        try {
            System.out.println("Waiting to terminate threads");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in main thread");
        }
        System.out.println("Main thread is terminated.");
    }
}
