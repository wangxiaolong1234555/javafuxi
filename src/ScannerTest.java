import java.util.Scanner;

//导包
public class ScannerTest {
    public static void main(String[] args) {
        //2.创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        //3. 接收数据
        int number1= sc.nextInt();
        System.out.println("请输入第二个数字");
        //再次接收第2个数据
        int number2=sc.nextInt();
        System.out.println(number1+number2);
    }
}
