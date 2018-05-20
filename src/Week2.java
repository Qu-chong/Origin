import java.util.Scanner;

public class Week2 {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        int number = (int)(Math.random()*100+1);
        int a , count = 0 ;
        System.out.println("游戏即将开始！请输入你的数字：\n");
        do {
            a = in.nextInt();
            count = count +1;
            if(a > number)
            {
                System.out.println("偏大!请再来一次！");
            }
            else if(a < number) {
                System.out.println("偏小!请再来一次！");
        }
        }while(a!= number);
        System.out.println("恭喜你，猜对了！一共用了"+count+"次");
    }
}
