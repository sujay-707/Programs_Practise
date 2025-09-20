public class KadaneMxSubArr {

    public static void KadaneMs(int arr[])
    {
        int n = arr.length;
        int cs = arr[0];
        int ms = arr[0];

        for(int i=1;i<n;i++)
        {
            cs =  Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        for(int i=0 ; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Max Sub Array Sum is = ");
        KadaneMs(arr);
    }
    
}
