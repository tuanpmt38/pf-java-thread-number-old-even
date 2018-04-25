package thread;

public class EvenThread extends Thread {

    public EvenThread (String name){
        super(name);
    }

    public synchronized void run (){
        System.out.println(getName());
        try{
            for(int i = 0;i < 10; i++){
                if( i %2 != 0){
                    System.out.print(" "+ i);
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
