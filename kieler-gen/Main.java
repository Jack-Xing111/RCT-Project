

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.*;

public class Main {

    public static UseCase1 model = new UseCase1();
    
    private static long _tickstart;
private static long _ticktime;

    
    public static BufferedReader stdInReader = new BufferedReader(new InputStreamReader(System.in));
            
    private static void receiveVariables() {
        try {
            String line = stdInReader.readLine();
            JSONObject json = new JSONObject(line);
            
            // Receive _UseCase1_local_ActionDone
            if (json.has("_UseCase1_local_ActionDone")) {
                model._UseCase1_local_ActionDone = json.getBoolean("_UseCase1_local_ActionDone");
            }
            // Receive _UseCase1_local_ActionDone1
            if (json.has("_UseCase1_local_ActionDone1")) {
                model._UseCase1_local_ActionDone1 = json.getBoolean("_UseCase1_local_ActionDone1");
            }
            // Receive _region0_c1_start
            if (json.has("_region0_c1_start")) {
                model._region0_c1_start = json.getBoolean("_region0_c1_start");
            }
            // Receive _region0_c1_stop
            if (json.has("_region0_c1_stop")) {
                model._region0_c1_stop = json.getBoolean("_region0_c1_stop");
            }
            // Receive _region1_c2_start
            if (json.has("_region1_c2_start")) {
                model._region1_c2_start = json.getBoolean("_region1_c2_start");
            }
            // Receive _region1_c2_stop
            if (json.has("_region1_c2_stop")) {
                model._region1_c2_stop = json.getBoolean("_region1_c2_stop");
            }
            // Receive deltaT
            if (json.has("deltaT")) {
                model.deltaT = json.getDouble("deltaT");
            }
            // Receive _UseCase1_local_Remind_Nurse
            if (json.has("_UseCase1_local_Remind_Nurse")) {
                model._UseCase1_local_Remind_Nurse = json.getBoolean("_UseCase1_local_Remind_Nurse");
            }
            // Receive _UseCase1_local_Remind_Nurse1
            if (json.has("_UseCase1_local_Remind_Nurse1")) {
                model._UseCase1_local_Remind_Nurse1 = json.getBoolean("_UseCase1_local_Remind_Nurse1");
            }
            // Receive sleepT
            if (json.has("sleepT")) {
                model.sleepT = json.getDouble("sleepT");
            }
            // Receive #ticktime
            if (json.has("#ticktime")) {
                _ticktime = json.getInt("#ticktime");
            }
            // Receive _GO
            if (json.has("_GO")) {
                model._GO = json.getBoolean("_GO");
            }
            // Receive _TERM
            if (json.has("_TERM")) {
                model._TERM = json.getBoolean("_TERM");
            }
            // Receive _UseCase1_local__Atrig
            if (json.has("_UseCase1_local__Atrig")) {
                model._UseCase1_local__Atrig = json.getBoolean("_UseCase1_local__Atrig");
            }
            // Receive _UseCase1_local__Atrig1
            if (json.has("_UseCase1_local__Atrig1")) {
                model._UseCase1_local__Atrig1 = json.getBoolean("_UseCase1_local__Atrig1");
            }
            // Receive _UseCase1_local__Atrig2
            if (json.has("_UseCase1_local__Atrig2")) {
                model._UseCase1_local__Atrig2 = json.getBoolean("_UseCase1_local__Atrig2");
            }
            // Receive _UseCase1_local__Atrig3
            if (json.has("_UseCase1_local__Atrig3")) {
                model._UseCase1_local__Atrig3 = json.getBoolean("_UseCase1_local__Atrig3");
            }
            // Receive _UseCase1_local_x
            if (json.has("_UseCase1_local_x")) {
                model._UseCase1_local_x = json.getDouble("_UseCase1_local_x");
            }
            // Receive _UseCase1_local_x1
            if (json.has("_UseCase1_local_x1")) {
                model._UseCase1_local_x1 = json.getDouble("_UseCase1_local_x1");
            }
            // Receive _cg101
            if (json.has("_cg101")) {
                model._cg101 = json.getBoolean("_cg101");
            }
            // Receive _cg105
            if (json.has("_cg105")) {
                model._cg105 = json.getBoolean("_cg105");
            }
            // Receive _cg11
            if (json.has("_cg11")) {
                model._cg11 = json.getBoolean("_cg11");
            }
            // Receive _cg111
            if (json.has("_cg111")) {
                model._cg111 = json.getBoolean("_cg111");
            }
            // Receive _cg115
            if (json.has("_cg115")) {
                model._cg115 = json.getBoolean("_cg115");
            }
            // Receive _cg12
            if (json.has("_cg12")) {
                model._cg12 = json.getBoolean("_cg12");
            }
            // Receive _cg14
            if (json.has("_cg14")) {
                model._cg14 = json.getBoolean("_cg14");
            }
            // Receive _cg17
            if (json.has("_cg17")) {
                model._cg17 = json.getBoolean("_cg17");
            }
            // Receive _cg19
            if (json.has("_cg19")) {
                model._cg19 = json.getBoolean("_cg19");
            }
            // Receive _cg21
            if (json.has("_cg21")) {
                model._cg21 = json.getBoolean("_cg21");
            }
            // Receive _cg25
            if (json.has("_cg25")) {
                model._cg25 = json.getBoolean("_cg25");
            }
            // Receive _cg26
            if (json.has("_cg26")) {
                model._cg26 = json.getBoolean("_cg26");
            }
            // Receive _cg29
            if (json.has("_cg29")) {
                model._cg29 = json.getBoolean("_cg29");
            }
            // Receive _cg30
            if (json.has("_cg30")) {
                model._cg30 = json.getBoolean("_cg30");
            }
            // Receive _cg33
            if (json.has("_cg33")) {
                model._cg33 = json.getBoolean("_cg33");
            }
            // Receive _cg34
            if (json.has("_cg34")) {
                model._cg34 = json.getBoolean("_cg34");
            }
            // Receive _cg36
            if (json.has("_cg36")) {
                model._cg36 = json.getBoolean("_cg36");
            }
            // Receive _cg39
            if (json.has("_cg39")) {
                model._cg39 = json.getBoolean("_cg39");
            }
            // Receive _cg41
            if (json.has("_cg41")) {
                model._cg41 = json.getBoolean("_cg41");
            }
            // Receive _cg43
            if (json.has("_cg43")) {
                model._cg43 = json.getBoolean("_cg43");
            }
            // Receive _cg47
            if (json.has("_cg47")) {
                model._cg47 = json.getBoolean("_cg47");
            }
            // Receive _cg53
            if (json.has("_cg53")) {
                model._cg53 = json.getBoolean("_cg53");
            }
            // Receive _cg57
            if (json.has("_cg57")) {
                model._cg57 = json.getBoolean("_cg57");
            }
            // Receive _cg65
            if (json.has("_cg65")) {
                model._cg65 = json.getBoolean("_cg65");
            }
            // Receive _cg66
            if (json.has("_cg66")) {
                model._cg66 = json.getBoolean("_cg66");
            }
            // Receive _cg69
            if (json.has("_cg69")) {
                model._cg69 = json.getBoolean("_cg69");
            }
            // Receive _cg7
            if (json.has("_cg7")) {
                model._cg7 = json.getBoolean("_cg7");
            }
            // Receive _cg70
            if (json.has("_cg70")) {
                model._cg70 = json.getBoolean("_cg70");
            }
            // Receive _cg72
            if (json.has("_cg72")) {
                model._cg72 = json.getBoolean("_cg72");
            }
            // Receive _cg75
            if (json.has("_cg75")) {
                model._cg75 = json.getBoolean("_cg75");
            }
            // Receive _cg77
            if (json.has("_cg77")) {
                model._cg77 = json.getBoolean("_cg77");
            }
            // Receive _cg79
            if (json.has("_cg79")) {
                model._cg79 = json.getBoolean("_cg79");
            }
            // Receive _cg8
            if (json.has("_cg8")) {
                model._cg8 = json.getBoolean("_cg8");
            }
            // Receive _cg83
            if (json.has("_cg83")) {
                model._cg83 = json.getBoolean("_cg83");
            }
            // Receive _cg84
            if (json.has("_cg84")) {
                model._cg84 = json.getBoolean("_cg84");
            }
            // Receive _cg87
            if (json.has("_cg87")) {
                model._cg87 = json.getBoolean("_cg87");
            }
            // Receive _cg88
            if (json.has("_cg88")) {
                model._cg88 = json.getBoolean("_cg88");
            }
            // Receive _cg91
            if (json.has("_cg91")) {
                model._cg91 = json.getBoolean("_cg91");
            }
            // Receive _cg92
            if (json.has("_cg92")) {
                model._cg92 = json.getBoolean("_cg92");
            }
            // Receive _cg94
            if (json.has("_cg94")) {
                model._cg94 = json.getBoolean("_cg94");
            }
            // Receive _cg97
            if (json.has("_cg97")) {
                model._cg97 = json.getBoolean("_cg97");
            }
            // Receive _cg99
            if (json.has("_cg99")) {
                model._cg99 = json.getBoolean("_cg99");
            }
            // Receive _g100
            if (json.has("_g100")) {
                model._g100 = json.getBoolean("_g100");
            }
            // Receive _g101
            if (json.has("_g101")) {
                model._g101 = json.getBoolean("_g101");
            }
            // Receive _g102
            if (json.has("_g102")) {
                model._g102 = json.getBoolean("_g102");
            }
            // Receive _g105
            if (json.has("_g105")) {
                model._g105 = json.getBoolean("_g105");
            }
            // Receive _g106
            if (json.has("_g106")) {
                model._g106 = json.getBoolean("_g106");
            }
            // Receive _g106_e2
            if (json.has("_g106_e2")) {
                model._g106_e2 = json.getBoolean("_g106_e2");
            }
            // Receive _g107
            if (json.has("_g107")) {
                model._g107 = json.getBoolean("_g107");
            }
            // Receive _g11
            if (json.has("_g11")) {
                model._g11 = json.getBoolean("_g11");
            }
            // Receive _g12
            if (json.has("_g12")) {
                model._g12 = json.getBoolean("_g12");
            }
            // Receive _g14
            if (json.has("_g14")) {
                model._g14 = json.getBoolean("_g14");
            }
            // Receive _g17
            if (json.has("_g17")) {
                model._g17 = json.getBoolean("_g17");
            }
            // Receive _g18
            if (json.has("_g18")) {
                model._g18 = json.getBoolean("_g18");
            }
            // Receive _g18_e2
            if (json.has("_g18_e2")) {
                model._g18_e2 = json.getBoolean("_g18_e2");
            }
            // Receive _g19
            if (json.has("_g19")) {
                model._g19 = json.getBoolean("_g19");
            }
            // Receive _g2
            if (json.has("_g2")) {
                model._g2 = json.getBoolean("_g2");
            }
            // Receive _g20
            if (json.has("_g20")) {
                model._g20 = json.getBoolean("_g20");
            }
            // Receive _g21
            if (json.has("_g21")) {
                model._g21 = json.getBoolean("_g21");
            }
            // Receive _g22
            if (json.has("_g22")) {
                model._g22 = json.getBoolean("_g22");
            }
            // Receive _g22_e1
            if (json.has("_g22_e1")) {
                model._g22_e1 = json.getBoolean("_g22_e1");
            }
            // Receive _g23
            if (json.has("_g23")) {
                model._g23 = json.getBoolean("_g23");
            }
            // Receive _g25
            if (json.has("_g25")) {
                model._g25 = json.getBoolean("_g25");
            }
            // Receive _g26
            if (json.has("_g26")) {
                model._g26 = json.getBoolean("_g26");
            }
            // Receive _g27
            if (json.has("_g27")) {
                model._g27 = json.getBoolean("_g27");
            }
            // Receive _g29
            if (json.has("_g29")) {
                model._g29 = json.getBoolean("_g29");
            }
            // Receive _g30
            if (json.has("_g30")) {
                model._g30 = json.getBoolean("_g30");
            }
            // Receive _g31
            if (json.has("_g31")) {
                model._g31 = json.getBoolean("_g31");
            }
            // Receive _g31_e1
            if (json.has("_g31_e1")) {
                model._g31_e1 = json.getBoolean("_g31_e1");
            }
            // Receive _g32
            if (json.has("_g32")) {
                model._g32 = json.getBoolean("_g32");
            }
            // Receive _g33
            if (json.has("_g33")) {
                model._g33 = json.getBoolean("_g33");
            }
            // Receive _g34
            if (json.has("_g34")) {
                model._g34 = json.getBoolean("_g34");
            }
            // Receive _g35
            if (json.has("_g35")) {
                model._g35 = json.getBoolean("_g35");
            }
            // Receive _g36
            if (json.has("_g36")) {
                model._g36 = json.getBoolean("_g36");
            }
            // Receive _g39
            if (json.has("_g39")) {
                model._g39 = json.getBoolean("_g39");
            }
            // Receive _g40
            if (json.has("_g40")) {
                model._g40 = json.getBoolean("_g40");
            }
            // Receive _g40_e2
            if (json.has("_g40_e2")) {
                model._g40_e2 = json.getBoolean("_g40_e2");
            }
            // Receive _g41
            if (json.has("_g41")) {
                model._g41 = json.getBoolean("_g41");
            }
            // Receive _g42
            if (json.has("_g42")) {
                model._g42 = json.getBoolean("_g42");
            }
            // Receive _g43
            if (json.has("_g43")) {
                model._g43 = json.getBoolean("_g43");
            }
            // Receive _g44
            if (json.has("_g44")) {
                model._g44 = json.getBoolean("_g44");
            }
            // Receive _g47
            if (json.has("_g47")) {
                model._g47 = json.getBoolean("_g47");
            }
            // Receive _g48
            if (json.has("_g48")) {
                model._g48 = json.getBoolean("_g48");
            }
            // Receive _g48_e2
            if (json.has("_g48_e2")) {
                model._g48_e2 = json.getBoolean("_g48_e2");
            }
            // Receive _g49
            if (json.has("_g49")) {
                model._g49 = json.getBoolean("_g49");
            }
            // Receive _g5
            if (json.has("_g5")) {
                model._g5 = json.getBoolean("_g5");
            }
            // Receive _g50
            if (json.has("_g50")) {
                model._g50 = json.getBoolean("_g50");
            }
            // Receive _g50_e1
            if (json.has("_g50_e1")) {
                model._g50_e1 = json.getBoolean("_g50_e1");
            }
            // Receive _g53
            if (json.has("_g53")) {
                model._g53 = json.getBoolean("_g53");
            }
            // Receive _g54
            if (json.has("_g54")) {
                model._g54 = json.getBoolean("_g54");
            }
            // Receive _g54_e2
            if (json.has("_g54_e2")) {
                model._g54_e2 = json.getBoolean("_g54_e2");
            }
            // Receive _g55
            if (json.has("_g55")) {
                model._g55 = json.getBoolean("_g55");
            }
            // Receive _g57
            if (json.has("_g57")) {
                model._g57 = json.getBoolean("_g57");
            }
            // Receive _g60
            if (json.has("_g60")) {
                model._g60 = json.getBoolean("_g60");
            }
            // Receive _g63
            if (json.has("_g63")) {
                model._g63 = json.getBoolean("_g63");
            }
            // Receive _g65
            if (json.has("_g65")) {
                model._g65 = json.getBoolean("_g65");
            }
            // Receive _g66
            if (json.has("_g66")) {
                model._g66 = json.getBoolean("_g66");
            }
            // Receive _g67
            if (json.has("_g67")) {
                model._g67 = json.getBoolean("_g67");
            }
            // Receive _g67_e1
            if (json.has("_g67_e1")) {
                model._g67_e1 = json.getBoolean("_g67_e1");
            }
            // Receive _g69
            if (json.has("_g69")) {
                model._g69 = json.getBoolean("_g69");
            }
            // Receive _g7
            if (json.has("_g7")) {
                model._g7 = json.getBoolean("_g7");
            }
            // Receive _g70
            if (json.has("_g70")) {
                model._g70 = json.getBoolean("_g70");
            }
            // Receive _g75
            if (json.has("_g75")) {
                model._g75 = json.getBoolean("_g75");
            }
            // Receive _g76
            if (json.has("_g76")) {
                model._g76 = json.getBoolean("_g76");
            }
            // Receive _g76_e2
            if (json.has("_g76_e2")) {
                model._g76_e2 = json.getBoolean("_g76_e2");
            }
            // Receive _g77
            if (json.has("_g77")) {
                model._g77 = json.getBoolean("_g77");
            }
            // Receive _g78
            if (json.has("_g78")) {
                model._g78 = json.getBoolean("_g78");
            }
            // Receive _g79
            if (json.has("_g79")) {
                model._g79 = json.getBoolean("_g79");
            }
            // Receive _g8
            if (json.has("_g8")) {
                model._g8 = json.getBoolean("_g8");
            }
            // Receive _g80
            if (json.has("_g80")) {
                model._g80 = json.getBoolean("_g80");
            }
            // Receive _g80_e1
            if (json.has("_g80_e1")) {
                model._g80_e1 = json.getBoolean("_g80_e1");
            }
            // Receive _g81
            if (json.has("_g81")) {
                model._g81 = json.getBoolean("_g81");
            }
            // Receive _g84
            if (json.has("_g84")) {
                model._g84 = json.getBoolean("_g84");
            }
            // Receive _g85
            if (json.has("_g85")) {
                model._g85 = json.getBoolean("_g85");
            }
            // Receive _g87
            if (json.has("_g87")) {
                model._g87 = json.getBoolean("_g87");
            }
            // Receive _g88
            if (json.has("_g88")) {
                model._g88 = json.getBoolean("_g88");
            }
            // Receive _g89
            if (json.has("_g89")) {
                model._g89 = json.getBoolean("_g89");
            }
            // Receive _g89_e1
            if (json.has("_g89_e1")) {
                model._g89_e1 = json.getBoolean("_g89_e1");
            }
            // Receive _g9
            if (json.has("_g9")) {
                model._g9 = json.getBoolean("_g9");
            }
            // Receive _g90
            if (json.has("_g90")) {
                model._g90 = json.getBoolean("_g90");
            }
            // Receive _g92
            if (json.has("_g92")) {
                model._g92 = json.getBoolean("_g92");
            }
            // Receive _g93
            if (json.has("_g93")) {
                model._g93 = json.getBoolean("_g93");
            }
            // Receive _g98
            if (json.has("_g98")) {
                model._g98 = json.getBoolean("_g98");
            }
            // Receive _g98_e2
            if (json.has("_g98_e2")) {
                model._g98_e2 = json.getBoolean("_g98_e2");
            }
            // Receive _g99
            if (json.has("_g99")) {
                model._g99 = json.getBoolean("_g99");
            }
            // Receive _g9_e1
            if (json.has("_g9_e1")) {
                model._g9_e1 = json.getBoolean("_g9_e1");
            }
            // Receive _pg101
            if (json.has("_pg101")) {
                model._pg101 = json.getBoolean("_pg101");
            }
            // Receive _pg102
            if (json.has("_pg102")) {
                model._pg102 = json.getBoolean("_pg102");
            }
            // Receive _pg12
            if (json.has("_pg12")) {
                model._pg12 = json.getBoolean("_pg12");
            }
            // Receive _pg18_e2
            if (json.has("_pg18_e2")) {
                model._pg18_e2 = json.getBoolean("_pg18_e2");
            }
            // Receive _pg19
            if (json.has("_pg19")) {
                model._pg19 = json.getBoolean("_pg19");
            }
            // Receive _pg30
            if (json.has("_pg30")) {
                model._pg30 = json.getBoolean("_pg30");
            }
            // Receive _pg32
            if (json.has("_pg32")) {
                model._pg32 = json.getBoolean("_pg32");
            }
            // Receive _pg35
            if (json.has("_pg35")) {
                model._pg35 = json.getBoolean("_pg35");
            }
            // Receive _pg39
            if (json.has("_pg39")) {
                model._pg39 = json.getBoolean("_pg39");
            }
            // Receive _pg43
            if (json.has("_pg43")) {
                model._pg43 = json.getBoolean("_pg43");
            }
            // Receive _pg44
            if (json.has("_pg44")) {
                model._pg44 = json.getBoolean("_pg44");
            }
            // Receive _pg66
            if (json.has("_pg66")) {
                model._pg66 = json.getBoolean("_pg66");
            }
            // Receive _pg67
            if (json.has("_pg67")) {
                model._pg67 = json.getBoolean("_pg67");
            }
            // Receive _pg69
            if (json.has("_pg69")) {
                model._pg69 = json.getBoolean("_pg69");
            }
            // Receive _pg70
            if (json.has("_pg70")) {
                model._pg70 = json.getBoolean("_pg70");
            }
            // Receive _pg77
            if (json.has("_pg77")) {
                model._pg77 = json.getBoolean("_pg77");
            }
            // Receive _pg8
            if (json.has("_pg8")) {
                model._pg8 = json.getBoolean("_pg8");
            }
            // Receive _pg90
            if (json.has("_pg90")) {
                model._pg90 = json.getBoolean("_pg90");
            }
            // Receive _pg92
            if (json.has("_pg92")) {
                model._pg92 = json.getBoolean("_pg92");
            }
            // Receive _pg93
            if (json.has("_pg93")) {
                model._pg93 = json.getBoolean("_pg93");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
           // Ignore other input
        }
    }
    
    private static void sendVariables() {
        JSONObject json = new JSONObject();
        
        // Send _UseCase1_local_ActionDone
        json.put("_UseCase1_local_ActionDone", JSONObject.wrap(model._UseCase1_local_ActionDone));
        // Send _UseCase1_local_ActionDone1
        json.put("_UseCase1_local_ActionDone1", JSONObject.wrap(model._UseCase1_local_ActionDone1));
        // Send _region0_c1_start
        json.put("_region0_c1_start", JSONObject.wrap(model._region0_c1_start));
        // Send _region0_c1_stop
        json.put("_region0_c1_stop", JSONObject.wrap(model._region0_c1_stop));
        // Send _region1_c2_start
        json.put("_region1_c2_start", JSONObject.wrap(model._region1_c2_start));
        // Send _region1_c2_stop
        json.put("_region1_c2_stop", JSONObject.wrap(model._region1_c2_stop));
        // Send deltaT
        json.put("deltaT", JSONObject.wrap(model.deltaT));
        // Send _UseCase1_local_Remind_Nurse
        json.put("_UseCase1_local_Remind_Nurse", JSONObject.wrap(model._UseCase1_local_Remind_Nurse));
        // Send _UseCase1_local_Remind_Nurse1
        json.put("_UseCase1_local_Remind_Nurse1", JSONObject.wrap(model._UseCase1_local_Remind_Nurse1));
        // Send sleepT
        json.put("sleepT", JSONObject.wrap(model.sleepT));
        // Send #ticktime
        json.put("#ticktime", _ticktime);
        // Send _GO
        json.put("_GO", JSONObject.wrap(model._GO));
        // Send _TERM
        json.put("_TERM", JSONObject.wrap(model._TERM));
        // Send _UseCase1_local__Atrig
        json.put("_UseCase1_local__Atrig", JSONObject.wrap(model._UseCase1_local__Atrig));
        // Send _UseCase1_local__Atrig1
        json.put("_UseCase1_local__Atrig1", JSONObject.wrap(model._UseCase1_local__Atrig1));
        // Send _UseCase1_local__Atrig2
        json.put("_UseCase1_local__Atrig2", JSONObject.wrap(model._UseCase1_local__Atrig2));
        // Send _UseCase1_local__Atrig3
        json.put("_UseCase1_local__Atrig3", JSONObject.wrap(model._UseCase1_local__Atrig3));
        // Send _UseCase1_local_x
        json.put("_UseCase1_local_x", JSONObject.wrap(model._UseCase1_local_x));
        // Send _UseCase1_local_x1
        json.put("_UseCase1_local_x1", JSONObject.wrap(model._UseCase1_local_x1));
        // Send _cg101
        json.put("_cg101", JSONObject.wrap(model._cg101));
        // Send _cg105
        json.put("_cg105", JSONObject.wrap(model._cg105));
        // Send _cg11
        json.put("_cg11", JSONObject.wrap(model._cg11));
        // Send _cg111
        json.put("_cg111", JSONObject.wrap(model._cg111));
        // Send _cg115
        json.put("_cg115", JSONObject.wrap(model._cg115));
        // Send _cg12
        json.put("_cg12", JSONObject.wrap(model._cg12));
        // Send _cg14
        json.put("_cg14", JSONObject.wrap(model._cg14));
        // Send _cg17
        json.put("_cg17", JSONObject.wrap(model._cg17));
        // Send _cg19
        json.put("_cg19", JSONObject.wrap(model._cg19));
        // Send _cg21
        json.put("_cg21", JSONObject.wrap(model._cg21));
        // Send _cg25
        json.put("_cg25", JSONObject.wrap(model._cg25));
        // Send _cg26
        json.put("_cg26", JSONObject.wrap(model._cg26));
        // Send _cg29
        json.put("_cg29", JSONObject.wrap(model._cg29));
        // Send _cg30
        json.put("_cg30", JSONObject.wrap(model._cg30));
        // Send _cg33
        json.put("_cg33", JSONObject.wrap(model._cg33));
        // Send _cg34
        json.put("_cg34", JSONObject.wrap(model._cg34));
        // Send _cg36
        json.put("_cg36", JSONObject.wrap(model._cg36));
        // Send _cg39
        json.put("_cg39", JSONObject.wrap(model._cg39));
        // Send _cg41
        json.put("_cg41", JSONObject.wrap(model._cg41));
        // Send _cg43
        json.put("_cg43", JSONObject.wrap(model._cg43));
        // Send _cg47
        json.put("_cg47", JSONObject.wrap(model._cg47));
        // Send _cg53
        json.put("_cg53", JSONObject.wrap(model._cg53));
        // Send _cg57
        json.put("_cg57", JSONObject.wrap(model._cg57));
        // Send _cg65
        json.put("_cg65", JSONObject.wrap(model._cg65));
        // Send _cg66
        json.put("_cg66", JSONObject.wrap(model._cg66));
        // Send _cg69
        json.put("_cg69", JSONObject.wrap(model._cg69));
        // Send _cg7
        json.put("_cg7", JSONObject.wrap(model._cg7));
        // Send _cg70
        json.put("_cg70", JSONObject.wrap(model._cg70));
        // Send _cg72
        json.put("_cg72", JSONObject.wrap(model._cg72));
        // Send _cg75
        json.put("_cg75", JSONObject.wrap(model._cg75));
        // Send _cg77
        json.put("_cg77", JSONObject.wrap(model._cg77));
        // Send _cg79
        json.put("_cg79", JSONObject.wrap(model._cg79));
        // Send _cg8
        json.put("_cg8", JSONObject.wrap(model._cg8));
        // Send _cg83
        json.put("_cg83", JSONObject.wrap(model._cg83));
        // Send _cg84
        json.put("_cg84", JSONObject.wrap(model._cg84));
        // Send _cg87
        json.put("_cg87", JSONObject.wrap(model._cg87));
        // Send _cg88
        json.put("_cg88", JSONObject.wrap(model._cg88));
        // Send _cg91
        json.put("_cg91", JSONObject.wrap(model._cg91));
        // Send _cg92
        json.put("_cg92", JSONObject.wrap(model._cg92));
        // Send _cg94
        json.put("_cg94", JSONObject.wrap(model._cg94));
        // Send _cg97
        json.put("_cg97", JSONObject.wrap(model._cg97));
        // Send _cg99
        json.put("_cg99", JSONObject.wrap(model._cg99));
        // Send _g100
        json.put("_g100", JSONObject.wrap(model._g100));
        // Send _g101
        json.put("_g101", JSONObject.wrap(model._g101));
        // Send _g102
        json.put("_g102", JSONObject.wrap(model._g102));
        // Send _g105
        json.put("_g105", JSONObject.wrap(model._g105));
        // Send _g106
        json.put("_g106", JSONObject.wrap(model._g106));
        // Send _g106_e2
        json.put("_g106_e2", JSONObject.wrap(model._g106_e2));
        // Send _g107
        json.put("_g107", JSONObject.wrap(model._g107));
        // Send _g11
        json.put("_g11", JSONObject.wrap(model._g11));
        // Send _g12
        json.put("_g12", JSONObject.wrap(model._g12));
        // Send _g14
        json.put("_g14", JSONObject.wrap(model._g14));
        // Send _g17
        json.put("_g17", JSONObject.wrap(model._g17));
        // Send _g18
        json.put("_g18", JSONObject.wrap(model._g18));
        // Send _g18_e2
        json.put("_g18_e2", JSONObject.wrap(model._g18_e2));
        // Send _g19
        json.put("_g19", JSONObject.wrap(model._g19));
        // Send _g2
        json.put("_g2", JSONObject.wrap(model._g2));
        // Send _g20
        json.put("_g20", JSONObject.wrap(model._g20));
        // Send _g21
        json.put("_g21", JSONObject.wrap(model._g21));
        // Send _g22
        json.put("_g22", JSONObject.wrap(model._g22));
        // Send _g22_e1
        json.put("_g22_e1", JSONObject.wrap(model._g22_e1));
        // Send _g23
        json.put("_g23", JSONObject.wrap(model._g23));
        // Send _g25
        json.put("_g25", JSONObject.wrap(model._g25));
        // Send _g26
        json.put("_g26", JSONObject.wrap(model._g26));
        // Send _g27
        json.put("_g27", JSONObject.wrap(model._g27));
        // Send _g29
        json.put("_g29", JSONObject.wrap(model._g29));
        // Send _g30
        json.put("_g30", JSONObject.wrap(model._g30));
        // Send _g31
        json.put("_g31", JSONObject.wrap(model._g31));
        // Send _g31_e1
        json.put("_g31_e1", JSONObject.wrap(model._g31_e1));
        // Send _g32
        json.put("_g32", JSONObject.wrap(model._g32));
        // Send _g33
        json.put("_g33", JSONObject.wrap(model._g33));
        // Send _g34
        json.put("_g34", JSONObject.wrap(model._g34));
        // Send _g35
        json.put("_g35", JSONObject.wrap(model._g35));
        // Send _g36
        json.put("_g36", JSONObject.wrap(model._g36));
        // Send _g39
        json.put("_g39", JSONObject.wrap(model._g39));
        // Send _g40
        json.put("_g40", JSONObject.wrap(model._g40));
        // Send _g40_e2
        json.put("_g40_e2", JSONObject.wrap(model._g40_e2));
        // Send _g41
        json.put("_g41", JSONObject.wrap(model._g41));
        // Send _g42
        json.put("_g42", JSONObject.wrap(model._g42));
        // Send _g43
        json.put("_g43", JSONObject.wrap(model._g43));
        // Send _g44
        json.put("_g44", JSONObject.wrap(model._g44));
        // Send _g47
        json.put("_g47", JSONObject.wrap(model._g47));
        // Send _g48
        json.put("_g48", JSONObject.wrap(model._g48));
        // Send _g48_e2
        json.put("_g48_e2", JSONObject.wrap(model._g48_e2));
        // Send _g49
        json.put("_g49", JSONObject.wrap(model._g49));
        // Send _g5
        json.put("_g5", JSONObject.wrap(model._g5));
        // Send _g50
        json.put("_g50", JSONObject.wrap(model._g50));
        // Send _g50_e1
        json.put("_g50_e1", JSONObject.wrap(model._g50_e1));
        // Send _g53
        json.put("_g53", JSONObject.wrap(model._g53));
        // Send _g54
        json.put("_g54", JSONObject.wrap(model._g54));
        // Send _g54_e2
        json.put("_g54_e2", JSONObject.wrap(model._g54_e2));
        // Send _g55
        json.put("_g55", JSONObject.wrap(model._g55));
        // Send _g57
        json.put("_g57", JSONObject.wrap(model._g57));
        // Send _g60
        json.put("_g60", JSONObject.wrap(model._g60));
        // Send _g63
        json.put("_g63", JSONObject.wrap(model._g63));
        // Send _g65
        json.put("_g65", JSONObject.wrap(model._g65));
        // Send _g66
        json.put("_g66", JSONObject.wrap(model._g66));
        // Send _g67
        json.put("_g67", JSONObject.wrap(model._g67));
        // Send _g67_e1
        json.put("_g67_e1", JSONObject.wrap(model._g67_e1));
        // Send _g69
        json.put("_g69", JSONObject.wrap(model._g69));
        // Send _g7
        json.put("_g7", JSONObject.wrap(model._g7));
        // Send _g70
        json.put("_g70", JSONObject.wrap(model._g70));
        // Send _g75
        json.put("_g75", JSONObject.wrap(model._g75));
        // Send _g76
        json.put("_g76", JSONObject.wrap(model._g76));
        // Send _g76_e2
        json.put("_g76_e2", JSONObject.wrap(model._g76_e2));
        // Send _g77
        json.put("_g77", JSONObject.wrap(model._g77));
        // Send _g78
        json.put("_g78", JSONObject.wrap(model._g78));
        // Send _g79
        json.put("_g79", JSONObject.wrap(model._g79));
        // Send _g8
        json.put("_g8", JSONObject.wrap(model._g8));
        // Send _g80
        json.put("_g80", JSONObject.wrap(model._g80));
        // Send _g80_e1
        json.put("_g80_e1", JSONObject.wrap(model._g80_e1));
        // Send _g81
        json.put("_g81", JSONObject.wrap(model._g81));
        // Send _g84
        json.put("_g84", JSONObject.wrap(model._g84));
        // Send _g85
        json.put("_g85", JSONObject.wrap(model._g85));
        // Send _g87
        json.put("_g87", JSONObject.wrap(model._g87));
        // Send _g88
        json.put("_g88", JSONObject.wrap(model._g88));
        // Send _g89
        json.put("_g89", JSONObject.wrap(model._g89));
        // Send _g89_e1
        json.put("_g89_e1", JSONObject.wrap(model._g89_e1));
        // Send _g9
        json.put("_g9", JSONObject.wrap(model._g9));
        // Send _g90
        json.put("_g90", JSONObject.wrap(model._g90));
        // Send _g92
        json.put("_g92", JSONObject.wrap(model._g92));
        // Send _g93
        json.put("_g93", JSONObject.wrap(model._g93));
        // Send _g98
        json.put("_g98", JSONObject.wrap(model._g98));
        // Send _g98_e2
        json.put("_g98_e2", JSONObject.wrap(model._g98_e2));
        // Send _g99
        json.put("_g99", JSONObject.wrap(model._g99));
        // Send _g9_e1
        json.put("_g9_e1", JSONObject.wrap(model._g9_e1));
        // Send _pg101
        json.put("_pg101", JSONObject.wrap(model._pg101));
        // Send _pg102
        json.put("_pg102", JSONObject.wrap(model._pg102));
        // Send _pg12
        json.put("_pg12", JSONObject.wrap(model._pg12));
        // Send _pg18_e2
        json.put("_pg18_e2", JSONObject.wrap(model._pg18_e2));
        // Send _pg19
        json.put("_pg19", JSONObject.wrap(model._pg19));
        // Send _pg30
        json.put("_pg30", JSONObject.wrap(model._pg30));
        // Send _pg32
        json.put("_pg32", JSONObject.wrap(model._pg32));
        // Send _pg35
        json.put("_pg35", JSONObject.wrap(model._pg35));
        // Send _pg39
        json.put("_pg39", JSONObject.wrap(model._pg39));
        // Send _pg43
        json.put("_pg43", JSONObject.wrap(model._pg43));
        // Send _pg44
        json.put("_pg44", JSONObject.wrap(model._pg44));
        // Send _pg66
        json.put("_pg66", JSONObject.wrap(model._pg66));
        // Send _pg67
        json.put("_pg67", JSONObject.wrap(model._pg67));
        // Send _pg69
        json.put("_pg69", JSONObject.wrap(model._pg69));
        // Send _pg70
        json.put("_pg70", JSONObject.wrap(model._pg70));
        // Send _pg77
        json.put("_pg77", JSONObject.wrap(model._pg77));
        // Send _pg8
        json.put("_pg8", JSONObject.wrap(model._pg8));
        // Send _pg90
        json.put("_pg90", JSONObject.wrap(model._pg90));
        // Send _pg92
        json.put("_pg92", JSONObject.wrap(model._pg92));
        // Send _pg93
        json.put("_pg93", JSONObject.wrap(model._pg93));
        
        System.out.println(json.toString());
    }
    
    public static void main(String[] args) {
        
        
        // Initialize 
        model.reset();
        
        sendVariables();

        
        while (true) {
            
        
           // Read inputs
           receiveVariables();

           
           _tickstart = System.nanoTime();

        
           // Reaction of model
           model.tick();
           
           _ticktime = System.nanoTime() - _tickstart;

           
           // Send outputs
           sendVariables();

           
           
        }
    }
    
}