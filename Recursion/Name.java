package Recursion;

public class Name {
    public static void main(String[] args) {
        print("vibhuti" , 3);
    }
    static void print(String name, int n){
        if(n==0) return;
        print(name,n-1);
        System.out.println(name);
    }
}
