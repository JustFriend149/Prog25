class ShowBits {
	int numbits;
	ShowBits(int n) {
		numbits = n;

	}
	void show(long val) {	
		long mask = 1;
		//Сдвиг значения 1 на нужную позицию
		mask <<= numbits-1;

		int spacer = 0;;
		for(; mask !=0; mask >>>=1) {
			if((val & mask) !=0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}
class ShowBitsDemo {
	public static void main(String args[]) {
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);

		System.out.println("125 в двочном представлении");
		b.show(125);

		System.out.println("\n65530 в двоичном прендставлении: ");
		i.show(65530);

		System.out.println("\n16355355355 в двоичном представлении: ");
		li.show(16355355355L);

		System.out.println("\nМладшие 8 бит числа 65530: ");
		b.show(65530);
	}
}
