package thread;

public class OldThread extends Thread {

    public OldThread (String name){
        super(name);
    }

    public synchronized void run (){
        System.out.println(getName());
        try{
            for(int i = 0;i < 10; i++){
                if( i %2 != 0){
                    System.out.print(" "+ i);
                    Thread.sleep(500);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
