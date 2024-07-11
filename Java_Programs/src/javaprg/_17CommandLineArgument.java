package javaprg;

public class _17CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=args.length;
		if(length==0) {
			System.out.println("argument length is zero");
		}else {
			System.out.println("the arguments are");
			for(int i=0;i<length;i++) {
				System.out.println(args[i]);
			}
		}

	}

}
