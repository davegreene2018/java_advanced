/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Daveg
 */
public class CoronaVirusData {
    
    public static void main(String[] args) {
        final String url = "https://www.gov.ie/en/press-release/48be4e-statement-from-the-national-public-health-emergency-team-monday-11-m/#cases-by-county";
        
        try {
            final Document document = Jsoup.connect(url).get();
            //System.out.println(document.outerHtml());
           //div#maincounter-wrap:nth-of-type(4) > .maincounter-number > span
            for (Element row : document.select(
                "div.row:nth-of-type(20) tbody tr ")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                   final String county = 
                           row.select("td:nth-of-type(1)").text();
                   final String cases = 
                           row.select("td:nth-of-type(2)").text();
                   final String percent = 
                           row.select("td:nth-of-type(3)").text();
                   
                   System.out.println("County = " + county + " cases = " + cases + " percent = " + percent);
                  
                }
                
                
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            final Document document2 = Jsoup.connect(url).get();
            //System.out.println(document.outerHtml());
           //div#maincounter-wrap:nth-of-type(4) > .maincounter-number > span
             System.out.println("");
            for (Element row2 : document2.select(
                "div.row:nth-of-type(12) tbody tr ")) {
                if (row2.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                   final String gender = 
                           row2.select("td:nth-of-type(1)").text();
                   final String number = 
                           row2.select("td:nth-of-type(2)").text();
                   final String total = 
                           row2.select("td:nth-of-type(3)").text();
                   
                   System.out.println("Gender = " + gender + " Number = " + number + " total = " + total);
                }
                
                
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
}
}





               