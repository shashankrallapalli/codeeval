import java.io.*;
class Main {

	public static void main(String[] args) {
		
        try {
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(" ");
			int[] len=new int[parts.length];
			int i = 0;
			int x;
			while (i<parts.length)
			{
				len[i] = parts[i].length();
				i++;
			}
			x = findLargest(len);
			System.out.println(parts[x]);
		}
		
		reader.close();
        }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static int findLargest(int[] len1) {
		//int index = 0;
		int largest = len1[0];
		int y = 0;
		for (int k=0; k < len1.length; k++) {
			if (len1[k] > largest) {
				largest = len1[k];
				y = k;
			}
		}
		return y;

	}
}
