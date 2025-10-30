/**
 * This class represents an insurance policy.
 * It contains the policy number, provider name, and a reference to a PolicyHolder.
 */
public class Policy {
    private static int numberOfPolicies = 0;
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // Reference to a PolicyHolder

    /**
     * No-argument constructor that initializes default values.
     * Increments the total number of policies created.
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolder = new PolicyHolder();
        numberOfPolicies++;
    }

    /**
     * Constructor that initializes a Policy with the specified values.
     *
     * @param policyNumber The policy number.
     * @param providerName The insurance provider name.
     * @param policyHolder The PolicyHolder associated with this policy.
     */
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        numberOfPolicies++;
    }

    /**
     * Gets the policy number.
     *
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber The policy number to set.
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the insurance provider name.
     *
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the insurance provider name.
     *
     * @param providerName The provider name to set.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the PolicyHolder associated with this policy.
     *
     * @return The policy holder.
     */
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the PolicyHolder associated with this policy.
     *
     * @param policyHolder The PolicyHolder to set.
     */
    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    /**
     * Returns a string representation of the Policy object.
     *
     * @return A formatted string containing policy number, provider name, and policy holder information.
     */
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\nPolicyHolder: " + policyHolder.toString();
    }

    /**
     * Calculates the insurance price based on the PolicyHolder's attributes.
     * Additional fees are applied for age over 50, smokers, and high BMI (>35).
     *
     * @param policyHolder The PolicyHolder for whom to calculate the price.
     * @return The total insurance price.
     */
    public double calculateInsurancePrice(PolicyHolder policyHolder) {
        double baseFee = 600;
        double additionalFee = 0;

        if (policyHolder.getAge() > 50) {
            additionalFee += 75;
        }
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            additionalFee += 100;
        }

        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }

    /**
     * Gets the total number of Policy objects created.
     *
     * @return The number of Policy objects created.
     */
    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }
}
