package Lesson11.generic;

public class PrivateInsuranceCompany extends InsuranceCompany <Employee> {

    @Override
    protected void registerPolicyLocally(Employee employee) {
        System.out.println("Register in Private company");

    }
}
