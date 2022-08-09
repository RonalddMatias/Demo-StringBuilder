import java.text.SimpleDateFormat;

import entities.Coment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");


        Coment c1 = new Coment("Have a nice trip!");
        Coment c2 = new Coment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
         "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

         p1.addComment(c1);
         p1.addComment(c2);

         System.out.println(p1);

        Coment c3 = new Coment("Good Night");
        Coment c4 = new Coment("May the Force be with you");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

        
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

    }
}
