//Суперкласс (родительский для всех подклассов двумерных фигур)
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;

	TwoDShape() {
		width = height = 0;
		name = "Имя отсутствует";
	}

	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	TwoDShape(double w, double h, String n) {
		if (w < 21)
			width = w;
		else 
			System.out.println("Ширина не должна превышать 21 сантиметр");
		height = h;
		name = n;
		
	}
	//Конструтор объекта из объекта совместимого типа
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	//Методы доступа к зыкрытым переменным экземплярам 
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
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
		System.out.println("Ширина двумерной фигуры: " + width + "\nВысота двумерной фигуры: " + height);
	}

	String getName() {
		System.out.println("Имя двумерной фигуры: " + name);
		return name;
	}
	abstract double area();
}

//Подкласс суперкласса TwoDShape (дочерний класс) для описания треугольников
class Triangle extends TwoDShape {
	String style;
	//Конструктор, определённый в подклассе
	Triangle() {
		super();
		style = "Без стиля";
	}

	Triangle(double x) {
		super(x, "Треугольник");
		style = "Точечный";
	}

	Triangle(String s, double w, double h) {
		super(w, h, "Треугольник");
		style = s;
	}
	//Создание треугольника на базе существующего объекта (копия объекта)
	Triangle(Triangle ob) {
		//Вызов конструктора суперкласса с передачей объкта "Треугольник"
		super(ob);
		style = ob.style;
	}
	//Переопределяемый метод суперкласса, вычисляющий площадь треугольника
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}

class ExtendsTriangle extends Triangle {
	private String tool;

	ExtendsTriangle(String tl, String s, double w, double h) {
		super(s, w, h);
		tool = tl;
	}

	void getTool() {
		System.out.println("Треугольник нарисован при помощи: " + tool);
	}
}
//Подкласс суперкласа TwoDShape для описания прямогольников
class Rectangle extends TwoDShape {
	Rectangle(double w, double h) {
		super(w, h, "Треугольник");
	}
	Rectangle(double x) {
		super(x, "Прямоугольник");
	}
	Rectangle(Rectangle ob) {
		super(ob);
	}
	//метод, проверяющий, является ли прямоугольнк квадратом
	boolean isSquare() {
		if(getWidth() == getHeight())  
			return true;
		return false;
	}
	//Перепределяемый метод вычисления площади прямоугольника
	double area() {
		return getWidth() * getHeight();
	}
}
class Pr019 {
	public static void main(String args[]) {
		TwoDShape[] shapes = new TwoDShape[5];

		shapes[0] = new Triangle("Контурный", 5.0, 4.5);
		shapes[1] = new Rectangle(4.5);
		shapes[2] = new Rectangle(7.0, 4.5);
		shapes[3] = new Triangle(9.5);
		//Объект абстрактного класса TwoDShape не может быть создан
		shapes[4] = new Triangle(4.0);

		for(int i=0; i < shapes.length; i++) {
			System.out.println("Имя объекта: " + shapes[i].getName());
			System.out.println("Площадь объекта: " + shapes[i].area());
			System.out.println();
		}
		//К методам, определенным только в подклассах у ссылочной переменной суперкласса нет доступа
		//shapes[0].showStyle();
		Triangle t1 = new Triangle("Контурный", 5.0, 4.5);
		t1.showStyle();
	}
}
