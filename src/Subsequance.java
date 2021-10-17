
public class Subsequance {
  static int incre_subseq(int my_arr[], int ar_length){
	int seqance[] = new int[ar_length];
	int i, j, max = 0;
	for (i = 0; i < ar_length; i++)
		  seqance[i] = 1;
	for (i = 1; i < ar_length; i++)
	for (j = 0; j < i; j++)
	  if (my_arr[i] > my_arr[j] && seqance[i] < seqance[j] + 1)
	   	  seqance[i] = seqance[j] + 1;
	    for (i = 0; i < ar_length; i++)
	      if (max < seqance[i])
	      max = seqance[i];
	      return max;
	   }
	 public static void main(String args[]){
	     int my_arr[] = { 30, 14, -1 ,50 ,-6 ,10 };
	      int ar_length = my_arr.length;
System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, ar_length));
		   }
		}


