class Demo {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30 };
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}