class Pr011 {
	public static void main(String args[]) {
		//Поразрядные операции над кодами символов 
		char ch;
		for(int i=0; i < 26; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);
			//Сброс шестого бита у символа при помощи &
			ch = (char) ((int) ch & 65503);

			System.out.print(ch + " ");
		}
		System.out.println("\n");

		//Отображение битов в 8-разрядном представлении
		int t;
		byte val;

		val = -126;
		for(t=128; t > 0; t = t/2) {
			if((val & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println("\n");

		//Преобразование из верхнего регистра в нижний
		for(int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			//Установка шестого бита у символа при помощи | (поразрядная операция ИЛИ)
			ch = (char) ((int) ch | 32);

			System.out.print(ch + " ");
		}
		System.out.println("\n");

		//Шифрование строки при помощи поразрядной опрации исключающего ИЛИ
		String str = "Очень секретная строка";
		String encstr = "";
		String decstr = "";
		int key = 150;

		System.out.print("Исходная срока: ");
		System.out.println(str);

		//Шифрование:
		for(int i=0; i < str.length(); i++)
			encstr = encstr + (char) (str.charAt(i) ^ key);
		System.out.print("Защифрованная строка: ");
		System.out.println(encstr);

		//Расшифровка:
		for(int i = 0; i < str.length(); i++)
			decstr = decstr + (char) (encstr.charAt(i) ^ key);

		System.out.print("Расшифрованная строка: ");
		System.out.println(decstr);

		//Демонстрация использования поразрядной операции НЕ
		byte b = -34;

		for(t=128; t > 0; t = t/2) {
			if((b & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println("\n");

		//Инвертирование бит в значении b
		b = (byte) ~b;


		for(t=128; t > 0; t = t/2) {
			if((b & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println("\n" + b + "\n");

		//Операции сдвига << и >>
		int val1 = 1;

		for(int i = 0; i < 8; i++) {
			for(t=128; t > 0; t = t/2) {
				if((val1 & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val1 = val1 << 1;

		}
		System.out.println();

		val1 = 128;

		for(int i = 0; i < 8; i++) {
			for(t=128; t > 0; t = t/2) {
				if((val1 & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
			val1 = val1 >> 1;

		}
		System.out.println();

	}
}



