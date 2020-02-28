package Lesson11.generic;

public abstract class InsuranceCompany <T extends Person> {
    public void issuePolicy(T person){
        System.out.println("Request to Registry...");
        System.out.println("Commission agreement");

        registerPolicyLocally(person);

        System.out.println("Issue policy");
        System.out.println("Delivery policy");
    }

    protected abstract void registerPolicyLocally(T person);


}
