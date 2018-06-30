public class lesson9 {
    public static void main(String[] args) {
        /*int A = 1, B = 11;
        for (int i = A; i < B; i++) {
            for (int j = A; j < B; j++) {
                System.out.print(i + "*" + j + "=" + i * j);
                System.out.println();
            }
        }*/
        /*int A = -1, B = 6;
        for (int i = A; i < B; i++)
            System.out.println(func(i));
    }
    public static int func(int A) {
        switch (A) {
            case 1: A++;
                break;
            case 2: A *= 2;
                break;
            case 3: A *= 4;
                break;
            case 4: A /= 2;
                break;
            default:
                A = 0;
        }
        return A; */
   /* Task3();*/
        arifSum(1,1,10);
        System.out.println(arifSum(1,2,10));
    }
       /* public static void Task3() {
            int A = 1, B = 51;
            for (int i = A; i < B; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + " делится на 3");
                }
                if (i % 5 == 0) {
                    System.out.println(i + " делится на 5");
                }
            }

        }*/
       public static int arifSum(int a1, int d, int n) {
           int sum = 0;
           for (int i = 1, a = a1; i <= n; i++, a+=d) {
               sum += a;
           }
           return sum;
       }

}
