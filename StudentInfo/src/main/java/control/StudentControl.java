
package control;

import entites.Studentinfo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.StudentinfoFacade;

/**
 *
 * @author mukesh
 */
@Named(value = "studentControl")
@SessionScoped
public class StudentControl implements Serializable {
 private Studentinfo studentinfo=new Studentinfo();

    public Studentinfo getStudent() {
        return studentinfo;
    }

    public void setStudent(Studentinfo student) {
        this.studentinfo = studentinfo;
    }
 

    @EJB
    private StudentinfoFacade studentinfoFacade;
    

    /**
     * Creates a new instance of StudentControl
     */
    public StudentControl() {
        
    }
    public List<Studentinfo> findAll(){
        
        
        
      return this.studentinfoFacade.findAll();
    
    
    }
    public String insert(){
        
    this.studentinfoFacade.create(studentinfo);
    this.studentinfo= new Studentinfo();
    return "index";
    }
public String update(Studentinfo e){
    this.studentinfo=e;
    return "Update";
    
}
public String update (){
    this.studentinfoFacade.edit(studentinfo);
    this.studentinfo=studentinfo;
    return "index";
    
}
public void delete(Studentinfo studentinfo){
    this.studentinfoFacade.remove(studentinfo);
    
}
   
   
   
    
}
