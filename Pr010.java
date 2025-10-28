//Строки из символов
class Pr010 {
	public static void main (String args[]) {
		System.out.println(""); //Пустая строка как аргумент метода println()
		System.out.print("\n"); //Символ перевода строки как аргумент метода print()
		String str1 = "Первая строка";
//		String str2 = 'a'; Символы и строки несовместимы в качестве типов данных
		String str3 = "a";
		int a = 3355;
		System.out.println(str1 + " " + a);
		String str4 = str1 + " " + a;
		System.out.println(str4);
		str4 = a + " " + str1;

		System.out.println(str4);

		String str5; //Создание строковой переменной, ссылающейся на null

		str5 = ""; //Создание пустой строки

		String str6 = new String("Строка 6"); //Сохдание строки при помощи оператора new

		String str7 = new String(str6); //Копирование значения str6 в str7

		str7 = str6; //Копирование ссылки на строку str6 в ссылочную переменную str7
		//Неизменяемость строк 
		str7 = "Старое значение str7";
		str6 = str7;
		str7 = "Новое значение str7";
		System.out.println("Значение str7: " + str7 + "\nЗначение str6: " + str6);

		//Операции над строками:

		//Проверка строк на эквивалентность
		boolean eqstr76 = str7.equals(str6);
		String str8 = "Первая строка";
		if (str8.equals(str1))
			System.out.println("str8 и str1 эквивалентны");
		if (str6 == str7)
			System.out.println("str8 и str1 ссылаются на один и тот же объект");
		//Определение длины строки в символах (возвращает целое число) 
		System.out.println("Длина строки str1: " + str1.length() + " символов");
		//Доступ к символу в строке по указанному индексу
		for (int i=1; i<str1.length(); i++)
			System.out.print(str1.charAt(i) + " ");
		System.out.println();

		//Метод сравнения строк
		System.out.println("Результат сравнения строк str6 и str7: " + str6.compareTo(str7));

		if (str6.compareTo(str7)>0)
			System.out.println("str6 больше, чем str7");
		else if (str6.compareTo(str7)<0)
			System.out.println("str6 меньше, чем str7");
		else 
			System.out.println("str6 равна str7");

		//Поиск подстроки (возвращает индекс первого вхождения подстроки в строку)
		System.out.println("Индекс первого вхождения подстроки: " + str1.indexOf("строка"));
		for (int i=str1.indexOf("строка"); i<str1.length(); i++)
			System.out.print(str1.charAt(i) + " ");
		System.out.println();

		//Вовзращение индекса последнего вхождения подстроки в строку 
		str8 = "Строка, строка, строка и строка. 4 слова \"строка\"";
		System.out.println("Индекс первого вхождения подстроки: " + str8.lastIndexOf("строка"));

		//Массивы строк
		System.out.println();
		String strs[] = {"Первая часть", "Вторая часть", "Третья часть", "Четвертая часть", "массива строк"};
		System.out.println("Исходный массив: ");
		for(String s : strs)
			System.out.print(s + " ");
		 System.out.println("\n");

		 //Измненеие элементов массива
		 strs[2] = "Третья измененная часть";
		 strs[3] = "и четвертая часть тоже изменилась у";
		 System.out.println("Измененный массив: ");
		 for(String s : strs)
			 System.out.print(s + " ");
		 System.out.println("\n");

		 //Работа с подстрокой
		 String orgstr = "Оригинальная строка для операций с подстрокой";

		 String substr = orgstr.substring(13, 19);
		 System.out.println("Оригинальное значение в orgstr: " + orgstr);
		 System.out.println("Значение, сохраненное в substr: " + substr);

		 //Строки при управлении в опраторе switch 
		 System.out.println();
		 String command = "dfsfsf";

		 switch(command) {
			 case "connect":
				 System.out.println("Подключение");
				 break;
                         case "cancel":
				 System.out.println("Отмена");
			 case "disconnect":
				 System.out.println("Отключение");
				 break;
			 default:
				 System.out.println("Неподдерживаемая команда");
				 break;		 
		 }

		 //Работа с командной строкой
		 System.out.println();
		 System.out.println("Программе передано " + args.length + " аргументов в командной строке");
		 System.out.println("Список аргументов: ");
		 int i = 0;
		 for(String s : args) {
			 i++;
			 System.out.println("Аргумент " + i + ": " + s);
		 }

		 //Обработка аргументов кмандной строки внутри метода main

		 String numbers[][] = {
			 {"Дир.", "(+7 383) 244-01-70"},
			 {"Зам.дир.", "(+7 383) 252-02-10"},
			 {"Менеджер", "(+7 383) 252-02-15"},
			 {"Диспетчер", "(+7 383) 244-10-18"},
		 };

		 if(args.length != 1)
			  System.out.println("Необходимо указать один аргумент");
		 else{
			 for(i=0; i<numbers.length; i++) {
				 if(numbers[i][0].equals(args[0])) {
					  System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					  break;
				 }
			 }
			 if(i == numbers.length)
				  System.out.println("Информация не найдена");
		 }
	}
}


