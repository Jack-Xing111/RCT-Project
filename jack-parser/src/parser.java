import java.io.*;
import java.util.*;

public class parser{

    static String output;
    static String remindNurse = "region \"Remind Nurse\":\r\n" + "initial state action \"Reminder\"\r\n" + "do x=0 go to stall\r\n" + "state stall\r\n" + "if x >= ";

    //Initial the set of actions
    static List<String> list1 = Arrays.asList("adverseEvent");
    static List normalActions = new ArrayList<>(list1);
    static List<String> list2 = Arrays.asList("giveDose", "collectQuestionnaire", "givePill");
    static List alertActions = new ArrayList<>(list2);
    
    public static void main(String args[]) throws IOException {   
        //Read arguments for input file name 
        // if (args.length < 1) {
        //     System.out.println("Usage: java parser <output file> <input file name>");
        //     System.exit(1);
        // }
        // String outputFile = args[0];
        // String inputFileName = args[1];

        String outputFile = "output.sctx";
        String inputFileName = "input.txt";

        String staff[] = new String[100];
        String participants[] = new String[100];
        String cGroup1[] = new String[50];
        String cGroup2[] = new String[50];
        String input[] = new String[100]; 
        int reminderInterval = 5;
        int note_count = 0;

        // System.out.println("Enter MindBio-code."); 
        // System.out.println("Enter 'stop' to quit."); 
       
        // Read from input file
        FileReader fr = new FileReader(inputFileName);

        // Loop over line in fr
        BufferedReader brr = new BufferedReader(fr);
        String line;
        int lineCount = 0;
        while ((line = brr.readLine()) != null) {
            if(line.substring(0, 2) != "//"){
                input[lineCount] = line;
                if(input[lineCount].equals("stop")) {break;}
                lineCount++;
            }
            else{note_count++;}
        }
       
        // Close the input stream
        fr.close();
        //System.out.println(Arrays.toString(input));
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        // // For Reading Terminal Input
        // for(int i=0; i<100; i++) { 
        //     str[i] = br.readLine(); 
        //     if(str[i].equals("stop")) break; 
        // }
        
        System.out.println("There are 20 participants, 2 groups, and 5 staff.");
        System.out.println("NormalActions : logBloodSample, checkESR, adverseEvent.");
        System.out.println("AlertActions : giveMinocycline, givePlacebo, collectHAMD.");
        System.out.println("*********************************************************");
        System.out.println("Your clinical trial is started and will be stop after 12 weeks.");

        int check = 0;

        //Check Initialization
        if(input[check] == null | input[check+1] == null) {System.out.println("Please initialize nurses and clients."); return;}
        
        //Check initialization and set up the nurses array and clients array
        int len1 = valueOf(input[check].split(" ")[1]);
        int len2 = valueOf(input[check+1].split(" ")[1]);
        
        if(input[check].toUpperCase().contains("STAFF") && input[check+1].toUpperCase().contains("PARTICIPANT")) {
            check = check + 2;
            //Initial Staff set
            for(int i = 0; i < len1; i++){
                staff[i] = "n" + String.valueOf(i+1);
            }

            //Initial Participants set
            for(int i = 0; i < len2; i++){
                participants[i] = "c" + String.valueOf(i+1);
            }
        }
        else if(input[check].toUpperCase().contains("PARTICIPANT") && input[check+1].toUpperCase().contains("STAFF")) {
            check = check + 2;
            //Initial of Participants set
            for(int i = 0; i < len1; i++){
                participants[i] = "c" + String.valueOf(i+1);
            }

            //Initial of Staff set
            for(int i = 0; i < len2; i++){
                staff[i] = "n" + String.valueOf(i+1);
            }
        }
        else{System.out.println("Please check the syntax at initializing the Participants and Staff."); return;}

        //Set up a group
        if(input[check].toUpperCase().contains("GROUP")){
            String [] subinput3 = input[check].split(" ");
            if(Integer.parseInt(subinput3[1]) == 2){
                //Get an Arraylist which is the same as clients
                int count_participant = 0;
                String participant;
                while(participants[count_participant] != null){
                    count_participant += 1;
                }
                List<String> list = new ArrayList<String>();
                for(int i = 0;i < count_participant;i++){
                    list.add(participants[i]);
                }
                //Use a random number to separate the participants randomly
                Random ran = new Random();
                int half_len = list.size()/2;
                for(int i = 0; i < half_len; i++){
                    participant = list.get(ran.nextInt(list.size()));
                    cGroup1[i] = participant;
                    list.remove(participant);
                }
                int count_c2 = 0;
                for(int i =0; i < participants.length; i++){
                    if(participants[i] != null && arraySearch(cGroup1,participants[i]) == -1){
                        cGroup2[count_c2] = participants[i];
                        count_c2++;
                    }
                }
            }
            check++;
        }
        //System.out.println(Arrays.toString(cGroup1));
        //System.out.println(Arrays.toString(cGroup2));
        
        //Initialize the alert time interval
        if(!input[check].toUpperCase().contains("ALERT")){
            System.out.println("You need to Initialize nurses and clients."); 
            return;
        }
        else{reminderInterval = Integer.valueOf(input[0].split(" ")[1]);check++;}

        //Initial the checkActions
        if(input[check].toUpperCase().contains("ALERTACTIONS") && input[check+1].toUpperCase().contains("NORMALACTIONS")){
            String [] subinput4 = input[check].split(" ");
            String [] subinput5 = input[check+1].split(" ");

            for(int i = 1; i < subinput4.length; i++){
                    if(!alertActions.contains(subinput4[i])){alertActions.add(subinput4[i]);}
            }

            for(int i = 1; i < subinput5.length; i++){
                    if(!normalActions.contains(subinput5[i])){normalActions.add(subinput5[i]);}
            }
            check = check + 2;
        }
        else if(input[check].toUpperCase().contains("NORMALACTIONS") && input[check+1].toUpperCase().contains("ALERTACTIONS")){
            String [] subinput4 = input[check].split(" ");
            String [] subinput5 = input[check+1].split(" ");

            for(int i = 1; i < subinput4.length; i++){
                if(!normalActions.contains(subinput4[i])){normalActions.add(subinput4[i]);}
            }

            for(int i = 1; i < subinput5.length; i++){
                    if(!alertActions.contains(subinput5[i])){alertActions.add(subinput5[i]);}
            }
            check = check + 2;
        }
        else{System.out.println("Please check the syntax at initializing the AlertActions and NormalActions."); return;}

        //System.out.println(normalActions);
        //System.out.println(alertActions);

        //Iinital the start title of SSCHARTS code
        output = "@ClocksUseSD\nscchart UseCase1{\r\n";

        //The parser
        for(int i=check; i<arraySearch(input,"stop"); i++){
            int timer = 0;
            String action = "";
            String object = "";
            float dosage = 0;

            if(input[i] != null){
                //case1: |
                if(input[i].contains("|")){
                    String[] parts = input[i].split("\\|");
                    // if(parts[0].contains("after")){after_case(parts, 0, nurses, clients);}
                    // if(parts[0].contains("every")){every_case(parts, 0, nurses, clients);}
                    // if(parts[1].contains("after")){after_case(parts, 1, nurses, clients);}
                    // if(parts[1].contains("every")){every_case(parts, 1, nurses, clients);}
                }
                
                //case2: every
                else if(input[i].contains("every")){
                    int type;
                    try{
                        String strr[] = input[i].split(" ");
                        for(int t = 0; t < strr.length; t++){
                            if(strr[t].toLowerCase().equals("every")){

                                //timer int type check
                                timer = Integer.valueOf(strr[t+1]);

                                //unit check
                                if(strr[t+2].toLowerCase().contains("minute") || strr[t+2].toLowerCase().contains("hour") || strr[t+2].toLowerCase().contains("day")){
                                    if(strr[t+2].toLowerCase().contains("hour")){timer = timer * 60;}
                                    else if(strr[t+2].toLowerCase().contains("day")){timer = timer * 1440;}
                                }
                                else{System.out.println(String.format("Error on line %s, Please check your syntax of time units.", i+note_count+1)); return;}
                            }
                            
                            //action check
                            if(alertActions.contains(strr[0]) || normalActions.contains(strr[0]) || alertActions.contains(strr[3]) || normalActions.contains(strr[3])){
                                if(alertActions.contains(strr[0]) || normalActions.contains(strr[0])){action = strr[0]; t = 0;}
                                else{action = strr[3]; t = 3;}

                                //preposition check
                                if(!strr[t+1].toLowerCase().equals("for")){System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+note_count+1)); return;}
                                
                                //participant(s) check
                                if(strr[t+2].toUpperCase().contains("GROUP")){type = 1;}
                                else if(strr[t+2].toUpperCase().contains("ALL")){type = 2;}
                                else if(arraySearch(participants, strr[t+2]) != -1){type = 3; object = strr[t+2];}
                                else{System.out.println(String.format("Error on line %s, Please check the name of client.", i+note_count+1)); return;}

                                if(strr.length > 6){
                                    if(strr[t+3].toLowerCase().equals("with")){
                                        dosage = Float.parseFloat(strr[t+4]);
                                    }
                                    else{System.out.println(String.format("Error on line %s, Please check your syntax of dosage.", i+note_count+1)); return;}
                                }
                            }
                            else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+note_count+1)); return;}

                            //else{System.out.println(String.format("Error on line %s, Please check your syntax.", i+1)); return;}
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    every_case(input, i, staff, participants, timer, object, action, dosage, reminderInterval);
                }

