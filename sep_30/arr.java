public class arr {
    
}

class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40};
        int[] b = {5,15,25,35};
        sol(a,b,-1,true,0,0,"");
        
    }
    public static void sol(int[] a, int[] b, int lv, boolean flag, int la, int lb, String ans){
        if(flag == true && ans.length() > 0){
            System.out.println(ans);
        }
        if(flag){
            for(int i=la; i<a.length; i++){
                if(a[i] > lv){
                    sol(a,b,a[i],false,i+1,lb,ans+a[i]+" ");
                }
            }
        }
        else{
            for(int i=lb; i<b.length; i++){
                if(b[i] > lv){
                    sol(a,b,b[i],true,la,i+1,ans+b[i]+" ");
                }
            }
        }
    }
}
