public class Guest {

    // declare properties
    private String name;
    private int age;
    private double wallet;
    private int sobriety;
    private boolean ban;
    private char currency;
    private String favouriteDrink;

    // constructor
    public Guest(String name, int age, double wallet, int sobriety, boolean ban, char currency){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.ban = ban;
        this.currency = currency;
    }

    // getter and setter
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public double getWallet() {return this.wallet;}
    public int getSobriety() {return this.sobriety;}
    public boolean isBan() {return this.ban;}
    public char isChar() {return this.currency;}
}
