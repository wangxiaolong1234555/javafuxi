import java.util.Scanner;

//����
public class ScannerTest {
    public static void main(String[] args) {
        //2.��������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        //3. ��������
        int number1= sc.nextInt();
        System.out.println("������ڶ�������");
        //�ٴν��յ�2������
        int number2=sc.nextInt();
        System.out.println(number1+number2);
    }
}
