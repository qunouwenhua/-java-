import java.util.Scanner;

public class Tt extends PinYing{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入中文名字:");
		String name=scanner.nextLine();
		System.out.println(getPingYin(name));
		System.out.println(getPinYinHeadChar(name).toUpperCase());
	}
}
