/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercise2.DataKTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author T.U.F GAMING
 */
@Controller
public class ProjectController {
    
    @RequestMapping("/dataktp")
    public String getTable(Model Data){
     ArrayList<List<String>> data = new ArrayList<>();
        
         data.add(Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
         data.add(Arrays.asList("11111","212000001","Rifqi","Balikpapan"));
         data.add(Arrays.asList("11112","212000002","Airel","Balikpapan"));
         data.add(Arrays.asList("11113","212000003","Eki","Palu"));
         data.add(Arrays.asList("11114","212000004","Barik","Riau"));
         data.add(Arrays.asList("11115","212000005","Andre","Berau"));
         data.add(Arrays.asList("11116","212000006","Fayad","Samarinda"));
         data.add(Arrays.asList("11117","212000007","Henrico","Yogyakarta"));
         data.add(Arrays.asList("11118","212000008","Ichsan","Cilegon"));
         data.add(Arrays.asList("11119","212000009","Beil","Makasar"));
         data.add(Arrays.asList("11110","212000010","Irsyad","Padang"));
         data.add(Arrays.asList("111111","21200011","Askar","Aceh"));
         data.add(Arrays.asList("111112","21200012","Budi","Jakarta"));
         data.add(Arrays.asList("111113","21200013","Dwi","Bandung"));
         data.add(Arrays.asList("111114","21200014","Emon","Sleman"));
         data.add(Arrays.asList("111115","21200015","Ahmad","Bandung"));
         data.add(Arrays.asList("111116","21200016","Asra","Jambi"));
         data.add(Arrays.asList("111117","21200017","Zulfa","Bengkulu"));
         data.add(Arrays.asList("111118","21200018","Asep","Garut"));
         data.add(Arrays.asList("111119","21200019","liam","Sleman"));
         data.add(Arrays.asList("111120","21200020","Rico","Magelang"));
         
         Data.addAttribute("Data Table", data);
         
         return "ProjectView";
    }
}
