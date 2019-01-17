package FindLongestSubsequence;

public class MainClass {

	public static void main(String args[])
	{
		int[] data= {1,2,3,4,9,10,11,19,23,24};
		int subsequence_count = 1;
		int tmp_subsequence=1;

		
		for(int i =0;i< data.length-1;i++)
		{
			if(data[i+1]== data[i]+1)
			{
				
				System.out.println("DATA "+data[i]+" "+data[i+1]);
				
				subsequence_count=subsequence_count+1;
				System.out.println("Subseq "+subsequence_count);
			}
			else
			{
				tmp_subsequence=subsequence_count;
				
				subsequence_count=1;
				//System.out.println("Tmp "+tmp_subsequence+"..."+subsequence_count);
				
			}
			
			
		}
		if(tmp_subsequence>subsequence_count)
		{
			subsequence_count=tmp_subsequence;
		}
		System.out.println("The MAx subsequence is "+subsequence_count);
		
	}
}