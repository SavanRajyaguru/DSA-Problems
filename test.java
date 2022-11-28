
public class test{
    public static void main(String[] args) {
       int[][] arr = {  {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1}};
        int row = arr.length;
        int ans = 0;

        for(int i=0; i<row; i++){
            ans += arr[i][i];
        }
        int j = 0;
        for(int i=row-1; i>=0; i--){ 
            if(i == j){
                j++;
                continue;
            }
            ans += arr[j][i];
            j++;
        }
        System.out.println(ans);
    }
}
