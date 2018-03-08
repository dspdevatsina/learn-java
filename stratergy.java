
public class stratergy {
		public static void  main(String[] args){
			
			String str = "1a2b";
			process(str);
			System.out.println(str.length());

		}

		
		public static void process(String str)
		{
			int lenth = str.length();
			char[] array = new char[lenth];
			array.clone();
			for(int i=0;i<str.length();i++)
			{
				array[i]= str.charAt(i);
				System.out.print(array[i]);
			}
			return;
		}
}
