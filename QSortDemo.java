class Quicksort {
	//Настройкка вызова метода быстрой сортировки
	static void qsort(char[] items) {
		qs(items, 0, items.length-1);
	}
	//Рекурсивная версия быстрой сортировки массива
	private static void qs(char[] items, int left, int right) {
		int i, j;
		char x, y;
		i = left;
		j = right;
		x = items[(left+right)/2];

		do {
			while((items[i] < x) && (i < right)) 
				i++;
			while(x < items[j] && (j > left)) 
				j--;
			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while(i <= j);
		if(left < j)
			qs(items, left, j);
		if(i < right) 
			qs(items, i, right);
	}
}
class QSortDemo {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		char [] a1 = {'d','d','s','f','a','e','w','q','r','z','p','t','u','a','b','c','a','a','a','a','d','e'};
		int i;
		
		System.out.print("Исходный массив: ");
		for(i=0; i<a1.length; i++)
			System.out.print(a1[i]);	
		System.out.println();
		//Сортировка массива
		Quicksort.qsort(a1);
		System.out.print("Отсортированный массив: ");
		for(i=0; i < a1.length; i++)
			System.out.print(a1[i]);
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("Время сортировки массива: " + (endTime-startTime) + " мс");


		long startTime1 = System.currentTimeMillis();
		//Пузырьковая сортировка массива:
		int a, b; 
		char t;
		int size;

		size = a1.length -1;

		System.out.println("\nПузырьковая сортировка");
		for(a=1; a < size; a++)
			for(b = size-1; b >= a; b--) {
				if(a1[b-1] > a1[b]) {
					t = a1[b-1];
					a1[b-1] = a1[b];
					a1[b] = t;
				}
			}

		for(i=0;i < size; i++)
			System.out.print(" " + a1[i]);
		System.out.println();

		long endTime1 = System.currentTimeMillis();

		System.out.println("Время сортировки массива: " + (endTime1-startTime1) + " мс");
	}
}
