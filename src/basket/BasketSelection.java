package basket;

import basket.student;

public class BasketSelection {

    public static void main(String[] args) {


        student st1 = new student(" John", 150);
        student st2 = new student ( "Mary", 148 );
        student st3 = new student ("Jerry", 180);

        student []list = new student[3];
        list[0] = st1;
        list[1] = st2;
        list[2] = st3;

        for( int i =0; i<3; i++) {
            if(list[i].getHeight() > 150) {
                System.out.println(list[i].getName());
            }
        }
    }


}


