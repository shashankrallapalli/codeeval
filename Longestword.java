import java.io.BufferReader
class LongestWord
{
	public static void main(String[] args)
	 {

		BufferReader reader=new BufferReader(new FileReader(args[0]));
		String line=null;
		while((line=reader.readLine())!=null)
		{
			string[] parts=line.split(" ");
			int[] len;
			int i=0;
			int x;
			while(parts[i]!=null)
			{
				len[i]=parts[i].length();
				i++;
			}
			x=findLargest(len);
			System.out.println(parts[x]);
		}
	 }
	 public int findLargest(int[] len1)
	 {
	 	int index=0;
	 	int largest=len[0];
	 	int y=0;
	 	for (int k;k<len1.length ;k++ )
	 	{
	 		if(len1[k]>largest)
	 		{
	 			largest=len1[k];
	 			y=k;
	 		}
	 	}
	 	return y;

	 }
}