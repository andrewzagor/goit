package EnterpriseModule3;

/**
 * Created by ZahornyiAI on 26.07.2016.
 */

//Есть несколько философов, но за круглым столом находится только пять тарелок и пять вилок.
//И надо, чтобы все философы пообедали, но при этом не возникло взаимоблокировки философами друг друга в борьбе за тарелку и вилку:
public class ThreadsApp {

    public static void main(String[] args) {
        Semaphore sem = new PhilosophySemaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }
}
