package ws;

import java.util.Date;

public class compte {
    private int code;
    private double solde;
    private Date datecreation;

    public compte() {
    }

    public compte(int code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
