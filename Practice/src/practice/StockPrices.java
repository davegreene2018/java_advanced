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
public class StockPrices {
    
    public static void main(String[] args) {
        final String url = 
                //"https://www.davy.ie/market-and-insights#tab__share-prices_3";
            "https://www.londonstockexchange.com/exchange/prices-and-markets/stocks/indices/ftse-indices.html";
        
        try {
            final Document document = Jsoup.connect(url).get();
            //System.out.println(document.outerHtml());
             System.out.println("NAME VALUE STATUS PERCENTAGE HIGH LOW PREVIOUS CLOSE");
            
            for (Element row : document.select(
                "tbody tr ")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                   final String name = 
                           row.select("td:nth-of-type(1)").text();
                   final String value = 
                           row.select("td:nth-of-type(2)").text();
                   final String status = 
                           row.select("td:nth-of-type(3)").text();
                  final String percent = 
                           row.select("td:nth-of-type(4)").text();
                  final String high = 
                           row.select("td:nth-of-type(5)").text();
                  final String low = 
                           row.select("td:nth-of-type(6)").text();
                  final String prevClose = 
                           row.select("td:nth-of-type(7)").text();
//                    final double price = Double.parseDouble(tempPrice1);
                   
                    System.out.println(name  + value +  status +  percent +  high +  low +  prevClose);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
