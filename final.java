class A {
    void meth() {
        System.out.println("Метод meth() класса A");
    }
    final void meth2() {
	    System.out.println("Метод meth2() не допускает переопределение в подклассах");
    }
}
class B extends A {
    void meth() {
        System.out.println("Метод meth() класса A");
    }
    //Переопределение метода meth2() запрещено родительским классом
    //void meth2()
    //         System.out.println("Метод не допускает переопределенеи в подклассах");
}
final class C {
	int i=10;
}
class D extends A {
	int j = 20;
}
class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;
    String[] msgs = {
        "Ошибка вывода",
        "Ошбка ввода",
        "Переполнение диска",
        "Выход индекса индекса за границы массива"
    };
    String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length)
        return msgs[i];
        else
        return "Неизвестная ошибка";
    }
}
