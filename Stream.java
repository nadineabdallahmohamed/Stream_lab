package Stream_lab;
public class Stream {
	
	public static boolean Test_str(String ex)
	{
		
		return ((ex!=null)&& (ex!="")&&(ex.chars().allMatch(Character::isLetter)));
	}

}