                //case3: after
                else if(input[i].contains("after")){
                    int type;
                    try{
                        String strr[] = input[i].split(" ");
                        for(int t = 0; t < strr.length; t++){
                            if(strr[t].equals("after")){

                                //timer int type check
                                timer = Integer.valueOf(strr[t+1]);

                                //unit check
                                if(strr[t+2].toLowerCase().contains("minute") || strr[t+2].toLowerCase().contains("hour") || strr[t+2].toLowerCase().contains("day")){
                                    if(strr[t+2].toLowerCase().contains("hour")){timer = timer * 60;}
                                    else if(strr[t+2].toLowerCase().contains("day")){timer = timer * 1440;}
                                }
                                else{System.out.println(String.format("Error on line %s, Please check your syntax of time units.", i+note_count+1)); return;}
                            }

                            //action check
                            if(alertActions.contains(strr[0]) || normalActions.contains(strr[0]) || alertActions.contains(strr[3]) || normalActions.contains(strr[3])){
                                if(alertActions.contains(strr[0]) || normalActions.contains(strr[0])){action = strr[0]; t = 0;}
                                else{action = strr[3]; t = 3;}

                                //preposition check
                                if(!strr[t+1].toLowerCase().equals("for")){System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+note_count+1)); return;}
                                
                                //participant(s) check
                                if(strr[t+2].toUpperCase().contains("GROUP")){type = 1;}
                                else if(strr[t+2].toUpperCase().contains("ALL")){type = 2;}
                                else if(arraySearch(participants, strr[t+2]) != -1){type = 3; object = strr[t+2];}
                                else{System.out.println(String.format("Error on line %s, Please check the name of client.", i+note_count+1)); return;}

                                if(strr.length > 6){
                                    if(strr[t+3].toLowerCase().equals("with")){
                                        dosage = Float.parseFloat(strr[t+4]);
                                    }
                                    else{System.out.println(String.format("Error on line %s, Please check your syntax of dosage.", i+note_count+1)); return;}
                                }
                            }
                            else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+note_count+1)); return;}
                            //else{System.out.println(String.format("Error on line %s, Please check your syntax.", i+1)); return;}
                        
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }

                    /*String strr[] = input[i].split(" ");
                    if(strr[0] != "after"){System.out.println("Please check your syntax.");break;}*/
                    after_case(input, i, staff, participants, timer, object, action, dosage, reminderInterval);
                }

                //case4: sample action case without nurse
                else if(input[i].toLowerCase().contains("check")){
                    try {
                        String strr[] = input[i].split(" ");
                        if(strr[0].toLowerCase().equals("check")){

                            //check with following actions
                            if(input[i].toLowerCase().contains("if")){
                                for(int t = 0; t < strr.length; t++){

                                }
                            }

                            //check without following actions
                            else if(strr.length == 4){
                                if(normalActions.contains(strr[1])){action = strr[1];}
                                if(strr[2] == "of"){
                                    if(arraySearch(participants, strr[3]) == -1){System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                                    else{object = strr[3];}
                                }
                               // else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                            }
                            //else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                        }
                        //else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    output += "region check{\r\ninput signal int ActionDone\r\noutput signal TimetoCheck\r\ninitial state start\r\ndo TimetoCheck go to stall\r\nstate stall\r\nif ActionDone go to Done\r\nfinal state Done\r\n}\r\n";
                }
                
                //case5: log
                else if(input[i].contains("log")){
                    try {
                        String strr[] = input[i].split(" ");
                        if(strr[0].equals("log")){

                        }
                        else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                //case6: monitor
                else if(input[i].contains("monitor")){
                    try {
                        String strr[] = input[i].split(" ");
                        if(strr[0].equals("monitor")){

                        }
                        else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                //other cases
                else{
                    try {
                        String strr[] = input[i].split(" ");

                        //last case: sample action case with nurse
                        if(alertActions.contains(strr[0])){

                            //to one person
                            if(arraySearch(strr, "from") == -1){

                            }

                            //to multi-person
                            else{

                            }
                        }
                        else{System.out.println(String.format("Error on line %s, Please check your syntax of action.", i+1)); return;}
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        output += "}";
        writeDataToFile(output, outputFile);

        //System.out.println("}");
        //System.out.println(arraySearch(clients, object));
        
        /*System.out.println(dose);
        System.out.println(object);
        System.out.println(timer);
        System.out.println(Arrays.toString(str));*/
        //System.out.println(str.length);
        // display the SCCharts-code 
        /*for(int j=0; j<100; j++) { 
            if(str[j].equals("stop")) break; 
            System.out.println(str[j]); 
        } */
    }



    public Integer populationPart(int check, String[] input){
        return 1;
    }

    /**
     * Write str into txt file
     * @param str
     * @throws IOException
     */
    public static void writeDataToFile(String str, String outputfile) throws IOException {
        File writefile;
        BufferedWriter bw;
        boolean append = true;
        writefile = new File(outputfile);
        if (!writefile.exists())   // if file doesn't exist, create
        {
            writefile.createNewFile();
            
        } else {        // if file exists, delete and then create
            writefile.delete();
            writefile.createNewFile();

        }
        try {
            FileWriter fw = new FileWriter(writefile, append);
            bw = new BufferedWriter(fw);
            fw.write(str);
            fw.flush();
            fw.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Search if the array has the input String
    public static int arraySearch(String[] arr, String ele) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){if (arr[i].equals(ele)){return i;}}
        }
        return -1;
    }

    // public class LoginException extends Exception {

    //     public LoginException(String message){
    //         super(message);
    //     }
    // }

    //parse the every case
    public static void every_case(String[] str, int i, String[] nurses, String[] clients, Integer timer, String object, String action, float dosage, int reminderInterval){
        if(str[i].contains("every")){
            /*String strr[] = str[i].split(" ");
            if(strr[0].contains("every")){
                try{
                    timer = Integer.valueOf(strr[1]);
                    if(strr[2].contains("hour")){timer = timer * 60;}
                    else if(strr[2].contains("day")){timer = timer * 24 * 60;}
                    else if(strr[2].contains("minute")){}
                    else{System.out.println("Please use days, hours, or minutes as the timer units.");}
                    if(strr[3].contains("give"))action = strr[3];
                    for(int t = 0; t<strr.length; t++){
                        if(strr[t].contains("to")){object = strr[t+1];}
                        if(strr[t].contains("with")){dose = strr[t+1];}
                    }
                    if(arraySearch(clients, object) != -1){

                        //System.out.println("scchart UseCase1{");
                        
                    }
                    else{
                        System.out.println("Please check whether you wrote down a correct client name");
                    }
                    
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }*/

            output += "region " + object + "{\r\n";
            output += "input signal start, stop\r\n" + "initial state Active{" + "input signal ActionDone\r\n" + "output signal float Remind_Nurse = 0\r\n" + "clock x = 0\r\n" + "initial state start\r\n do Remind_Nurse(" + dosage;
            output += ") go to action\r\n";
            output += "state action \"" + action + " to " + object + "\" {\r\n";
            output += remindNurse + reminderInterval + " do Remind_Nurse(" + dosage + ") go to action\r\n}\r\n" + "if ActionDone do x = 0 go to stall\r\n" + "state stall\r\nif x>= " + timer + " go to start\r\n}\r\n";
            output += "if stop abort to Inactive\r\n" + "state Inactive\r\n" + "if start go to Active\r\n}";
        }
    }

    //parse the after case
    public static void after_case(String[] str, int i, String[] nurses, String[] clients, Integer timer, String object, String action, float dosage, int reminderInterval){
        if(str[i].contains("after")){
            /*String strr[] = str[i].split(" ");
            if(strr[0].contains("after")){
                try{
                    timer = Integer.valueOf(strr[1]);
                    if(strr[2].contains("hour")){timer = timer * 60;}
                    else if(strr[2].contains("day")){timer = timer * 24 * 60;}
                    else if(strr[2].contains("minute")){}
                    else{System.out.println("Please use days, hours, or minutes as the timer units.");}
                    if(strr[3].contains("give"))action = strr[3];
                    for(int t = 0; t<strr.length; t++){
                        if(strr[t].contains("to")){object = strr[t+1];}
                        if(strr[t].contains("with")){dose = strr[t+1];}
                    }
                    if(arraySearch(clients, object) != -1){
                        //System.out.println("scchart UseCase1{");
                        
                    }
                    else{
                        System.out.println("Please check whether you wrote down a correct client name");
                    }
                    
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }*/
            output += "region " + object + "{\r\n";
            output += "input signal ActionDone\r\n" + "output signal float Remind_Nurse = 0\r\n" + "clock x = 0\r\n" + "initial state stall\r\n";
            output += "if x>=" + timer + " do Remind_Nurse(" + dosage + ") go to action\r\n";
            output += "state action \"" + action + " to " + object + "\" {\r\n";
            output += remindNurse + reminderInterval + " do Remind_Nurse(" + dosage + ") go to action\r\n}\r\n";
            output += "if ActionDone go to done\r\n" + "final state done\r\n" + "}\r\n";
        }
    }


    public static Integer valueOf(String s) throws NumberFormatException{
        return Integer.parseInt(s,10);
    }


    //Initial the checkActions
    public static List<List<String>> actionInit(String[] input, int check, List<String> basicActions, List<String> alertActions){
        List<List<String>> actionsList = new ArrayList<List<String>>();
        if(input[check].toUpperCase().contains("ALERTACTIONS") && input[check+1].toUpperCase().contains("NORMALACTIONS")){
            String [] subinput4 = input[check].split(" ");
            String [] subinput5 = input[check+1].split(" ");

            for(int i = 1; i < subinput4.length; i++){
                    if(!alertActions.contains(subinput4[i])){alertActions.add(subinput4[i]);}
            }

            for(int i = 1; i < subinput5.length; i++){
                    if(!basicActions.contains(subinput5[i])){basicActions.add(subinput5[i]);}
            }
            actionsList.add(basicActions); actionsList.add(alertActions);
            check = check + 2;
        }
        else if(input[check].toUpperCase().contains("NORMALACTIONS") && input[check+1].toUpperCase().contains("ALERTACTIONS")){
            String [] subinput4 = input[check].split(" ");
            String [] subinput5 = input[check+1].split(" ");

            for(int i = 1; i < subinput4.length; i++){
                if(!basicActions.contains(subinput4[i])){basicActions.add(subinput4[i]);}
            }

            for(int i = 1; i < subinput5.length; i++){
                    if(!alertActions.contains(subinput5[i])){alertActions.add(subinput5[i]);}
            }
            actionsList.add(basicActions); actionsList.add(alertActions);
            check = check + 2;
        }
        else{System.out.println("Please check the syntax at initializing the AlertActions and BasicActions.");}
        return actionsList;
    }
    /**
     * Get a Random number
     */
    public static int getRandom(int i) {
        Random r = new Random();
        return r.nextInt(i);
    }

    public static List<List<String>> randomization(String[] input, int check, List<List<String>> populationList) {
        String [] subinput3 = input[check].split(" ");
        int groups = Integer.parseInt(subinput3[1]);
        
        // 判断验证
        if (subinput3.length < (groups * 2)) {
            System.out.println("You can only have" + (input.length / 2) + "at most.");
            return null;
        }
        if (groups < 1) {
            System.out.println("Group should be at least 1.");
            return null;
        }
        // Input list
        List<String> list = new ArrayList<String>();
        // Output list
        List<List<String>> groupsList = new ArrayList<List<String>>();
        // List<Map<String, String>> groupsList = new ArrayList<List<String>>();
        // Add data to the Input list
        for (int i = 0; i < subinput3.length; i++) {
            list.add(subinput3[i]);
        }
        // Randomly sort it
        Collections.shuffle(list);
        // Calculate number of participants in each group
        int participants = subinput3.length / groups;
        // Start grouping
        for (int i = 0; i < groups; i++) {
            List<String> group = new ArrayList<String>();
            for (int j = 0; j < participants; j++) {
                int random = getRandom(list.size());
                group.add(list.get(random));
                list.remove(random);
            }
            groupsList.add(group);
        }
        // Allocate participants left again
        for (int i = 0; i < list.size(); i++) {
            groupsList.get(i).add(list.get(i));
        }
        return groupsList;
    }
}
