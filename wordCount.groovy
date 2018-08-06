/*Word count*/

//
//import groovy.xml.MarkupBuilder
//
//if(!(args.size() in 1..2)){
//    println "Incorrect number of arguments"
//    println()
//    println "USAGE: textAnalyzer TEXTFILE (STRING)"
//    System.exit 1
//}
//
//def content = new File(args[0]).text
//def charCount = content.size()
//def wordCount = content.split(/\W+/).size()
//
//def stringCount
//if(args.size()==2){
//    stringCount = content.count(args[1])
//}
//
//println "Characters: "+padRight(15) + charCount;
//println "Words: "+padRight(15) + wordCount;







/*Reading files*/

//import java.io.File
//class Example{
//    static void main(String[] args){
//        new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/textAnalyzer.txt")
//        .eachLine{
//            line -> println "line : $line";
//        }
//    }
//}

/*Reading files*/

//import java.io.File
//class Example{
//    static void main(String[] args){
//        new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt")
//        .eachLine{
//            line -> println "line : $line";
//        }
//    }
//}


/*Reading the Contents of a File as an Entire String
*/

//class Example {
//    static void main(String[] args){
//
//        File file = new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt")
//        println file.text
//    }
//}
//

/*Getting the Size of a File*/

//class Example{
//    static void main(String[] args){
//        File file = new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt");
//            println "The file ${file.absolutePath} has ${file.length()} bytes"
//    }
//
//}

/*Testing if a File is a Directory
*/

//class Example{
//    static void main(String[] args){
//        File file = new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt");
//        println "File? ${file.isFile()}"
//        println "Directory? ${file.isDirectory()}"
//    }
//}


/*Testing if a File is a Directory
*/
//
//class Example{
//    static void main(String[] args){
//        File file = new File("F:/");
//        println "File? ${file.isFile()}"
//        println "Directory? ${file.isDirectory()}"
//    }
//}

/*Creating a Directory*/

//class Example{
//    static void main(String[] args){
//        File file = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/ExampleDirectory1');
//        file.mkdir()
//    }
//}


/*Deleting a Directory*/

//class Example{
//    static void main(String[] args){
//        File file = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/ExampleDirectory2');
//        file.delete()
//    }
//}



/*Copying files*/
//
//class Example{
//    static void main(String[] args){
//        def src = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt')
//        def dst = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/ExampleFileTo.txt')
//        dst << src.text
//    }
//}

///*Getting Directory Contents*/
//
//class Example{
//    static void main(String[] args){
//        def rootFiles = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt')
//                    .listRoots()
//        rootFiles.each{
//            file -> println file.absolutePath
//        }
//    }
//}


/*Getting Directory Contents*/

class Example{
    static void main(String[] args){
        def rootFiles = new File('F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt')
                    .listRoots()
        rootFiles.each{
            file -> println file.absolutePath
        }
    }
}


































































































//
//class Example{
//    static void main(String[] args){
//        File file = new File("F:/OneDrive/Projects/Infoq/Groovy/Groovy-for-Java-Developers/Example.txt");
//    }
//
//}















