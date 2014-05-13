package de.ostfalia.swt.aufgabe7;

import java.io.File;
/**
 * Created by loeb on 13.05.14.
 */
public class Creator {
        /**
        * Erzeugt im Verzeichnis workingDir die Klasse className
        * mit der Klassendefinition classDefinition .
        *
        * @param workingDir Das Verzeichnis
        * @param className Der voll qualifizierte Klassenname
        * @param classDefinition Die Definition der Klasse
        * @return Die erzeugte Datei
        * @throws Exception
        */
        public File createClassFile ( File workingDir , String className ,
                                      String classDefinition ) throws Exception {
            String path = workingDir + className + ".class";
            File out = new File(path);

            // ClassHeader

            // ClassDefinition

            return out;
        }

        /**
        * Compiliert die in classFile uebergebene Klasse
        *
        * @param classFile
        * @return true , falls Compilation erfolgreich
        */
        public boolean compileClassFile ( File classFile ) {


            return false;
         }

}
