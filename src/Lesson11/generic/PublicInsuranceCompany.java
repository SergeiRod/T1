package Lesson11.generic;

public class PublicInsuranceCompany extends InsuranceCompany<Citizen> {

    @Override
    protected void registerPolicyLocally(Citizen citizen) {
        System.out.println("Register in Public Company");

    }
}
