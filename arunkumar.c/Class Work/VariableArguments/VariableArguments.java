public class VariableArguments{
    public static void main(String[] args) {
        System.out.println(new VariableArguments().sum(1,2,3,4,5,6,7));
    }
    public int sum(int... a){
        int sum = 0;
        for(int c : a){
            sum+=c;
        }
        return sum;
    }
}
