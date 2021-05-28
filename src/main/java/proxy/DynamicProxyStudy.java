package proxy;


public class DynamicProxyStudy {
    static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (flag) {
                System.out.print("hahaaha");
            }
        });
        t.start();
        Thread.sleep(10000);
        flag = false;
    }


}
