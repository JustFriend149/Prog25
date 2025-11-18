//Суперкласс (родительский для всех подклассов двумерных фигур)
class TwoDShape {
	double width;
	double height;
	private String color = "Черный";
	void showDim() {
		System.out.println("Ширина двумерной фигуры: " + width + "\nВысота двумерной фигуры: " + height);
	}
	String getColor() {
		System.out.println("Цвет двумерной фигуры: " + color);
		return color;
	}
}
//Подкласс суперкласса TwoDShape (дочерний класс) для описания треугольников
class Triangle extends TwoDShape {
	String style;
	double area() {
		return width * height / 2;
	}
	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}
//Подкласс суперкласа TwoDShape для описания прямогольников
class Rectangle extends TwoDShape {
	//метод, проверяющий, является ли прямоугольнк квадратом
	boolean isSquare() {
		if(width == height)  
			return true;
		return false;
	}
	double area() {
		return width * height;
	}
	//Подкласс не имеет доступа к закрытым переменным суперкласса
	/*String getColor() {
		System.out.println("Цвет фигуры: " + color);
		return color;
	}*/
}
class Pr015 {
	//Демонстрация создания треугольников и двумерных фигур
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 5.1;
		t1.height = 4.3;
		t1.style = "Пунктирный";

		t2.width = 7.1;
		t2.height = 3.3;
		t2.style = "Сплошной";

		TwoDShape s1 = new TwoDShape();
		s1.width = 10.0;
		s1.height = 6.2;

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		String str = t1.getColor();

		System.out.println("Информация об объекте t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь: " + t2.area());
		System.out.println();

		//Родительский класс не имеет доступа к переменным, определенным в подклассе
		//s1.style = "Абстрактная фигура"; Родительский класс не може инициализировать переменную подкласса 
		System.out.println("Информация об объекте s1: ");
		//Родительский класс не имеет доступа к методам своего подкласса
		//s1.showStyle(); метод подкласса, неприменим к s1
		s1.showDim();
		//System.out.println("Площадь: " + s1.area()); Вызов метода подкласса, неприменим к s1
		System.out.println();

		Rectangle r1 = new Rectangle();
		r1.width = 5.1;
		r1.height = 4.3;

		System.out.println("Информация об объекте r1: ");
		r1.showDim();
		System.out.println("Площадь: " + r1.area());
		System.out.println("r1 является квадратом: " + r1.isSquare());
		System.out.println();
	}
}
