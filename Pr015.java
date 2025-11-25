//Суперкласс (родительский для всех подклассов двумерных фигур)
class TwoDShape {
	private double thickness;
	private double width;
	private double height;
	private String color;
	int i=25;

	TwoDShape() {
		width = height = 0;
	}

	TwoDShape(double x) {
		width = height = x;
		thickness = 0.1;
		color = "Черный";
	}

	TwoDShape(double t, double w, double h, String c) {
		if (w < 21)
			width = w;
		else 
			System.out.println("Ширина не должна превышать 21 сантиметр");
		height = h;
		color = c;
		thickness = t;
		
	}
	//Методы доступа к зыкрытым переменным экземплярам 
	double getThickness() {
		return thickness;
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setThickness(double t) {
		if (t < 10)
			thickness = t;
		else
			System.out.println("Толщина линии фигуры должна быть меньше 10 сантиметра");
	}
	void setWidth(double w) {
		if (w < 21)
			width = w;
		else
			System.out.println("Ширина фигуры должна быть меньше 21 сантиметра");
	}
	void setHeight(double h) {
		if (h < 29)
			height = h;
		else
			System.out.println("Высота фигуры должна быть меньше 29 сантиметра");
	}

	void showDim() {
		System.out.println("Толщина линии фигуры: " + thickness + "\nШирина двумерной фигуры: " + width + "\nВысота двумерной фигуры: " + height);
	}

	String getColor() {
		System.out.println("Цвет двумерной фигуры: " + color);
		return color;
	}

	void setColor(String c) {
		color = c;

	}
}

//Подкласс суперкласса TwoDShape (дочерний класс) для описания треугольников
class Triangle extends TwoDShape {
	String style;
	int i = 50;
	//Конструктор, определённый в подклассе
	Triangle() {
		super();
		style = "Без стиля";
	}

	Triangle(double x) {
		super(x);
		style = "Точечный";
	}

	Triangle(String s, double t, double w, double h, String c) {
		super(t, w, h, c);
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}

	void showI() {
		System.out.println("Значение i в подклассе: " + i);
		System.out.println("Значение i в суперклассе: " + super.i);
	}
}
//Подкласс суперкласа TwoDShape для описания прямогольников
class Rectangle extends TwoDShape {
	Rectangle(double t, double w, double h, String c) {
		super(t, w, h, c);
	}
	//метод, проверяющий, является ли прямоугольнк квадратом
	boolean isSquare() {
		if(getWidth() == getHeight())  
			return true;
		return false;
	}
	double area() {
		return getWidth() * getHeight();
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
		Triangle t1 = new Triangle("Пунктирный", 5.6, 5.1, 4.3, "Зеленый");
		Triangle t2 = new Triangle("Сплошной", 4.2, 7.1, 3.3, "Красный");
		Triangle t3 = new Triangle(5.5);

/*		t1.setWidth(5.1);
		t1.setHeight(4.3);
		t1.style = "Пунктирный";

		t2.setWidth(7.1);
		t2.setHeight(3.3);
		t2.style = "Сплошной";
*/
		TwoDShape s1 = new TwoDShape(7.3, 10.0, 6.2, "Желтый");
		TwoDShape s2 = new TwoDShape();
		TwoDShape s3 = new TwoDShape(5.0);
		/*
		s1.setWidth(10.0);
		s1.setHeight(6.2);
		*/

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

		System.out.println("Информация об объекте t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Площадь: " + t3.area());
		String str2 = t3.getColor();
		System.out.println(str2);
		System.out.println();
		//Родительский класс не имеет доступа к переменным, определенным в подклассе
		//s1.style = "Абстрактная фигура"; Родительский класс не може инициализировать переменную подкласса 
		System.out.println("Информация об объекте s1: ");
		//Родительский класс не имеет доступа к методам своего подкласса
		//s1.showStyle(); метод подкласса, неприменим к s1
		s1.showDim();
		System.out.println("Информация об объекте s2: ");
		s2.showDim();
		System.out.print("Цвет фигуры s2: ");
		s2.getColor();

		System.out.println("Информация об объекте s3: ");
		s3.showDim();
		System.out.print("Цвет фигуры s3: ");
		s3.getColor();

		//System.out.println("Площадь: " + s1.area()); Вызов метода подкласса, неприменим к s1
		System.out.println("\n");

		Rectangle r1 = new Rectangle(2.3, 35.1, 4.3, "Синий");
		/*
		r1.setWidth(35.1);
		r1.setHeight(4.3);
		*/

		System.out.println("Информация об объекте r1: ");
		r1.showDim();
		System.out.println("Площадь: " + r1.area());
		System.out.println("r1 является квадратом: " + r1.isSquare());
		System.out.println();

		//Проверка доступа к одноименной переменной в суперклассе из подкласса
		System.out.println("Значение i в экземпляре 2DShape: " + s1.i);
		System.out.println("Значение i в экземпляре Triangle: " + t1.i);
		t1.showI();

	}
}
