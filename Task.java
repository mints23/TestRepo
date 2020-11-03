import java.util.concurrent.TimeUnit;

public class Task implements Runnable , Comparable {
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Executing : " + name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	@Override
	public int compareTo(Object var1) {
		// TODO Auto-generated method stub
		return 0;
	}
}