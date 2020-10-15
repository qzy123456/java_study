public class Myplus {
    int plus(int a,int b){
        int s;
        s = a+ b;
        return  s;
    }

    int plus(int a,int b ,int c){
        int s;
        s = a+ b + c;
        return  s;
    }
    int plus(int a,int b ,int c, int d){
        int s;
        s = a+ b +c + d;
        return  s;
    }
    public static void main(String[] args) {
        Myplus s1 = new Myplus();

        System.out.println("调用plus计算1+2的结果为 " + s1.plus(1,2));
        System.out.println("调用plus计算1+2+3的结果为 " + s1.plus(1,2,3));
        System.out.println("调用plus计算1+2+3+4的结果为 " + s1.plus(1,2,3,4));
    }
}