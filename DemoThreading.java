
class A implements Runnable{
    public void run(){
        System.out.println("Hi");
        try{Thread.sleep(10);} catch(InterruptedException e){ System.out.println("Cought" + e);}
    }
}


class B implements Runnable{
    public void run()
    {
        for(int i=1; i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Cought" + e);
            }
        }
    }
    
}

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}


public class DemoThreading {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = () -> {
            for(int i=1; i<=5;i++){
                System.out.println("hi");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    System.out.println("Cought" + e);
                }
            }
        
    };
    
    Runnable obj2 = () -> {
        for(int i=1; i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Cought" + e);
            }
        }    
};

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    
    t1.start();
    t2.start();

    
    Counter c = new Counter(); 
    Runnable inc1 = () -> {
        for(int i=1; i<=10000; i++)
            c.increment();
    };
    Runnable inc2 = () -> {
        for(int i=1; i <= 10000; i++)
            c.increment();
    };

    Thread ti1 = new Thread(inc1);
    Thread ti2 = new Thread(inc2);
    ti1.start();
    ti2.start();
    ti1.join();
    ti2.join();
    System.out.println(c.count);


    } 
}
