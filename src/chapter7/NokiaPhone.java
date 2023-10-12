package chapter7;
import java.util.Scanner;

public class NokiaPhone {

    public static void main(String[] args) {

          NokiaPhone nokia = new NokiaPhone();
        nokia.welcome();

    }
    private Scanner scanner = new Scanner(System.in);

    public void welcome(){
        System.out.println("""
                welcome to nokia 
                press 1 for main menu
                press # to quit:  
                """);
        int response = scanner.nextInt();
        if(response == 1){
            mainMenu();
        }
    }


    public void mainMenu() {
        System.out.println("""
                1 -> Phone book
                2 -> Message
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> SIM services""");
        int response = scanner.nextInt();
        
        switch (response){
            case 1:
                phoneBook();
            case 2:
                message();
            case 3:
                chat();
            case 4:
                callRegister();
            case 5:
                tones();
            case 6:
                settings();
            case 7:
                callDivert();
            case 8:
                games();
            case 9:
                calculator();
            case 10:
                reminders();
            case 11:
                clock();
            case 12:
                profile();
            case 13:
                simServices();
        }

    }

    public void simServices() {
        System.out.println("""
                empty
                1-> SIM services
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            simServices();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void profile() {
        System.out.println("""
                empty
                1-> Profile
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            profile();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void clock() {
        System.out.println("""
                clock
                1-> Alarm Clock
                2-> Clock Settings
                3-> Date Settings
                4-> Stopwatch
                5-> Countdown Timer
                6-> Auto update of date and time""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            alarmClock();
        }
        if (response == 2){
            clockSettings();
        }
        if (response == 3){
            dateSettings();
        }
        if (response == 4){
            stopwatch();
        }
        if (response == 5){
            countdownTimer();
        }
        if (response == 6){
            autoUpdateOfTimeAndDate();
        }

    }

    public void autoUpdateOfTimeAndDate() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void countdownTimer() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void stopwatch() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void dateSettings() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void alarmClock() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void clockSettings() {
        System.out.println("""
                empty
                1-> Clock
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            clock();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void reminders() {
        System.out.println("""
                empty
                1-> Reminders
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            reminders();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void calculator() {
        System.out.println("""
                empty
                1-> Calculator
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            calculator();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void games() {
        System.out.println("""
                empty
                1-> Games
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            games();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void callDivert() {
        System.out.println("""
                empty
                1-> Call Divert
                2-> Main Menu""");
        int responnse = scanner.nextInt();
        if (responnse == 0){
            callDivert();
        }
        if (responnse == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void settings() {
        System.out.println("""
                settings
                1-> Call settings
                2-> Phone settings
                3-> Security settings
                4-> Restore factory settings""");
        int response = scanner.nextInt();
        if(response == 1){
            callSettings();
        }
    }
    public void restoreFactorySettings(){
        System.out.println("""
                empty
                1-> Settings
                 2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 0){
            restoreFactorySettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void phoneSettings(){
        System.out.print("""
                phone settings
                1-> Language
                2-> Cell info display
                3-> Welcome note
                4-> Network selection
                5-> Lights
                6-> Confirm SIM service actions""");
        int response = scanner.nextInt();
        if(response == 1){
            phoneSettings();
        }
    }
    public void securitySettings(){
        System.out.println("""
                Security Settings
                1-> Pin Code Request
                2-> Call Barring Servise
                3-> Fixed dialling
                4-> Close User Group
                5-> Phone Security
                6-> Change Access Codes""");
        int response = scanner.nextInt();
        if(response == 1){
            securitySettings();
        }
    }
    public void changeAccessCodes(){
        System.out.println("""
                empty
                1-> Security Settings
                2-> Main menu""");
        int response = scanner.nextInt();
        if (response == 0){
            securitySettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void phoneSecurity(){
        System.out.println("""
                empty
                1-> Phone Settings
                2-> Main menu""");
        int response = scanner.nextInt();
        if (response == 0){
            phoneSettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void closeUserGroup(){
        System.out.println("""
                empty
                1-> Security Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            callSettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void fixedDialing(){
        System.out.println("""
                empty
                1-> Security Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            securitySettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void pinCodeRequest(){
        System.out.println("""
                empty
                1-> Security Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if (response == 0){
            securitySettings();
        }
        if (response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void confirmSimServiceActions(){
        System.out.println("""
                emty
                1-> Phone Settings
                2->Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            phoneSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void lights(){
        System.out.println("""
                empty
                1-> Phone Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            phoneSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void welcomeNote(){
        System.out.println("""
                empty
                1-> Phone settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            phoneSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void cellInfoDisplay(){
        System.out.println("""
                empty
                1-> Phone settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            phoneSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void language(){
        System.out.println("""
                empty
                1-> Phone Settings
                2-> Main Menu""");
        int respose = scanner.nextInt();
        if(respose == 0){
            phoneSettings();
        }
        if(respose == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void callSettings() {
        System.out.println("""
                call settings
                1-> Automatic redial
                2-> Speed dialling
                3-> Call waiting options
                4-> Own number sending
                5-> Phone line in use
                6-> Automatic answer""");
        int response = scanner.nextInt();
        if(response == 1)
            authomaticRedial();
    }

    public void authomaticRedial() {
        System.out.println("""
                empty
                1-> Call settings
                2-> Main menu """);
        int response = scanner.nextInt();
        if (response == 1){
            callSettings();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void speedDialling(){
        System.out.print("""
                empty
                1-> Call settings
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 0){
            callSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void callWaitingOption(){
        System.out.print("""
                empty
                1-> Call Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            callSettings();
        }
        if(response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public void ownNumberSending(){
        System.out.print("""
                empty
                1-> Call Settings
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 0){
            callSettings();
        }
        if(response == 1){
            mainMenu();
        }else{
            mainMenu();
        }
    }
    public void phoneLineInUse(){
        System.out.print("""
                empty
                1-> Call Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            callSettings();
        }
        if(response == 1){
            mainMenu();
        }
    }
    public void authomaticAnswer(){
        System.out.print("""
                empty
                1-> Call Settings
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 0){
            mainMenu();
        }
        if(response == 1){
            mainMenu();
        }else {
            mainMenu();
        }
    }


    public void tones() {
        System.out.println("""
                1->Ringing Tone
                2-> Ringing volume
                3-> Incoming call alert
                4-> Composer
                5-> Message alert tone
                6-> Keypad tones
                7-> Warning and game tones
                8-> Vibrating alert
                9-> Screen saver""");
        int respose = scanner.nextInt();
        if(respose == 1){
            ringingTone();
        }
        if(respose == 2){
            ringingVolume();
        }
        if(respose ==3){
            incomingCallAlert();
        }
        if(respose == 4){
            composer();
        }
        if(respose == 5){
            messageAlertTone();
        }
        if(respose == 6){
            keypadTones();
        }
        if(respose == 7){
            warningAndGameTones();
        }
        if(respose == 8){
            vibratingAlert();
        }
        if(respose == 9){
         screenSaver();
        }
    }

    public void screenSaver() {
        System.out.println("""
                empty
                1-> Screen Saver
                2-> Main Menu""");
        int response = scanner.nextInt();
        if(response == 1){
            screenSaver();
        }
        if(response == 2){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void vibratingAlert() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void warningAndGameTones() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main mwnu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void keypadTones() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void messageAlertTone() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        } else {
            mainMenu();
        }

    }

    public void composer() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void incomingCallAlert() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }

    }

    public void ringingVolume() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void ringingTone() {
        System.out.println("""
                empty
                1-> Tones
                2-> Main menu""");
        int response = scanner.nextInt();
        if (response == 1){
            tones();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void callRegister() {
        System.out.println("""
                1-> Missed calls
                2-> Received calls
                3-> Dialled numbers
                4-> Erase recent call lists
                5-> Show call duration
                6-> Show call costs
                7-> Call cost settings
                8-> Prepaid credit""");
        int response = scanner.nextInt();
        if(response == 1){
            missedCalls();
        }
        if(response == 2){
            receivedCalls();
        }
        if(response == 3){
            dialledNumbers();
        }
        if(response == 4){
            eraseRecentCallLists();
        }
        if(response ==5){
            showCallDuration();
        }
        if(response == 6){
            showCallCost();
        }
        if(response == 7){
            callCostSettings();
        }
        if(response  == 8){
            prepaidCredit();
        }
    }

    public void prepaidCredit() {
        System.out.println("""
                empty
                1-> call register
                2-> main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            callRegister();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void callCostSettings() {
        System.out.println("""
                1-> call cost limit
                2-> show costs in
                """);
        int response = scanner.nextInt();
        if(response == 1){
            callCostLimit();
        }
        if(response == 2){}
        showCostIn();
    }

    public void showCostIn() {
        System.out.println("""
                empty
                1-> call register
                2-> main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            callRegister();
        }
        if(response == 2){
            mainMenu();
        } else {
            mainMenu();
        }
    }

    public void callCostLimit() {
        System.out.println("""
                emprty
                1-> call register
                2-> main menu""");
        int response = scanner.nextInt();
        if(response == 1){
            callRegister();
        }
        if(response == 2){
            mainMenu();
        }else {
            mainMenu();
        }

    }

    public void showCallCost()
    {
        System.out.println("""
                1-> Last call cost
                2-> All calls' cost
                3-> Clear counters""");
        int response = scanner.nextInt();
        if(response == 1){
            lastCallCost();
        }
        if(response == 2){
            allCallsCost();
        }
        if(response == 3){
            clearCounters();
        }
    }

    public void clearCounters() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 main maenu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void allCallsCost() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void lastCallCost() {
        System.out.println("""
                empty
                01 for call register
                02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    private void showCallDuration() {
        System.out.println("""
                1-> Last Call duration
                2-> All call's duration
                3-> Received call's duration
                4-> Dialled call's duration
                5-> Clear timers""");
        int response = scanner.nextInt();
        if(response == 1){
            lastCallDuration();
        }
        if(response == 2){
            allCallsDuration();
        }
        if(response == 3){
            receivedCallsDuration();
        }
        if (response == 4){
            dialledCallsDuration();
        }
        if(response == 5){
            callTimers();
        }
    }

    public void callTimers() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void dialledCallsDuration() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void receivedCallsDuration() {
        System.out.println("""
                empty
                press 01 for call registry
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if (response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void allCallsDuration() {
        System.out.println("""
                empty
                press 01 for call registry
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void lastCallDuration() {
        System.out.println("""
                empty
                press 01 for call registry
                press 02 for main menu""");
        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else {
            mainMenu();
        }
    }

    public void eraseRecentCallLists() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void dialledNumbers() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void receivedCalls() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void missedCalls() {
        System.out.println("""
                empty
                press 01 for call register
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            callRegister();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void chat() {
        System.out.println("""
                empty
                press 01 for chat
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            chat();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void message() {
        System.out.println("""
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture message
                5 -> Template
                6 -> Smileys
                7 -> Message settings
                """);
        int response = scanner.nextInt();
        if(response == 1){
            writeMessage();
        }
        if(response == 2){
            inbox();

        }
        if (response == 3){
            outbox();
        }
        if (response == 4){
            pictureMessage();
        }
        if (response == 5){
            template();
        }
        if(response == 6){
            smileys();
        }
        if(response == 7){
            messageSetting();
        }
        if(response == 8){
            infoService();
        }
        if(response == 9){
            voiceMailboxNumber();
        }
        if(response == 10){
            serviceCommandEditor();
        }
    }

    public void serviceCommandEditor() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void voiceMailboxNumber() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void infoService() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void messageSetting() {
        System.out.println("""
                1->set
                2->common
                """);
        int response = scanner.nextInt();
        if(response == 1){
            set();
        }
        if(response == 2){
            common();
        }
    }

    public void common() {
        System.out.println("""
                1-> Delivery reports
                2-> Reply via same centre
                3-> Character support
                """);
        int response = scanner.nextInt();
        if(response == 1){
            deliveryReports();
        }
        if(response == 2){
            replyViaSameCentre();
        }
        if(response == 3){
            characterSupport();
        }
    }

    public void characterSupport() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    private void replyViaSameCentre() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void deliveryReports() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void set() {
        System.out.println("""
                1-> message centre number
                2-> message sent as
                3-> message validity
                """);
        int response = scanner.nextInt();
        if(response == 1){
            messageCentreNumber();
        }
        if(response == 2){
            messageSentAs();
        }
        if (response == 3){
            messageValidity();
        }
    }

    public void messageValidity() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void messageSentAs() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void messageCentreNumber() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void smileys() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void template() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void pictureMessage() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void outbox() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void inbox() {
        System.out.println("""
                empty
                press 01 message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void writeMessage() {
        System.out.println("""
                empty
                press 01 for message
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            message();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void phoneBook() {
        System.out.println("""
                        1 -> Search
                        2 -> Services Nos.
                        3 -> Add name
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign tone
                        7 -> Send b'card
                        8 -> Options 
                        9 -> Speed dial
                        10 -> Voice tags """);
        int response = scanner.nextInt();
        if (response == 1){
            search();
        }
        if(response == 2){
            servicceNos();
        }
        if (response == 3){
            addName();
        }
        if(response == 4){
            erase();

        }
        if(response == 5){
            edit();
        }
        if(response == 6){
            assignTone();
        }
        if(response == 7){
            sendBCard();
        }
        if (response == 8){
            options();
        }
        if(response == 9){
            speedDial();
        }
        if(response == 10){
            voiceTag();
        }
    }

    public void voiceTag() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void speedDial() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void options() {
        System.out.println("""
                1. Type of view
                2. Memory status
                """);
        int response = scanner.nextInt();
        if(response == 1){
            typeOfView();
        }
        if(response == 2){
            memoryStatus();

        }
    }

    public void memoryStatus() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void typeOfView() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void sendBCard() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void assignTone() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void edit() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void erase() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void addName() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu""");

        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void servicceNos() {
        System.out.println("""
                empty
                press 01 for phone book
                press 02 for main menu
                """);
        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void search() {
        System.out.println("""
               empty 
               press 01 for phone book
               press 02 for main menu
               """);
        int response = scanner.nextInt();
        if(response == 01){
            phoneBook();
        }
        if(response == 02){
           mainMenu();
        }else{
            mainMenu();
        }



    }



}