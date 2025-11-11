class Queue {
	private char q[]; //Ссылка на массив, хранящий элементы очереди
	private int putloc, getloc; //Указатели на начало и на конец очереди
	
	//Конструктор для создания пустой очереди
	Queue(int size) {
		q = new char[size+1]; //Выделение памяти для массива
		putloc = getloc = 0;
	}

	//Конструктор для копирования существующей очереди в ночую очередь
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		for(int i = getloc+1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	//Конструктор для помещения значений из массива в новую очередь
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length+1];

		for(int i = 0; i < a.length; i++)
			put(a[i]);
	}

	//Метод для помещения символа в очередь
	void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println(" - очередь заполнена");
			return;
		}

		putloc++;
		q[putloc] = ch;
	}

	//Метод для извлечения символа из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - очередь пуста");
			return (char) 0;
		}

		getloc++;
		return q[getloc];
	}
}
class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения букв алфавита");

		for(i=0; i<32; i++)
			bigQ.put((char) ('А' + i));

		System.out.print("Содержимое очереди bigQ: ");
		for(i=0; i<32; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		System.out.println("Использование очереди smallQ для демонстрации переполнения");

		for(i=0; i<5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Я' - i));

			smallQ.put((char) ('Я' - i));
			System.out.println();
		}
		System.out.println();

		System.out.println("Демонстрация попытки обращения к пустой очереди ");
		System.out.println("Содержимое очереди smallQ: ");
		for(i=0; i<5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0)
				System.out.print(ch);


		System.out.println(" Попытка извлечения символа из очереди smallQ: ");
		}

		for(i=0; i<5; i++) {
			System.out.print(" Попытка сохранения " + (char) ('Я' - i));

			smallQ.put((char) ('Я' - i));
			System.out.println();
		//Попытка прямого доступа к закрытым элементам очереди через индекс
		Queue test = new Queue(10);
		//test.q[0] = 'A';
		//test.putloc = 'B';
		test.put('A');
		System.out.println("Извечение символа из очереди test " + test.get());
		}

		//Создание пустой очереди
		Queue q1 = new Queue(10);

		char arr1[] = {'Q', 'W', 'E', 'R', 'T', 'Y'};
		//Создание очереди на основе массива arr1[]
		Queue q2 = new Queue(arr1);

		//Помещение символов в очерель q1
		for(i = 0; i < 10; i++)
			q1.put((char) ('Y' + i));

		//Создание очереди q3 на основе очереди q1
		Queue q3 = new Queue(q1);

		//Отображаем содержимое очередей q1, q2, q3
		System.out.println();

		System.out.print("Очередь q1: ");
		for(i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");

		System.out.print("Очередь q2: ");
		for(i = 0; i < 10; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println();

		System.out.print("Очередь q3: ");
		for(i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
		System.out.println();
		
	}
}
