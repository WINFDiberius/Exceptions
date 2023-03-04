package org.campus02;

public class ExceptionSyntax {

    public static void main(String[] args) {

        try {
            // TRY BLOCK
            // Fehlerbehebung
            // auf Exception reagieren

            doSomething();
        }
        catch (Exception e){
            // CATCH BLOCK:
            // Fehlerbehebung
            // auf Exception reagieren


        }

        finally{
            // wird auf jeden Fall ausgeführt

        }



    }

    public static void doSomething() throws Exception{
        // programmcode der exception werfen könnte
        doSomethingElse();
    }

    public static void doSomethingElse() throws Exception{
        // Code
        // wirft Exception

        // mittels throw kann exception geworfen werden
        throw new Exception();
    }

}
