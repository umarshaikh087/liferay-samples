/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prime.primeportlet;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TestBean implements Serializable {
    
    private String html;
    
    private Date date;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
