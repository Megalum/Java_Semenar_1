public class exp1 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));

        int[] mas = numbers();
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == 0)
                break;
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        float a = 33f, b = 3f;
        System.out.println(calc(a, b, '+'));
        System.out.println(calc(a, b, '-'));
        System.out.println(calc(a, b, '*'));
        System.out.println(calc(a, b, '/'));

        String s = "?2 + 5? = 69";
        calc_logic(s);
    } 
    

    public static int fact(int n){
        int out = 1;
        for (int i = 1; i <= n; i++){
            out *= i;
        }
        return out;
    }

    public static int[] numbers(){
        int[] out = new int[1000];
        int k = 0;
        boolean flag;
        for (int i = 2; i < 1000; i++){
            flag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                out[k++] = i;
            }
        }
        return out;
    }

    public static float calc(float a, float b, char c){
        if (c == '+')
            return a + b;
        else if (c == '-')
            return a - b;
        else if (c == '/')
            return a / b;
        else if (c == '*')
            return a * b;
        else
            return 0;
    }

    public static void calc_logic(String s){
        System.out.print(s + " => ");
        String[] mas = s.split(" ");       
        String k = "";
        for (int i = 0; i < mas.length; i = i + 2){
            for (int j = 0; j < mas[i].length(); j++){
                if (mas[i].charAt(j) == '?'){
                    k += i;
                    break;
                }
            }
        }      
        int a = 0, b = 0, c = 0;
        switch (k){
            case "0":
                b = Integer.parseInt(mas[2]);
                c = Integer.parseInt(mas[4]);
                if (c > b){
                    a = c - b;
                    System.out.println(a + " + " + b + " = " + c);
                }
                else
                    System.out.println("None!");
            break;
            case "2":
                a = Integer.parseInt(mas[0]);
                c = Integer.parseInt(mas[4]);
                if (c > a){
                b = c - a;
                System.out.println(a + " + " + b + " = " + c);
                }
                else
                    System.out.println("None!");
            break;
            case "02":
                c = Integer.parseInt(mas[4]);
                a = c / 2;
                b = c - a;
                System.out.println(a + " + " + b + " = " + c);
            break;
            case "4":
                a = Integer.parseInt(mas[0]);
                b = Integer.parseInt(mas[2]);
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
            break;
            default:
                System.out.println("Error!");
            break;
        }
    }
}