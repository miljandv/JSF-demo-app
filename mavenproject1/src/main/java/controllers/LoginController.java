
package controllers;
import beans.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;


@ManagedBean
@SessionScoped
public class LoginController {
    private User user = new User();

    public String login(){
        if(user.getUsername().equals("pera") && user.getPassword().equals("7777")){
            return "welcome";
        }
        return null;
    }
    
    public User getUser (){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
    
    private String name;
    private String surname;
    private boolean terms;
    private String gender;
    private String occupation;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setTerms(boolean terms){
        this.terms = terms;
    }

    public boolean getTerms(){
        return terms;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender (){
        return gender;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getOccupation(){
        return occupation;
    }

    private String[] genders = new String[]{"Male","Female"};

    private ArrayList<String> occupations = new ArrayList<String>(){
        {
            add("Doctor");
            add("Developer");
            add("Teacher");
        }
    };
    
    public ArrayList<String> getOccupations(){
        return occupations;
    }
    
    public void setOccupations(ArrayList<String> occupations){
        this.occupations = occupations;
    }

    public String[] getGenders(){
        return genders;
    }
    
    public void setGenders(String[] genders){
        this.genders = genders;
    }
    
}


