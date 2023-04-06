/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mukesh
 */
@Entity
@Table(name = "STUDENTINFO")
@NamedQueries({
    @NamedQuery(name = "Studentinfo.findAll", query = "SELECT s FROM Studentinfo s"),
    @NamedQuery(name = "Studentinfo.findByStudentclass", query = "SELECT s FROM Studentinfo s WHERE s.studentclass = :studentclass"),
    @NamedQuery(name = "Studentinfo.findByStudentaddress", query = "SELECT s FROM Studentinfo s WHERE s.studentaddress = :studentaddress"),
    @NamedQuery(name = "Studentinfo.findByStudentname", query = "SELECT s FROM Studentinfo s WHERE s.studentname = :studentname"),
    @NamedQuery(name = "Studentinfo.findByStudentsubject", query = "SELECT s FROM Studentinfo s WHERE s.studentsubject = :studentsubject")})
public class Studentinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENTCLASS")
    private Integer studentclass;
    @Size(max = 40)
    @Column(name = "STUDENTADDRESS")
    private String studentaddress;
    @Size(max = 40)
    @Column(name = "STUDENTNAME")
    private String studentname;
    @Size(max = 40)
    @Column(name = "STUDENTSUBJECT")
    private String studentsubject;

    public Studentinfo() {
    }

    public Studentinfo(Integer studentclass) {
        this.studentclass = studentclass;
    }

    public Integer getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(Integer studentclass) {
        this.studentclass = studentclass;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentsubject() {
        return studentsubject;
    }

    public void setStudentsubject(String studentsubject) {
        this.studentsubject = studentsubject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentclass != null ? studentclass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentinfo)) {
            return false;
        }
        Studentinfo other = (Studentinfo) object;
        if ((this.studentclass == null && other.studentclass != null) || (this.studentclass != null && !this.studentclass.equals(other.studentclass))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public String toString() {
        return "entites.Studentinfo[ studentclass=" + studentclass + " ]";
    }
    
}
