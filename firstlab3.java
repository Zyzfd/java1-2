public class firstlab3 {
	public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long nn = 1;
        for (int i = 0; i < n; i++) {
            nn *= n;
        }
        long index;
        int ind;
        int[] counter = new int[10];
        System.out.println(nn);
        while (nn != 0) {
            index = nn % 10;
            ind = (int)index;
            counter[ind]++;
            nn /= 10;
        }
        for (int i = 0; i<10; i++) {
            System.out.print(i + " - ");
            System.out.println(counter[i]);
        }
	}
}
