package JavaThread.Ticket;

public class TicketThread extends Thread{
    //private int ticket = 5;
    private static int ticket = 5;


    @Override
    public void run() {
        for (int i = 0 ;i<100;i++){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"剩余票数"+ticket--);
            }
        }
    }

    public static void main(String[] args) {

        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        TicketThread t5 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
