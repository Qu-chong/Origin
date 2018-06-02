/*import java.util.Scanner;

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
*/
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Week2 {
    public void beginGame(){
        int randNum = (int)(Math.random()*100);
        //生成的随机数
        int scoer = 1;
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入数字: ");

            scanner = new Scanner(System.in);
            int userNum=scanner.nextInt();
            //读取数字

            if(userNum > randNum)
                System.out.println("数值过大");
            else if(userNum < randNum)
                System.out.println("数值过小");
            else {
                System.out.println("正确, 游戏结束");
                break;
            }
            scoer +=1;
        }
        int n =0;
        arr[n] = scoer;
        n++;
        Arrays.sort(arr);
        System.out.println("猜测次数："+scoer);
        System.out.println("是否继续：(继续就输入0)");
        int m = scanner.nextInt();
        if(m == 0)
        {
            beginGame();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Week2 demo = new Week2();
        demo.beginGame();
    }

}
