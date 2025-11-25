//Знакомство с объектами
class Avto {
	private int pass; //Количество пасажиров, включая водителя
	private int V; //Емкость топливного бака в л.
	private double rash; //Расход топлива в л/100км

	Avto() {
		pass = 0;
		V = 0;
		rash = 0.0;
	}

	Avto(int p, int v, double r) {
		pass = p;
		V = v;
		rash = r;
	}

	//Метод вычисления расстояния, которое автомобиль проедет на полном баке
	double range() {
		return ((double)(V*100))/rash;
	}

	double rashTopl(int km) {
		return (double)km*rash/100;
	}

	//Методы доступа к переменным
	int getPass() {
		return pass;
	}

	void setPass(int p) {
		pass = p;
	}

	int getV() {
		return V;
	}

	void setV(int v) {
		V = v;
	}

	double getRash() {
		return rash;
	}

	void setRash(double r) {
		rash = r;
	}
}

class Truck extends Avto {
	//Грузоподъемность грузовика
	private int cargocap;

	//Конструктор
	Truck(int p, int v, double r, int c) {
		super(p, v, r);
		cargocap = c;
	}
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}
}

class Pr016 {
	public static void main(String args[]) {
		double range;
		Avto bmw = new Avto(5, 80, 12.5);
		/*
		bmw.pass = 5;
		bmw.V = 80;
		bmw.rash = 12.5;
		*/

		System.out.println("\nИнформация о BMW X5: ");

		System.out.println("Количество пассажиров у BMW X5: " + bmw.getPass());
		System.out.println("Объем бака у BMW X5: " + bmw.getV() + " л");
		//Вызов метода вычисления расстояния внутри метода System.out.println():
		System.out.println("Расход топлива у BMW X5: " + bmw.getRash() + " л/100км" + "\nРасстояние для BMW X5: " + bmw.range() + " км");

		//range = ((double)(bmw.V * 100)) / bmw.rash;
		range = bmw.range();
		System.out.println("BMW X5 проедет на полном баке " + range + " км");
		System.out.println("BMW X5 потратит на 100 км " + bmw.rashTopl(100) + " литров топлива");

		int distance = 3350; //Расстояние до Москвы

		System.out.println("BMW X5 потратит " + bmw.rashTopl(distance) + " литров топлива, чтоб доехать до Москвы");

		//Создание грузовиков
	
		Truck zil = new Truck(2, 170, 25.0, 7);
		Truck kamaz = new Truck(3, 800, 35.0, 8);


		System.out.println("\nИнформация о ЗИЛ 130: ");

		System.out.println("Количество пассажиров у ЗИЛ 130: " + zil.getPass());
		System.out.println("Объем бака у ЗИЛ 130: " + zil.getV() + " л");
		//Вызов метода вычисления расстояния внутри метода System.out.println():
		System.out.println("Расход топлива у ЗИЛ 130: " + zil.getRash() + " л/100км" + "\nРасстояние для ЗИЛ 130: " + zil.range() + " км");

		//range = ((double)(bmw.V * 100)) / bmw.rash;
		range = zil.range();
		System.out.println("ЗИЛ 130 проедет на полном баке " + range + " км");
		System.out.println("ЗИЛ 130 потратит на 100 км " + zil.rashTopl(100) + " литров топлива");
		System.out.println("Масса груза для ЗИЛ 130: " + zil.getCargo() + " тонн");

		System.out.println("\nИнформация о КАМАЗ 5320: ");

		System.out.println("Количество пассажиров у КАМАЗ 5320: " + kamaz.getPass());
		System.out.println("Объем бака у КАМАЗ 5320: " + kamaz.getV() + " л");
		//Вызов метода вычисления расстояния внутри метода System.out.println():
		System.out.println("Расход топлива у КАМАЗ 5320: " + kamaz.getRash() + " л/100км" + "\nРасстояние для КАМАЗ 5320: " + kamaz.range() + " км");

		//range = ((double)(bmw.V * 100)) / bmw.rash;
		range = kamaz.range();
		System.out.println("КАМАЗ 5320 проедет на полном баке " + range + " км");
		System.out.println("КАМАЗ 5320 потратит на 100 км " + kamaz.rashTopl(100) + " литров топлива");
		System.out.println("Масса груза для КАМАЗ 5320: " + kamaz.getCargo() + " тонн");


		/*
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

		System.out.println("Mercedes SLC 43 потратит " + mercedes.rashTopl(distance) + " литров топлива, чтоб доехать до Москвы");

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
		*/
	}
}
