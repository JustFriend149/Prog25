//Конструкторы
class MyClass {
	int x;
//Простой конструктор
	MyClass() {
		x = 10;
	}
}
class MyClass2 {
	int x;
//Конструктор с параметрами
	MyClass2(int i) {
		x = i;
	}
}

class Pr009 {
	public static void main(String args[]) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();

		System.out.println("Значение x внутри t1: " + t1.x + "\nЗначение x внутри t2: " + t2.x);
		
		MyClass2 t3 = new MyClass2(10);
		MyClass2 t4 = new MyClass2(88);

		System.out.println("Значение x внутри t3: " + t3.x + "\nЗначение x внутри t4: " + t4.x);

		Avto bmw = new Avto(5, 80, 12.5);
		Avto mercedes = new Avto(2, 60, 10.2);

		System.out.println("BMW X5 перевозит " + bmw.pass + " пассажиров на " + bmw.range() + " км");
		System.out.println("Mercedes SLC 43 перевозит " + mercedes.pass + " пассажиров на " + mercedes.range() + " км");

		System.out.println();
		//Работа с массивами
		int sample[];
		sample = new int[10];

		int sample2[] = new int[20];
		int i;

		for(i = 0; i < 10; i++)
			sample[i] = i;

		for(i = 0; i < 10; i++)
			System.out.println("Элемент ["+ i +"]: " + sample[i]);

		System.out.println();
		//Определение максимального и минимального значения в массиве
		sample2[0] = 39;
		sample2[1] = -19;
		sample2[2] = 33;
		sample2[3] = 45;
		sample2[4] = -239;
		sample2[5] = -50;
		sample2[6] = 87;
		sample2[7] = 91;
		sample2[8] = 07;
		sample2[9] = -24;
		int min, max;
		min = max = sample2[0];
		for(i=1; i<10; i++) {
			if(sample2[i] < min) min = sample2[i];
			if(sample2[i] > max) max = sample2[i];
		}
		System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);

		System.out.println();
		for(i = 0; i < 20; i++)
			System.out.println("Элемент ["+ i +"]: " + sample2[i]);

		System.out.println();
		int sample3[] = {10,51,-24,-66,88,12,35,11,16,2,-99};

		for(i = 0; i <= 10; i++)
			System.out.println("Элемент ["+ i +"]: " + sample3[i]);

		System.out.println();
		//Пузырьковая сортировка массива:
		int a, b, t;
		int size;

		size = 10;

		System.out.println();
		for(a=1; a < size; a++)
			for(b = size-1; b >= a; b--) {
				if(sample3[b-1] > sample3[b]) {
					t = sample3[b-1];
					sample3[b-1] = sample3[b];
					sample3[b] = t;
				}
			}

		for(i=0;i < size; i++)
			System.out.print(" " + sample3[i]);
		System.out.println();

		System.out.println();
		//Двумерные массивы
		int table[][] = new int[4][3];

		for (t=0; t<4; t++) {
			for(i=0; i<3; i++) {
				table[t][i] = (t*3) + i + 1;
				System.out.print("\t" + table[t][i] + " ");
			}
			System.out.println();
		}
	}
}
