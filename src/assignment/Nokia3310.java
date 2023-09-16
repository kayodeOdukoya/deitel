package assignment;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                list of menu functions
                press 
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
                13 -> SIM services
                
           
                
                """);
        int nokia = scanner.nextInt();

        switch (nokia) {
            case 1:
                System.out.println("Phone book");
                System.out.println("""
                        for phone book
                        1 -> Search
                        2 -> Services Nos.
                        3 -> Add name
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign tone
                        7 -> Send b'card
                        8 -> Options 
                        9 -> Speed dial
                        10 -> Voice tags 
                        """);
                int typeOfView = scanner.nextInt();
                switch (typeOfView) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("""
                                for Options
                                1-> Type of view
                                2 -> Memory status
                                """);
                        int options = scanner.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed dial");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;

                }
             }
                switch (nokia){
                    case 2:
                        System.out.println("Message");
                        System.out.println("""
                                for Message
                                1 -> Write messages
                                2 -> Inbox
                                3 -> Outbox
                                4 -> Picture message
                                5 -> Template
                                6 -> Smileys
                                7 -> Message settings
                                """);
                     int message = scanner.nextInt();
                     switch (message) {
                         case 1:
                             System.out.println("Write message");
                             break;
                         case 2:
                             System.out.println("Inbox");
                             break;
                         case 3:
                             System.out.println("Outbox");
                             break;
                         case 4:
                             System.out.println("Picture message");
                             break;
                         case 5:
                             System.out.println("Template");
                             break;
                         case 6:
                             System.out.println("Smileys");
                             break;
                         case 7:
                             System.out.println("Message settings");
                             System.out.println("""
                                     for settings:
                                     1 -> Set 1
                                     2 -> Common
                                     """);
                             int setttings = scanner.nextInt();
                             switch (setttings) {
                                 case 1:
                                     System.out.println("Set 1");
                                     System.out.println("""
                                             for set 1
                                             1 -> Message centre number
                                             2 -> Message sent as
                                             3 -> Message validity
                                             """);
                                     int setInput = scanner.nextInt();
                                     switch (setInput) {
                                         case 1:
                                             System.out.println("Message centre number");
                                             break;
                                         case 2:
                                             System.out.println("Message sent as");
                                             break;
                                         case 3:
                                             System.out.println("Message validity");
                                             break;
                                     }
                                 case 2:
                                     System.out.println("Common");
                                     System.out.println("""
                                             for common:
                                             1 -> Delivery reports
                                             2 -> Reply via same centre
                                             3 -> Character support
                                             """);
                                     int common = scanner.nextInt();
                                     switch (common) {
                                         case 1:
                                             System.out.println("Delivery Report");
                                             break;
                                         case 2:
                                             System.out.println("Reply via same centre");
                                             break;
                                         case 3:
                                             System.out.println("Character support");
                                             break;
                                     }
                             }
                             break;
                         case 8:
                             System.out.println("Info service");
                             break;
                         case 9:
                             System.out.println("Voice mailbox number");
                             break;
                         case 10:
                             System.out.println("Service command editor");
                             break;
                     }
                     }

                    switch (nokia){
                         case 3:
                             System.out.println("Chat");
                             break;
                     }


                    switch (nokia){
                        case 4:
                        System.out.println("Call Register");
                            System.out.println("""
                                    for call register
                                    1 -> Missed calls
                                    2 -> Received calls
                                    3 -> Dialled numbers
                                    4 -> Erase recent call history
                                    5 -> Show call duration
                                    6 -> Show cal; cost
                                    7 -> Call cost settings
                                    8 -> Prepaid credit
                                    """);

                        int showCallDuration = scanner.nextInt();
                        switch (showCallDuration) {
                            case 1:
                                System.out.println("Missed calls");
                                break;
                            case 2:
                                System.out.println("Received calls");
                                break;
                            case 3:
                                System.out.println("Dialled numbers");
                                break;
                            case 4:
                                System.out.println("Erase recent call list");
                                break;
                                case 5:
                                System.out.println("Show call duration");
                                System.out.println("""
                                        forcallduration
                                        1 -> Last call duration
                                        2 -> All calls duration
                                        3 -> Received call duration
                                        4 -> Dialled callls duration
                                        5 -> Clear timers
                                        """);
                                int lastCallDuration = scanner.nextInt();
                                switch (lastCallDuration) {
                                    case 1:
                                        System.out.println("Last call duration");
                                        break;
                                    case 2:
                                        System.out.println("All calls duration");
                                        break;
                                    case 3:
                                        System.out.println("Received calls duration");
                                        break;
                                    case 4:
                                        System.out.println("Dialled calls duration");
                                        break;
                                    case 5:
                                        System.out.println("Clear timers");
                                        break;
                                }
                                break;
                                    case 6:
                                        System.out.println("Show call cost");
                                        System.out.println("""
                                                for show call cost
                                                1 -> Last call cost
                                                2 -> All calls cost
                                                3 -> Clear counters
                                                """);
                                    int costSettings = scanner.nextInt();
                                    switch (costSettings) {
                                        case 1:
                                            System.out.println("Last call cost");
                                            break;
                                        case 2:
                                            System.out.println("All call cost");
                                            break;
                                        case 3:
                                            System.out.println("Clear counters");
                                            break;
                                    }
                                    break;
                                        case 7:
                                            System.out.println("Call cost settings");
                                            System.out.println("""
                                                    for call cost settings
                                                    1 -> call cost limit
                                                    2 -> Show costs in
                                                    """);
                                     int callSettings = scanner.nextInt();
                                     switch (callSettings){
                                         case 1:
                                             System.out.println("Call cost settings");
                                             break;
                                         case 2:
                                             System.out.println("Show costs in");
                                             break;
                                     }
                                     break;
                                        case 8:
                                            System.out.println("Prepaid credit");
                                    }
                                }
                                switch (nokia){
                                    case 5:
                                        System.out.println("Tones");
                                        System.out.println("""
                                                for Tones
                                                1 -> Ring Tone
                                                2 -> Ring Volume
                                                3 -> Incoming call alert
                                                4 -> Composer
                                                5 -> Message alert tone
                                                6 -> Leypad tones
                                                7 -> Warning and game tones
                                                8 -> Vibrate alert
                                                9 -> Screen saver
               
                                                """);
                                        int ringingTone = scanner.nextInt();
                                        switch (ringingTone){
                                            case 1:
                                                System.out.println("Ring Tone");
                                                break;
                                            case 2:
                                                System.out.println("Ring Volume");
                                                break;
                                            case 3:
                                                System.out.println("Incoming call alert");
                                                break;
                                            case 4:
                                                System.out.println("Composer");
                                                break;
                                            case 5:
                                                System.out.println("Message alert tone");
                                                break;
                                            case 6:
                                                System.out.println("Vibrate alert");
                                                break;
                                            case 7:
                                                System.out.println("Screen saver");
                                                break;
                                        }
                                      }
                                      switch (nokia) {
                                          case 6:
                                              System.out.println("Setting");
                                              System.out.println("""
                                                      for settings
                                                      1 -> Call settings
                                                      2 -> Phone settings
                                                      3 -> Security settings
                                                      4 -> Restore factory settings
                                                                                                      
                                                      """);
                                              int settings = scanner.nextInt();
                                              switch (settings) {
                                                  case 1:
                                                      System.out.println("Call settings");
                                                      System.out.println("""
                                                              for call settings
                                                              1 -> Automatic redial
                                                              2 -> Speed dialling
                                                              3 -> Call waiting options
                                                              4 -> Own number sending
                                                              5 -> Phone line in use
                                                              6 -> Automatic answer
                                                              """);
                                                      int autoRedial = scanner.nextInt();
                                                      switch (autoRedial) {
                                                          case 1:
                                                              System.out.println("Automatic redial");
                                                              break;
                                                          case 2:
                                                              System.out.println("Speed dialling");
                                                              break;
                                                          case 3:
                                                              System.out.println("Call waiting options");
                                                              break;
                                                          case 4:
                                                              System.out.println("Own number sending");
                                                              break;
                                                          case 5:
                                                              System.out.println("Phone line in use");
                                                              break;
                                                          case 6:
                                                              System.out.println("Automatic answer");
                                                              break;

                                                      }
                                                      break;
                                                  case 2:
                                                      System.out.println("Phone settings");
                                                      System.out.println("""
                                                              for phone settings
                                                              1 -> Language
                                                              2 -> Cell info display
                                                              3 -> Welcome note
                                                              4 -> Network selection
                                                              5 -> Lights
                                                              6 -> Confirm SIM service actions
                                                              """);
                                                      int language = scanner.nextInt();
                                                      switch (language) {
                                                          case 1:
                                                              System.out.println("Language");
                                                              break;
                                                          case 2:
                                                              System.out.println("Cell info display");
                                                              break;
                                                          case 3:
                                                              System.out.println("Welcome note");
                                                              break;
                                                          case 4:
                                                              System.out.println("Network selection");
                                                              break;
                                                          case 5:
                                                              System.out.println("Lights");
                                                              break;
                                                          case 6:
                                                              System.out.println("Confirm SIM service actions");
                                                              break;
                                                      }
                                                      break;
                                                  case 3:
                                                      System.out.println("Security settings");
                                                      System.out.println("""
                                                              for security settings
                                                              1 -> PIN code request
                                                              2 -> Call bearing service
                                                              3 -> Fixed dialling
                                                              4 -> Closed user group
                                                              5 -> Phone security
                                                              6 -> Change access codes
                                                                                                                                    
                                                              """);
                                                      int securitySettings = scanner.nextInt();
                                                      switch (securitySettings) {
                                                          case 1:
                                                              System.out.println("PIN code request");
                                                              break;
                                                          case 2:
                                                              System.out.println("Call bearing service");
                                                              break;
                                                          case 3:
                                                              System.out.println("Fixed dialling");
                                                              break;
                                                          case 4:
                                                              System.out.println("Closed user group");
                                                              break;
                                                          case 5:
                                                              System.out.println("Phone security");
                                                              break;
                                                          case 6:
                                                              System.out.println("Change access codes");
                                                              break;
                                                      }
                                                      break;
                                                  case 4:
                                                      System.out.println("Restore factory settings");
                                                      break;
                                              }
                                              }
                                              switch (nokia){
                                                  case 7:
                                                      System.out.println("Call divert");
                                                      break;
                                              }

                                              switch (nokia){
                                                  case 8:
                                                  System.out.println("Games");
                                                  break;
                                              }
                                              switch (nokia){
                                                  case 9:
                                                      System.out.println("Calculator");
                                                      break;
                                              }
                                               switch (nokia){
                                                   case 10:
                                                       System.out.println("Reminder");
                                                       break;
                                               }

                                               switch (nokia){
                                                   case 11:
                                                       System.out.println("Clock");
                                                       System.out.println("""
                                                               for clock
                                                               1 -> Alarm clock
                                                               2 -> Clock settings
                                                               3 -> Date settings
                                                               4 -> Stopwatch
                                                               5 -> Countdown timer
                                                               6 -> Auto update of date and time
                                                               
                                                               """);
                                                       int clock = scanner.nextInt();
                                                       switch (clock){
                                                           case 1:
                                                               System.out.println("Alarm clock");
                                                               break;
                                                           case 2:
                                                               System.out.println("Clock settings");
                                                               break;
                                                           case 3:
                                                               System.out.println("Date settings");
                                                               break;
                                                           case 4:
                                                               System.out.println("Stopwatch");
                                                               break;
                                                           case 5:
                                                               System.out.println("Countdown timer");
                                                               break;
                                                           case 6:
                                                               System.out.println("Auto update of date and time");
                                                               break;
                                                       }
                                                       switch (nokia){
                                                           case 12:
                                                               System.out.println("Profiles");
                                                               break;
                                                       }
                                                       switch (nokia){
                                                           case 13:
                                                               System.out.println("SIM services");
                                                       }
                                               }
                       }
   }



