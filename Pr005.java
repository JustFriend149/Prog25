class Pr005{
	public static void main(String args[]) {

//Составные операторы присваивания
		//Для арифметических операций: 
		//+=	-=	*=	/=
		int x = 0;
		x = x +5;
		x += 5;
		x = x - 10;
		x -= 10;
		//Для логических операций:
		//&=	|=	^=

//Преобразование типов при присваивании
		int i;
		float f;

		i = 10;
		f = i;
		System.out.println("i = " + i + " f = " + f);
		//Автоматическое преобразование типов выполняется если:
			//целевой тип совместим с типом значения, которое ему присваиввется
			//целевой тип поддерживает более широкоий диапазон допустимых значений
		long L;
		double D;

		L = 212352634742345235L;
		D = L;
		System.out.println("L = " + L + " D = " + D);

		//Пример недопустимого автоматического преобразования типов:
		/*
		D = 212352634742345235.0;
		L = D;
		System.out.println("L = " + L + " D = " + D);
		*/

		//"Ручное" приведение одного типа к другому
		D = 212352634742345235.0;
		L = (long)D;
		System.out.println("L = " + L + " D = " + D);

		System.out.println();
		byte byte1 = 125;
		char ch;
		ch = (char) byte1;
		System.out.println("ch: " + ch);

		int integer1 = 1095;
		ch = (char) integer1;
		System.out.println("ch: " + ch);

		ch = 'Ю';
		integer1 = (int) ch;
		System.out.println("integer1: " + integer1);

		D = (double) ch;
	}
}
