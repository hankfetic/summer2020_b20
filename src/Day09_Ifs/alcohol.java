package Day09_Ifs;


// write a java program that can identify if  apreson is eligable to buy alcohol

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class alcohol {
    public static void main(String[] args) {

        boolean HasID = true;
        int age = 19;

        boolean eligible = HasID && age >= 21;
        //                  true && false ==> false

        String result = "";


        if (eligible == true) ;
        System.out.println("eligible to buy alcohol");
        result = "Eligable to buy alcohol";

        if (eligible == false);
        System.out.println("go buy milk");
        result = "You are not old enough to buy alcohol";

        System.out.println(result);


    }




}







