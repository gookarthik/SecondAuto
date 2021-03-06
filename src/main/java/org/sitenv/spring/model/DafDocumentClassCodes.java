package org.sitenv.spring.model;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by Prabhushankar.Byrapp on 8/9/2015.
 */

@Entity
@Table(name = "doc_class_codes")
public class DafDocumentClassCodes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "display")
    private String display;

    @Column(name = "system")
    private String system;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}
