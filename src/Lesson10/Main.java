package Lesson10;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(12, "ww", null);
        MyClass.ProfessionalDate professionalDate = obj.new ProfessionalDate(34, 45, "rrr");
        MyClass.InnerStatic innerStatic = new MyClass.InnerStatic();

        MyInterface anonymousInitObject = new MyInterface() {


            @Override
            public void doSmt() {

            }

            @Override
            public void doSmt2() {

            }
        }; // ананимная инициализация
        anonymousInitObject.doSmt();
        anonymousInitObject.doSmt2();

        MyAbstract myAbstract = new MyAbstract() {
            @Override
            public void doAbstract() {

            }

            @Override
            public void doAbstract2() {

            }
        }; // ананимный вызов абтрактного класса
        myAbstract.doAbstract();
        myAbstract.doAbstract2();
        myAbstract.getMyInt();


    }
}
