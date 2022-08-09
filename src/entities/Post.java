package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //Esse static foi necessário para que toda vez que usar o SimpleDateFormat não precisar instânciar.
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content; 
    private Integer likes;

    private List<Coment> comments = new ArrayList<>();

    public Post(){

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coment> getComments() {
        return comments;
    }

    //Métodos
    public void addComment(Coment comment){
        comments.add(comment);
    }
    public void removeComment(Coment comment){
        comments.remove(comment);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");

        //Para cada coment c na minha lista coments do post
        for (Coment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
        
    }
}
