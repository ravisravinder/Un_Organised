// Online Java Compiler
// K=3( No of Shifts)
// Input Arr []= {1,2,3,4,5}
// 1st Shift = {5,1,2,3,4}
// 2nd Shift = {4,5,1,2,3}


// 3nd Shift = {3,4,5,1,2}
// Use this editor to write, compile and run your Java code online

class ArrayRotations {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] = {1,2,3,4,5};
        int k =3;
        int n = a.length;
        for(int i=1;i<=k;i++){
            int b []= rotate(a,i,n); 
            for(int aa :b){
                System.out.print(aa);
            }
            System.out.print(" ");
        }
    }
    public static int[] rotate(int a[], int k, int n){
        int a1[] = new int[n];
        int j=0;
        for(int i=k;i>0;i--){ //k=1;
            a1[n-1]= a[i-1];
            a1[j] = a[n-1];
            j++;
            n--;
        }
        for(int i=k;i<n-k+1;i++){
            a1[i]=a[i];
        }
        return a1;
    }
}
