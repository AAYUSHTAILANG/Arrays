import java.util.Arrays;
import java.util.List;

public class ArraysM
{
    public static void main(String[] args) {
        
        //1. asList()
        /*
         add the array elements into a list
         returns List
         */
        String arr []= {"Aayus","Java","dotnet"};
        List<String> list = Arrays.asList(arr);
        for(String s :list)
        {
            System.out.print(s+" ");
        }
        System.out.println();

         //2.fill()
         /*
          initialise the array value that we want
          takes two parameters (array,value)
         */

         int []arr1= new int[5];

         for(int i : arr1)
         {
            System.out.print(i+" "); // 0 0 0 0 0
         }
         System.out.println();
         Arrays.fill(arr1, 55);
         for(int i : arr1)
         {
            System.out.print(i+" "); //55 55 55 55 55
         }
         System.out.println();
        
         //3.copyOf()
         /*
            copies 1 array into another 
            deep copy
            takes 2 parameter (array,upto what length)
          */ 

          int [] arr3 = new int[5];
          int [] arr4 = arr3; //Shallow copy

          arr4[3]=66;
          System.out.println(arr4[3]+" "+arr3[3]);//66 66

         int arr5[] = {10,20,40,5};
         int arr6[] = Arrays.copyOf(arr5, arr5.length);//Deep Copy
         int arr7[] = Arrays.copyOf(arr5, 2);//copy first 2 elements only
         for(int i : arr6)
         {
            System.out.print(i+" ");
         } 
         System.out.println();
         arr6[2] = 100;
         System.out.println(arr6[2]+" " +arr5[2]);//100 60

         for(int i : arr7)
         {
            System.out.print(i+" ");
         } 
         System.out.println();

         //4.equals()
         /*
            == methods refer to reference equality and not content
            Arrays.equals(arr1,arr2) compares content equality
          */

          String arr8[] = {"cat","gate","upsc"};
          String arr9[] = {"cat","gate","upsc"};
          System.out.println(arr8==arr9);//false referential equality
          /*
           This statement compares the references of the two arrays arr8 and arr9. Since arrays are objects in Java, the == operator compares the memory addresses of the arrays.
            If both arrays refer to the same memory location, it will return true; otherwise,
            it will return false
           */
          System.out.println(arr8.equals(arr9));//false
          /*
           compares the memory addresses of the arrays, similar to the == operator.
           */
          System.out.println(Arrays.equals(arr8, arr9));//true content equality
         /*
          This method compares the contents of the arrays rather than their memory addresses.
          */


          /*
            arr8==arr9 compares memory addresses of the arrays.
            arr8.equals(arr9) also compares memory addresses of the arrays because equals() is not overridden for arrays.
            Arrays.equals(arr8, arr9) compares the contents of the arrays.
           */

           //5.compare
           /*
            compare two arrays lexicographically(in dictionary order" or "alphabetical order)
            if both are equal returns 0
            1.Comparison of Corresponding Characters:
            In lexicographical comparison, you start by comparing the first character of each string.
            If they are equal, you move on to the next character.
            2.Shorter Strings are Considered Smaller
            3.Equal Length Strings: If both strings are of equal length and all corresponding characters are equal,
            then the strings are considered equal.
            
            */
            String [] arr10 ={"Aayush","Java","cpp"};
            String [] arr11 ={"Aayush","Java","cpp"};
            String [] arr12 ={"aayush","java","Cpp"};

            System.out.println(Arrays.compare(arr10, arr11));//0
            System.out.println(Arrays.compare(arr10, arr12));//<0
            System.out.println(Arrays.compare(arr12, arr10));//>0


            //6.sort()

            int arr13 [] = {55,22,56,112,667,1,20};
            Arrays.sort(arr13);
            for(int i : arr13)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            String arr14[] ={"aayush","riya","madhu","java"};
            Arrays.sort(arr14);
            for(String s : arr14)
            {
                System.out.print(s+" ");
            }
            System.out.println();

            //7.Binary Search
            /*
             takes 2 parameter 
             an sorted array and an element
             and returns index of that element
             if not present returns -(ve) value
             duplicate elements not allowed
             */
            System.out.println(Arrays.binarySearch(arr13, 112));
            System.out.println(Arrays.binarySearch(arr13, 10000));
    }
}