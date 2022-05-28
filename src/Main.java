public class Main {
    public static void main(String[] args) {
        int [] a = new int [3];
        a [0] = 1;
        a [1] = 2;
        a [2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int [] c = {10, 20, 30, 40, 50};
        for (int i = 0; i<a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a [i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        for (int i = 0; i<b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b [i]);
            } else {
                System.out.print(b [i] + ", ");
            }
        }
        for (int i = 0; i<c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c [i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
        // Вывод массива наоборот
        for (int i = a.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a [i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        for (int i = b.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b [i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        for (int i = c.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(c [i]);
            } else {
                System.out.print(c [i] + ", ");
            }
        }
        // Задание 4
        int [] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int i = 0; i<d.length; i++) {
            if (d[i] % 2 != 0) {
                d[i]++;
                System.out.println(d[i]);
            } else {
                System.out.println(d[i]);
            }
        }






    }
}



