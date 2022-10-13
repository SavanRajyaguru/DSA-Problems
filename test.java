public class test {
    
    protected static void print(int n){
        int i = 1;
        if(n < i)
            return ;
        print(n-1);
        System.out.println(n);
    } 
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
