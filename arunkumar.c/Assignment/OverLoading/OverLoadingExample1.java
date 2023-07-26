class OverLoadingExample1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2)); // method with two parameter is called
        System.out.println(calculator.add(2,3,4)); // method with three parameter is called
    }
}
class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3) {
        return num1+num2+num3;
    }

}