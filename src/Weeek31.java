public class Weeek31 {
    static class ThreadDemo extends Thread{
        private int time ;
        public ThreadDemo(String name,int time){
            super(name);
            this.time = time;
        }
        public void run(){
            try{
                Thread.sleep(this.time);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程，休眠"+this.time+"毫秒。");
        }
    }
    public static class ExecDemo{
        public static void main(String[] args){
            ThreadDemo mt1 =new ThreadDemo("线程A",100);
            ThreadDemo mt2 =new ThreadDemo("线程B",200);
            ThreadDemo mt3 =new ThreadDemo("线程C",300);
            mt1.start();
            mt2.start();
            mt3.start();
        }
    }
}
