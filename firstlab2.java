public class firstlab2 {
	public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if ((x+y)%2 == 0) {
            System.out.println("Сумма четна");
        }
        else {
            System.out.println("Сумма НЕ четна");
        }
	}
}
