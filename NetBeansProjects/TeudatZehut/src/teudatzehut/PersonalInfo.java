/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teudatzehut;

/**
 *
 * @author 2003i
 */
public class PersonalInfo {
    private String shem;
    private String shemMishpakha;
    private String taarikhLeeda;
    private String irLeeda;
    private String medinaLeeda;
    private String azrakhot;
    private String taarikhAliyah;
    
    public PersonalInfo() {
        this.azrakhot = null;
        this.shemMishpakha = null;
        this.shem = null;
        this.medinaLeeda = null;
        this.irLeeda = null;
        this.taarikhLeeda = null;
        this.taarikhAliyah = null;
    }

    public PersonalInfo(String shem, String shemMishpakha, String taarikhLeeda, 
            String irLeeda, String medinaLeeda, String azrakhot, String taarikhAliyah) {
        this.shem = shem;
        this.shemMishpakha = shemMishpakha;
        this.taarikhLeeda = taarikhLeeda;
        this.irLeeda = irLeeda;
        this.medinaLeeda = medinaLeeda;
        this.azrakhot = azrakhot;
        this.taarikhAliyah = taarikhAliyah;
    }
    
    public PersonalInfo(PersonalInfo personalInfo) {
        this.shem = personalInfo.shem;
        this.shemMishpakha = personalInfo.shemMishpakha;
        this.taarikhLeeda = personalInfo.taarikhLeeda;
        this.irLeeda = personalInfo.irLeeda;
        this.medinaLeeda = personalInfo.medinaLeeda;
        this.azrakhot = personalInfo.azrakhot;
        this.taarikhAliyah = personalInfo.taarikhAliyah;
    }
    
    @Override
    public String toString() {
    String str = "";
    
    str += String.format("%s: %-20s\n", "שם", shem);
    str += String.format("%s: %-20s\n", "שם משפחה", shemMishpakha);
    str += String.format("%s: %-20s\n", "תאריך לידה", taarikhLeeda);
    str += String.format("%s: %-20s\n", "מקום לידה",irLeeda + ", " + medinaLeeda);
    str += String.format("%s: %-20s\n", "אזרחות", azrakhot);
    str += String.format("%s: %-20s\n", "תאריך עליה", taarikhAliyah);
            
    return str;
    }

    public String getAzrakhot() {
        return azrakhot;
    }

    public void setAzrakhot(String azrakhot) {
        this.azrakhot = azrakhot;
    }

    public String getIrLeeda() {
        return irLeeda;
    }

    public void setIrLeeda(String irLeeda) {
        this.irLeeda = irLeeda;
    }

    public String getMedinaLeeda() {
        return medinaLeeda;
    }

    public void setMedinaLeeda(String medinaLeeda) {
        this.medinaLeeda = medinaLeeda;
    }

    public String getShem() {
        return shem;
    }

    public void setShem(String shem) {
        this.shem = shem;
    }

    public String getShemMishpakha() {
        return shemMishpakha;
    }

    public void setShemMishpakha(String shemMishpakha) {
        this.shemMishpakha = shemMishpakha;
    }

    public String getTaarikhAliyah() {
        return taarikhAliyah;
    }

    public void setTaarikhAliyah(String taarikhAliyah) {
        this.taarikhAliyah = taarikhAliyah;
    }
}
