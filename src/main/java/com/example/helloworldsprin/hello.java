package com.example.helloworldsprin;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;


@RestController

public class hello {
   // @RequestMapping(value="m/{msgrequest}",method= RequestMethod.GET)
  // @RequestMapping(path="/html")

   public String HTML(String h) {
       String htmlContent = "<style> .button {\n" +
               "            background-color: #4CAF90;\n" +
               "            color: white;\n" +
               "            padding: 10px 20px;\n" +
               "            text-align: center;\n" +
               "            text-decoration: none;\n" +
               "            display: inline-block;\n" +
               "            font-size: 16px;\n" +
               "            margin: 10px;\n" +
               "            cursor: pointer;\n" +
               "            border: none;\n" +
               "            border-radius: 5px;\n" +
               "        }\n" +
               "        .button:hover {\n" +
               "            background-color: #85a049;\n" +
               "        }\n" +
               "    </style><html><body><h1  style=\"color: cyan;\">"+h+"</h1></body> <form action=\"/hello-multiple\" method=\"\">\n" +
               "            <input type=\"submit\" value=\"Afficher\" class=\"button\">\n " +
               "        </form>"+" <form action=\"/greet\" method=\"\">\n<input type=\"submit\" value=\"Greeting people\" class=\"button\">\n <a href=\"/w\" class=\"button\">Write</a>\n<a href=\"/h\" class=\"button\">Hello</a>\n</form>"+"</html>";
       return htmlContent;
   }
    @GetMapping("/hello")
    public String ecrire(/*@PathVariable(value="") String msgrequest*/){
     return  HTML("Hello world et speciallement Fatima ");
       // return  "Hello world et speciallement Fatima ";
    }

    public String HTMLsimple(String h) {
        String htmlContent = "<html><body><h1  style=\"color: LightSalmon;\">"+h+"</h1></body> <form action=\"/hello-multiple\" method=\"\">\n" +
                "          </html>";
        return htmlContent;
    }
   //@RequestMapping(path="/hi")
@GetMapping("/w")
   public String write(){
        int x=10;
        int y=5;
        int sum=x+y;
        boolean isgreatinthan=x>y;
        boolean istrue=true && false;
        String resultat=Integer.toString(sum)+" "+isgreatinthan+" "+istrue;
        return HTMLsimple(resultat);

    }
    //@RequestMapping(path="/if")
@GetMapping("/h")
    public String helloo(){
        int hour = LocalTime.now().getHour();
        if(hour<12){
            return HTMLsimple("good morning");
        }
        else{
            return HTMLsimple("hello");
        }}
    @GetMapping("/hello-multiple")
        public String helloMultiple(){
         StringBuilder message=new StringBuilder();
            for(int i=0; i < 5;i++){
                message.append("Hello World").append(i).append("<br>");

              }
            return HTMLsimple(message.toString());
        }
public static int add(int a,int b){
       return a+b;
}
    @GetMapping("/greet")
    public String greet() {
        // Récupérez l'heure actuelle
        Date db = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String time = sdf.format(db);

        // Déterminez le salut en fonction de l'heure actuelle
        String greeting;
        if (time.compareTo("00:00") >= 0 && time.compareTo("11:59") <= 0) {
            greeting = "Good morning";
        } else if (time.compareTo("12:00") >= 0 && time.compareTo("16:59") <= 0) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }

        return greeting;
    }

    }

