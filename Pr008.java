//Знакомство с объектами
class Avto {
	int pass; //Количество пасажиров, включая водителя
	int V; //Емкость топливного бака в л.
	double rash; //Расход топлива в л/100км
		     //Метод вычисления расстояния, которое автомобиль проедет на полном баке
	double range() {
		return ((double)(V*100))/rash;
	}
}
class Pr008 {
	public static void main(String args[]) {
		double range;
		Avto bmw = new Avto();
		bmw.pass = 5;
		bmw.V = 80;
		bmw.rash = 12.5;

		System.out.println("\nИнформация о BMW X5: ");

		System.out.println("Количество пассажиров у BMW X5: " + bmw.pass);
		System.out.println("Объем бака у BMW X5: " + bmw.V + " л");
		//Вызов метода вычисления расстояния внутри метода System.out.println():
		System.out.println("Расход топлива у BMW X5: " + bmw.rash + " л/100км" + "\nРасстояние для BMW X5: " + bmw.range() + " км");

		//range = ((double)(bmw.V * 100)) / bmw.rash;
		range = bmw.range();
		System.out.println("BMW X5 проедет на полном баке " + range + " км");

		System.out.println("\nИнформация о Mercedes SLC 43: ");

		Avto mercedes = new Avto();
		mercedes.pass = 2;
		mercedes.V = 60;
		mercedes.rash = 10.2;
		System.out.println("Количество пассажиров у Mercedes: " + mercedes.pass);
		System.out.println("Объем бака у Mercedes: " + mercedes.V + " л");
		System.out.println("Расход топлива у Mercedes: " + mercedes.rash + " л/100км");

		//range = ((double)(mercedes.V * 100)) / mercedes.rash;
		range = mercedes.range();
		System.out.println("Mercedes SLC 43 проедет на полном баке " + range + " км");

		//Хранение значений в простых типах переменных
		int p1 = 50, p2 = 75;
		p1 = p2;
		p2 = 100;
		System.out.println("Значения p1 и p2: " + p1 + " " + p2);

		//Хранение значений в объектных типах
		//Операции присваивания для объектных переменных означают копирование ссылки на объект, а не всех значений объекта
		Avto bmw1, bmw2;
		bmw1 = bmw;
		bmw2 = mercedes;
		bmw1.rash = 14.5;
		System.out.println("Расход для bmw и bmw1: " + bmw.rash + " " + bmw1.rash);
		bmw2.rash = 9.99;
		System.out.println("Расход для bmw2 и mercedes: " + bmw2.rash + " " + mercedes.rash);
	}
}
