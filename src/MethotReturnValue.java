public class MethotReturnValue {
    public static void main(String[] args) {
        int result = sum(100 ,1000);
        System.out.println(result);
        System.out.println(sum(20,20));
        System.out.println(count(100,"+",200));
        System.out.println(count(200,"-" ,30));
        System.out.println(count(100,"salah",10));
    }
    public static int sum(int value1, int value2){
        int total = 0;
        total = value1 + value2;
        return total;
    }
    public static int count(int values1 ,String oprasi ,int values2){
        switch(oprasi){
            case"+":
                return values1 + values2;
            case "-":
                return  values1 - values2;
            default:
                return 0;
        }
    }
}
