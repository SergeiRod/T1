package Lesson11.generic;

import Lesson17.CrimeException;

public class PublicInsuranceCompany extends InsuranceCompany<Citizen> {

    @Override
    public void registerPolicyLocally(Citizen citizen) throws CrimeException {

        if (citizen.isCrime()) {
            throw new CrimeException();
        }
        System.out.println("Register in Public Company");
    }
}
