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
public class TeudatZehut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonalInfo personalInfo = new PersonalInfo("איגור", "רייגורודסקי", "08/07/2003", 
                "קייב", "אוקראינה", "ישראלי", "03/03/2015");
        personalInfo.setAzrakhot("ישראלי, אוקראיני");
        System.out.println(personalInfo.toString());
    }
    
}
