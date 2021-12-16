import java.util.ArrayList;
import java.util.List;

public class AsalSayiBulma {

    public static void main(String[] args) {

        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean flag = true;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                System.out.print(sayi+" ");
            }
        }
    }
}
