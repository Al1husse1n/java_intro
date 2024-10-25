package java_intro_lab.java_intro.lab_one;

public class Main2 {
    public static void main(String[] args) {
        int coupons = 57;
        int gum = 0;
        int candy = 0;
        while(coupons >= 0){
            if(coupons >= 10){
                candy+=1;
                coupons-=10;     
            }
            else if(coupons>=3){
                gum+=1;
                coupons-=3;
            }
            else{
                break;
            }
        }
        System.out.println("number of coupons: " + coupons);
        System.out.println("number of gums: " + gum);
        System.out.println("number of candy: "+ candy);

    }    
}
