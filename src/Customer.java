public class Customer {
    public String name;
    public String accountnumber;
    public String phone;
    public String email;
    public double balance;
    public String password;


    public Customer(String name, String accountnumber, String phone, String email, double balance, String password) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
        this.password = password;
        printinformation();
    }

    public void printinformation() {
        System.out.println(
                " name :"+name+
                " \nphone:" + phone +
                "\n email:" + email +
                 "\n accountnumber:"+accountnumber);




    }
    public void addbalance(double amount){
        this.balance+=amount;
        System.out.println("sayin "+name+"hesabiniza "+amount+"tl yatirilmistir");

    }
    public void withdrawmoney(double amount) {
        if (amount<this.balance){
            this.balance-=amount;
            System.out.println("hesabinizdan"+amount+"cekilmistir");
        }else {
            System.out.println("yanlis girdinis");
        }

    }
    public void balancecheck(){
        System.out.println("bakiye"+balance);

    }
    public void passwordchange() {

    }

}
