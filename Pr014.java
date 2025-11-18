//Внешние и внутрение касы
class Outer {
	int[] nums;

	Outer(int [] n) {
		nums = n;
	}
	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Минимальное значение: " + inOb.min());
		System.out.println("Максимальное значение: " + inOb.max());
		System.out.println("Среднее значение: " + inOb.avg());
	}
	class Inner {
		int min() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++)
				if(nums[i] < m)
					m = nums[i];
			return m;
		}
		int max() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++)
				if(nums[i] > m)
					m = nums[i];
			return m;
		}
		int avg() {
			int a = nums[0];
			for(int i = 1; i < nums.length; i++)
				a += nums[i];

			return a/nums.length;
		}

	}
}
//Аргументы переменной длины
class VarArgs {
	static void vaTest(int ... v) {
		System.out.println("Количество аргументов: " + v.length);
		System.out.println("Содержимое массива v: ");
		for (int i=0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	//Комбинирование обычных аргументов с аргументами переменной длины
	static void vaTest2(String msg, int ... v) {
		System.out.println("Значение строки: " + msg);
		System.out.println("Количество аргументов в массиве целых параметров: " + v.length);
		System.out.println("Содержимое массива v: ");
		for (int i=0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	//Перегрузка метода с аргументами переменной длины
	static void vaTest3(int ... v) {
		System.out.println("vaTest3(int ...): " + "Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");

		for (int i=0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	static void vaTest3(boolean ... v) {
		System.out.println("vaTest3(boolean ...): " + "Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");

		for (int i=0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	static void vaTest3(String msg, int ... v) {
		System.out.println("vaTest3(String, int ...): " + msg + v.length);
		System.out.println("Содержимое: ");

		for (int i=0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	//Неоднозначная версия метода vaTest3:
	//static void vaTest3(int v1, int ... v) {
	//(Нельзя в качестве перегружаемых версии, если определен метод vaTEst3(int ... v)
	//}
}
class Pr014 {
	public static void main(String[] args) {
		//Вызов метода с параметрами переменной длины
		VarArgs.vaTest(30);
		VarArgs.vaTest(2, 4, 6);
		VarArgs.vaTest();
		System.out.println();

		VarArgs.vaTest2("Один целый аргумент", 30);
		VarArgs.vaTest2("Три целых аргумента", 2, 4, 6);
		VarArgs.vaTest2("Без целых аргуметов");
		System.out.println();

		VarArgs.vaTest3(2,4,6);
		VarArgs.vaTest3("Строка", 30, 20);
		VarArgs.vaTest3(false, true, false);
		System.out.println();
		//Вызов перегружаемого метода без аргументов приводит к неоднозначности
		//VarArgs.vaTest3(); - ошибка компиляции, так как возможен выбор любого метода с параметрами int или boolean

		int[] x = {3,3,5,1,60,40,14,9};
		Outer outOb = new Outer(x);

		outOb.analyze();

		//Демонстрация использования класса ShowBits в качестве внутреннего 
		System.out.println();

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
		for(byte b = 0; b < 10; b++) {
			ShowBits byteval = new ShowBits(8);
			System.out.print(b + " в двоичном виде: ");
			byteval.show(b);
		}
	}
}





