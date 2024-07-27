public class j8 {
   static  int array_count9(int arr[])
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==9)
        {
             count++;
        }
        }
        return count;


    }
    static public void main(String []args)
    {
        int arr[]={1,9,4,9,9,9,9};
        int arr1[]={1,9,4,9,9,3};
        int ans= array_count9(arr);
        int ans1= array_count9(arr1);
        System.out.println("Occurence of 9 in array is  "+ans+" times.");
        System.out.println("Occurence of 9 in array is  "+ans1+" times.");
        System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");


    }
    
}
