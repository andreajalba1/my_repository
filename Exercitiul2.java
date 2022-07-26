public class Exercitiul2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0;i<=5;i++){
            sum+=i;

        }

        System.out.println(sum);

        int i2 = 0;
        int sum2 = 0;
        while (i2<=5){
            sum2+=i2;
            i2++;
        }
        System.out.println(sum2);

        int i3 = 0;
        int sum3 = 0;

        do {
            sum3+=i3;
            i3++;
        }
        while(i3<=5);
        System.out.println(sum3);


    }
}
