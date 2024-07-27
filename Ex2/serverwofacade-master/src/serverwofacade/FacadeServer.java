/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author DoubleX
 */
public class FacadeServer {
    private static FacadeServer myFacadeObj = null;
    private ScheduleServer obj;
        private FacadeServer() {
            obj = new ScheduleServer();
        }
        public static FacadeServer getMyFacadeObject() {
            if (myFacadeObj == null) {
                myFacadeObj = new FacadeServer();
            } 
            return myFacadeObj;
        }
        public void startServer() {  
            obj.startBooting();
            obj.readSystemConfigFile();
            obj.init();
            obj.initializeContext();
            obj.initializeListeners();
            obj.createSystemObjects();
            System.out.println("Start working......");
        }
        public void endServer(){
            System.out.println("After work done.........");
            obj.releaseProcesses();
            obj.destory();
            obj.destroySystemObjects();
            obj.destoryListeners();
            obj.destoryContext();
            obj.shutdown();
        }
    
}
