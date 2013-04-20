/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// https://netbeans.org/kb/docs/web/hibernate-webapp.html
package Hibernate;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Eusebius
 */
@ManagedBean
@SessionScoped
public class festivalManagedBean {

    /**
     * Creates a new instance of festivalManagedBean
     */
    
    int startId;
    int endId;
    DataModel festivalNames;
    festivalHelper helper;
    private int recordCount = 2;
    private int pageSize = 10;

    private Festivals current;
    private int selectedItemIndex;
    
    public festivalManagedBean() {
        helper = new festivalHelper();
        startId = 1;
        endId = 10;
    }

    public festivalManagedBean(int startId, int endId) {
        helper = new festivalHelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Festivals getSelected() {
        if (current == null) {
            current = new Festivals();
            selectedItemIndex = -1;
        }
        return current;
    }


    public DataModel getFestivalNames() {
        if (festivalNames == null) {
            festivalNames = new ListDataModel(helper.getFestivalNames(startId, endId));
        }
        return festivalNames;
    }

    void recreateModel() {
        festivalNames = null;
    }
    
     public boolean isHasNextPage() {
        if (endId + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startId-pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Festivals) getFestivalNames().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
    
     public String getBands() {
        List bands = helper.getBandsByID(current.getFestId());
        StringBuilder totalLineUp = new StringBuilder();
        for (int i = 0; i < bands.size(); i++) {
            Bands band = (Bands) bands.get(i);
            totalLineUp.append(band.getBandNaam());
            totalLineUp.append(" :");
            totalLineUp.append(band.getBandSoortMuziek());
            totalLineUp.append("; ");
        }
        return totalLineUp.toString();
    }
     
    public String getTicketypes() {
        List tickets = helper.getTicketsByID(current.getFestId());
        StringBuilder totalTickets = new StringBuilder();
        for (int i = 0; i < tickets.size(); i++) {
            Tickettypes ticket = (Tickettypes) tickets.get(i);
            totalTickets.append(ticket.getTypOmschr());
            totalTickets.append(" : €");
            totalTickets.append(ticket.getTypPrijs().toString());
            totalTickets.append("; ");
        }
        return totalTickets.toString();
    }
}
