public class p92accessmodifiers {
   public static void main(String[] args) {
    BankAccount b1=new BankAccount();
    b1.username="madhav";
    b1.setPassword("Madhav24");
   }
}

class BankAccount{
   public  String username;
   private String password;

   public void setPassword(String pwd){
    password=pwd;
   }

}
