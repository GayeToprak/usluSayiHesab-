import java.util.Scanner;

public class usHesabi {
    static int result = 1;

    static int us(int x, int y) {
        if(x == 0){
            return 1;
        }
        result *= y;
        us((x-1),y);
        return result;
    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int x , y;
        System.out.print("tabandaki sayıyı giriniz:");
        x = inp.nextInt();
        System.out.print("üstteki sayıyı giriniz:");
        y = inp.nextInt();

        System.out.println(us(x , y));

    }
}
