class MyThread extends Thread {
    private String threadName;

    // Constructor to set the thread name
    public MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        // Print thread details
        System.out.println(threadName + " is running. Thread Priority: " + this.getPriority());

        // Simulate some task with a sleep
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Step " + i);
                Thread.sleep(500);  // Simulating work with sleep
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }

        System.out.println(threadName + " has finished.");
    }
}

public class Program57 {
    public static void main(String[] args) {
        // Create two threads with different priorities
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Set priorities for threads (1 is lowest priority, 10 is highest priority)
        thread1.setPriority(Thread.MIN_PRIORITY);  // Set thread1 to minimum priority (1)
        thread2.setPriority(Thread.MAX_PRIORITY);  // Set thread2 to maximum priority (10)

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread continues execution
        System.out.println("Main thread has finished starting the threads.");
    }
}
