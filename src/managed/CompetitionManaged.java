package managed;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ViewScoped
@ManagedBean(name = "comp_mngd")
public class CompetitionManaged {

    private String compName;
    private String compAbout;
    private Date ognoo;


    @PostConstruct
    public void init(){

    }


    public String registerCompetition(){

        System.out.println("PRINTING HERE");

        System.out.println(compName);
        return "comp";
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompAbout() {
        return compAbout;
    }

    public void setCompAbout(String compAbout) {
        this.compAbout = compAbout;
    }

    public Date getOgnoo() {
        return ognoo;
    }

    public void setOgnoo(Date ognoo) {
        this.ognoo = ognoo;
    }
}
