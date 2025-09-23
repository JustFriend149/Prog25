//Управляющие операторы
class Pr006 {
	public static void main(String args[]) 
	    throws java.io.IOException {
	    //Клавиатурный ввод символа
	    	char ch, temp;
		System.out.print("Введите символ с клавиатуры: ");
		ch = (char) System.in.read();
		System.out.println("Введен символ " + ch);
		temp = (char) System.in.read();

		//Угадывание значения символьной переменной
		char answer = 'D';
		System.out.println("Введите символ ...");
		ch = (char) System.in.read();
		
		//Демонстрация работы оператора if() 
		if(ch == answer)
			System.out.println("Символы совпали");
		else {
			System.out.println("Символы не совпали " + ch);
			if (ch < answer) 
				System.out.println("Нужный символ ближе к концу алфавита");
			else 
				System.out.println("Нужный символ ближе к началу алфавита");
		}

		System.out.println();
		//Вложенный оператор if()
		int i = 10, j = 15, k = 15, a = 0, b = 77, c = 0, d = 88;
		if(i != 10) {
			if(j < 20) 
				a = b;
			if(k > 100) 
				c = d;
			else {
				c = 25;
			       	a = c;
			}
		}
		else {
			a = d;
			c = 0;
		}

		System.out.println("i = " + i + " j = "  + j + " k = " + k);
		System.out.println("a = " + a + " b = "  + b + " c = " + c + " d = " + d);

		//Многоступенчатая конструкция if-else-if
		for(i=0; i<6; i++) {
			if(i == 1)
				System.out.println("i = 1");
			else if(i == 2)
				System.out.println("i = 2");
			else if(i == 3)
				System.out.println("i = 3");
			else if(i == 4)
				System.out.println("i = 4");
			else
				//Все оставшиеся варианты выведут значение, указанное ниже
				System.out.println("Значение i не равно ни одному значению от 1 до 4");

		}

		//Оператор switch
		System.out.println("\nДемонстрация работы оператора switch()");
		for(i=0; i<10; i++)
			switch(i) {
				case 0:
					System.out.println("i = 0");
					break;
				case 1:
				        System.out.println("i = 1");
				        break;
				case 2:
				        System.out.println("i = 2");
				        break;
				case 3:
				        System.out.println("i = 3");
				        break;
				case 4:
				        System.out.println("i = 4");
				        break;
				default:
				        System.out.println("i >= 5");	
			}

		//Вложенные операторы switch

		ch = 'R';
		char ch1 = 'A';
		switch(ch) {
			case 'A': 
				System.out.println("Значение A внешнего оператора switch");
				  switch(ch1) {
					  case 'A': 
						  System.out.println("Значение A внутреннего оператора switch");
						  break;
				  }
				  break;
			case 'R':
				  System.out.println("Значение R внешнего оператора switch");
				  switch(ch1) {
					  case 'A':
						  System.out.println("Значение A внутреннего оператора switch");
						  break;

				  }
				  break;
			default:
				  System.out.println("Значение по умолчанию для внешнего оператора switch()");
		}

		//Оператор цикла for
		System.out.println();
		double num, sroot, rerr;

		for(num = 1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень из " + num + " равен " + sroot);

			//Вычисление ошибки округления
			rerr = num - (sroot * sroot);
			System.out.println("Ошибка округления: " + rerr);
			System.out.println();
		}
	}
}
