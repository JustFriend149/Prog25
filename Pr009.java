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

		//Нерегулярные массивы
		int riders[][] = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];

		int j;
		for(i=0; i<5; i++)
			for(j=0; j<10; j++)
				riders[i][j] = i + j + 10;
		for(i=5; i<7; i++)
			for(j=0; j<2; j++)
				riders[i][j] = i + j + 10;

		System.out.println();

		System.out.println("Количество пассажиров по рейсам в будние дни");
		for(i=0; i<5; i++) {
			for(j=0; j<10; j++) 
				System.out.print(riders[i][j] + " ");
		System.out.println();
		}
		System.out.println();

		System.out.println("Количество пассажиров по рейсам в выходные дни");

		for(i=5; i<7; i++) {
			for(j=0; j<2; j++) 
				System.out.print(riders[i][j] + " ");
		System.out.println();
		}

		//Трехмерный массив
		int a3Darray[][][] = new int [2][3][4];

		//Инициализация двумерного массива:
		int a2Darray[][] = {
			{1, 3},
			{3, 10},
			{4, 3},
			{9, 3},
			{35, 104},
			{21, 14}
		};
		System.out.println();
		for(i=0; i<6; i++) {
			for(j=0; j<2; j++)
				System.out.print(a2Darray[i][j] + "\t");
			System.out.println();
		}

		//Другая форма объявления массива
		int[] array = new int[5];
		char[][] table2 = new char[4][3];

		int nums1[] = new int[10];
		int nums2[] = new int[10];

		for(i=0; i<10; i++)
			nums1[i] = i;
		for(i=0; i<10; i++)
			nums2[i] = -i;

		System.out.print("Массив nums1: ");
		for(i=0; i<10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();

		System.out.print("Массив nums2: ");
		for(i=0; i<10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();

		//Присваивание ссылки на массив nums1!

		nums2 = nums1; //Обе переменные ссылаются на объект, на который ссылалась nums1]

		System.out.print("Массив nums2 после присваивания: ");

		for(i=0; i<10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();

		//Меняем значение одного элемента nums2
		nums2[3] = 111;

		System.out.print("Массив nums1 после изменения nums2[3]: ");

		for(i=0; i<10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();

		//Использование переменной экземпеляра length

		System.out.println();
		int list[] = new int[10];
		int nums3[] = {1,2,3};
		int table3[][] = {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};


		System.out.println("Размер списка: " + list.length);

		System.out.println("Размер nums3: " + nums3.length);
		System.out.println("Размер table3[0]: " + table3[0].length);
		System.out.println("Размер table3[1]: " + table3[1].length);
		System.out.println("Размер table3[2]: " + table3[2].length);

		System.out.println();
		for(i=0; i<list.length; i++)
			list[i] = i * i;

		System.out.print("Содержимое list: ");
		for(i=0; i<list.length; i++)
			 System.out.print(list[i] + " ");
		System.out.println();

		System.out.println("Размерность table3: ");
		System.out.println(table3.length);

		//Копирование из значений из одного массива в другой
		int nums4[] = new int[10];
		int nums5[] = new int[10];

		for(i=0; i<nums4.length; i++)
			nums4[i] = i;

		if(nums5.length >= nums4.length)
			for(i=0; i<nums4.length; i++)
				nums5[i] = nums4[i];
		System.out.println("Содержимое nums5: ");
		for(i=0; i<nums5.length; i++)
			System.out.print(nums5[i] + " ");
		System.out.println();

		//Разновидность цикла for "for - each"

		System.out.println();
		for(int x: nums5)
			System.out.print(x + " ");

		System.out.println();
		//Использование переменной цикла "for - each" для изменения значения внутри массива
		i = 0;
		for(int x: nums5) {
			x = 15 + i;
			nums5[i] = x;
			System.out.print("Новое содержимое массива: " + x + " ");
			i++;
		}

		System.out.println();
		for(int x: nums5)
			System.out.print(x + " ");
		System.out.println();

		//Суммирование первых пяти элементов массива
		int sum = 0;
		i = 0;
		for(int x: nums5) {
			System.out.println("Значение: " + x);
			sum += x;
			i++;
			if(i == 5)
				break;
		}
		System.out.println("Сумма первых пяти элементов массива nums5: " + sum);

		//Использование "for - each" для работы с многомерными массивами
		sum = 0;
		for(int x[] : table3) {
			for(int y : x) {
				System.out.println("Значение: " + y);
				sum += y;
			}
		}
		System.out.println("Сумма элементов двумерного массива table3: " + sum);
		System.out.println();

		//поиск в массиве при помощи цикла "for - each"
		int nums6[] = {103, 42, 58, 31, 50, 104, 46, 87};
		int val = 31;
		boolean found = false;

		for(int x : nums6) {
			if(x == val) {
				found = true;
				break;
			}
		}

		if(found)
			System.out.println("Значение " + val + " найдено в nums6");
		else
			System.out.println("Значение " + val + " не найдено в nums6");
	}
}
