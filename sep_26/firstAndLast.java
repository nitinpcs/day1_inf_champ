import java.util.ArrayList;

class firstAndLast {
    public static void main(String[] args) {
        firstAndLast obj=new firstAndLast();
        int[] arr={5,7,7,8,8,10};
        int x=8;
        ArrayList<Integer> res=obj.find(arr,x);
        System.out.println(res);
    }
    public static int first(int[] arr,int x){
    int start=0,end=arr.length-1,ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==x){
            ans=mid;
            end=mid-1;
        }
        else if(arr[mid]<x) start=mid+1;
        else end=mid-1;
    }
    return ans;
    }
    public static int last(int[] arr,int x){
    int start=0,end=arr.length-1,ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==x){
            ans=mid;
            start=mid+1;
        }
        else if(arr[mid]<x) start=mid+1;
        else end=mid-1;
    }
    return ans;
    }
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(first(arr,x));
        list.add(last(arr,x));
        return list;
    }

}
