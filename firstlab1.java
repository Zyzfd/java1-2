public class firstlab1 {
	public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (y == 0) {
            System.out.println("Деление на 0!");
            return;
        }
        if (x % y == 0) {
            System.out.println("Делится!");
        }
        else {
            System.out.println("НЕ делится!");
        }
	}
}
