package Lesson11.generic;

import Lesson17.CrimeException;

public class PublicInsuranceCompany extends InsuranceCompany<Citizen> {

    @Override
    protected void registerPolicyLocally(Citizen citizen) throws CrimeException {
        System.out.println("Register in Public Company");
        throw new CrimeException();

    }

}
