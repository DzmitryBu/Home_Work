package atomic;

public class AtomicTestWithoutAtomic implements Runnable{
    private Integer counter = 0;
    public void run() {
        for (int i = 0; i < 5_000; i++) {
            counter++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        AtomicTestWithoutAtomic atomicTest = new AtomicTestWithoutAtomic();
        Thread thread1 = new Thread(atomicTest);
        Thread thread2 = new Thread(atomicTest);
        thread1.start();
        thread2.start();

        //ждем секунду, чтобы дождаться завершения потоков, а потом напечатать результат
        Thread.sleep(1000);

        System.out.println(atomicTest.counter);
    }
}
