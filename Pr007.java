//Использование операторов прекращения итераций в цикле
//Оператор break при выходе из цикла
class Pr007 {
	public static void main(String args[]) {
		int num;
		num = 100;
		int i = 0;
		for(i=0; i < num; i++) {
			if(i*i >= num)
				break;
			System.out.print(i + " ");
		}
		System.out.println("Цикл завершен ");
		System.out.println("Текущее значение i: " + i);

		//Оператор break во вложенных циклах
		for (i=0; i<3; i++) {
			System.out.println("Счетчик внешнего цикла: " + i);
			System.out.print("      счетчик внутреннего цикла: ");

			int t = 0;
			while(t < 100) {
				if (t==10)
					break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.println("Циклы завершились");
		System.out.println();

		//Оператор break в роли оператора goto
		for(i=1; i<4; i++) {
one:                    {
two:                            {
three:					{
						System.out.println("\ni равно " + i);
						if(i==1) break one;
						if(i==2) break two;
						if(i==3) break three;

						System.out.println("не выполняется");
					}
					System.out.println("После блока three");
				}
				System.out.println("После блока two");
                        }
			System.out.println("После блока one");
		}

		System.out.println("После цикла for");

		System.out.println();
		//Второй пример использования оператора break с меткой
done:		for (i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					System.out.println(k + " ");
					if(k==5) break done;
				}
				System.out.println("После цикла по k"); //не выполняется
			}
			System.out.println("После цикла по j"); //не выполняется
		}
		System.out.println("После цикла по i");

		System.out.println();
		//Иллюстрация влияния позиции метки на поведение циклов
		int x=0, y=0;

stop1:		for(x=0; x<5; x++) {
			for(y=0; y<5; y++) {
				if(y==2) break stop1;
				System.out.println("x и y: " + x + " " + y);
			}
		}
		System.out.println();

		for(x=0; x<5; x++) 
stop2:		{
			for(y=0; y<5; y++) {
				if(y==2) break stop2;
				System.out.println("x и y: " + x + " " + y);
			}
		}
		System.out.println();
	}
}
