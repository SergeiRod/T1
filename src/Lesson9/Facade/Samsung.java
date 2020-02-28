package Lesson9.Facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung tab 3");
    }

    @Override
    public void price() {
        System.out.println("Rs 45000.00");
    }
}
