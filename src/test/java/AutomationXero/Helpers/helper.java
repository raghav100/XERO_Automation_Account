package AutomationXero.Helpers;

public class helper {

    public static void Sleep(int time) {

        try {
            Thread.sleep(time*1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }


    }
}
