/**
 * This class represents a PolicyHolder with personal information
 * and health-related attributes such as height, weight, and smoking status.
 */
public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * No-argument constructor that initializes default values.
     * Default smoking status is "non-smoker", and numeric fields are set to 0.
     */
    public PolicyHolder() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Constructor that initializes a PolicyHolder with specified values.
     *
     * @param firstName The first name of the policyholder.
     * @param lastName The last name of the policyholder.
     * @param age The age of the policyholder.
     * @param smokingStatus The smoking status of the policyholder.
     * @param height The height of the policyholder in inches.
     * @param weight The weight of the policyholder in pounds.
     */
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Gets the first name of the policyholder.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the policyholder.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the policyholder.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the policyholder.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age of the policyholder.
     *
     * @return The age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the policyholder.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the smoking status of the policyholder.
     *
     * @return The smoking status.
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the smoking status of the policyholder.
     *
     * @param smokingStatus The smoking status to set.
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Gets the height of the policyholder.
     *
     * @return The height in inches.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the policyholder.
     *
     * @param height The height to set in inches.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the weight of the policyholder.
     *
     * @return The weight in pounds.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the policyholder.
     *
     * @param weight The weight to set in pounds.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates the BMI (Body Mass Index) of the policyholder.
     *
     * @return The BMI value.
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Returns a string representation of the PolicyHolder object.
     *
     * @return Formatted string containing first name, last name, age, smoking status, height, and weight.
     */
    @Override
    public String toString() {
        return "First Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nAge: " + age +
               "\nSmoking Status: " + smokingStatus +
               "\nHeight: " + height +
               "\nWeight: " + weight;
    }
}
