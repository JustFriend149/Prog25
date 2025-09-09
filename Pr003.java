class Pr003 {
	public static void main(String args[]) {

		//Объявление целых переменных
		int var1, var2 = 20;

		//Объявление логической переменной
		boolean varb = true;

		//Объявление вещественных переменных
		double vard1 = 10.3, vard2;
		var1 = 10;

		//Проверка условий
		if (var1>var2) {
			int var3 = 300;
			System.out.println(var3);
		}
		else {
			int var4 = 300;
			System.out.println(var4);
		}

		if (varb) {
			System.out.println(var1);
		}

		//Деление двух целых чисел
		System.out.println("Результат деления var1 на var2");
		System.out.println(var1/var2);

		//Приведение результата деления по типу double
		vard2 = (double)var1/var2;
		System.out.println("Результат деления var1 на var2 с явным преобразованием к double");
		System.out.println(vard2);

		//Простые типы данных в java
		byte byte_var;
		System.out.println("Значения byte_var:");
		for (int i=100; i<=150; i++) {
			byte_var=(byte)i;
			System.out.print(byte_var + ", ");
		}
		short short_var;
		System.out.println("Тип данных short имеет разрядность 16 бит и значения от -32 768 до 32 767");
		System.out.println("Тип данных int имеет разрядность 32 бита");
		System.out.println("Тип данных long имеет разрядность 64 бита");

		long long_var = 4000000000L;

		//Пример использования типа данных long
		int int_var = 2000000000;
		long_var = (long)int_var*int_var;
		int_var = int_var*int_var;
		System.out.println("Значение int_var: " + int_var);
		System.out.println("Значение long_var: " + long_var);
		//Вычисление гипотенузы при помощи метода Math...sqrt()
		double a = 3.0, b = 4.0;
		double c = Math.sqrt(a*a + b*b);
		System.out.println("Длина гипотенузы: " + c);

		//Использование символьного типа данных
		char ch;
		ch = 'X';
		System.out.println("Значение ch: " + ch);
		int_var = (int) ch;
		System.out.println("Значение int_var: " + int_var);

		ch++;
		System.out.println("Значение ch: " + ch);

		ch = 90;
		System.out.println("Значение ch: " + ch);

		ch = 'А';
		for (int i = (int) ch; i < (int) 'А' + 66; i++) {
			System.out.print(ch++ + ", ");
		}
		System.out.println();

		//Использование логического типа данных
		varb = false;
		System.out.println("Значение varb: " + varb);

		varb = true;
		System.out.println("Значение varb: " + varb);

		if(varb) 
			System.out.println("Выполняется, если varb == true");
		varb = false;
		if(varb)
			System.out.println("Выполняется, если varb == true");

		System.out.println("Результат сравнения 10>9: " + (10>9));


		int_var = 0xFF; //Шестнадцатеричный формат числа
		int int_var2 = 023; //Восьмеричный формат
		int int_var3 = 0b00001000; //Двоичный формат
		System.out.println("Значение: " + int_var + " " + int_var2 + " " + int_var3);	

		//Управляющие последовательности символов
		System.out.println("\nУправляющие последовательности: \n\\\'\tАпостроф\n\\\"\tДвойная кавычка\n\\r\tВозврат каретки");
		System.out.println("\\f\tПеревод страницы\n\\b\tВозврат на одну позицию");
		//Присваивание управляющего символа
		ch = '\n';
		System.out.println("Первая строка" + ch + "Вторая строка");
	}
}
