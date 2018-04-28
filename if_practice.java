public class if_practice {
	public static void main(String[] args) {
		boolean cond = 6 <= 6;
		System.out.println(cond);

		int my_int = 420;

		if(my_int < 420) {
			System.out.println("dab on the haters");
		}
		else if(my_int == 420) {
			System.out.println("maybe dab?");
		}
		else {
			System.out.println("no dabbing allowed");
		}
		
		int loop = 0;
		while(true) {
			System.out.println("Lopping:" + loop);
			if(loop == 5) {
				break;
			}
			loop++;
			System.out.println("Running");
		}
	}
}