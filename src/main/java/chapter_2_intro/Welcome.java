package chapter_2_intro;

/**
 * Created by wrightm on 07/09/2014.
 */
public class Welcome {

    public static void main(String[] args){

        String[] message = new String[3];
        message[0] = "Welcome.";
        message[1] = "Hello Michael.";
        message[2] = "Enjoy.";

        for(String msg: message){
            System.out.println(msg);
        }

    }
}
